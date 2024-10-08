import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 演示如何手动创建web服务器连接html与浏览器
 */
public class MyTomcat {

    public static void main(String[] args) throws IOException {
        // 1. 监听9999端口, 等待连接
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Listened to 9999...");
        while (!serverSocket.isClosed()) {
            // 2. 连接成功后返回socket
            Socket socket = serverSocket.accept();
            // 3. 通过socket得到输出流, 准备返回
            try (OutputStream outputStream = socket.getOutputStream();
                 BufferedReader bufferedReader = new BufferedReader(new FileReader("src/hello.html"))) {

                // 发送HTTP响应头
                outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
                outputStream.write("Content-Type: text/html; charset=UTF-8\r\n".getBytes());
                outputStream.write("\r\n".getBytes());

                // 发送HTML文件内容
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    outputStream.write(line.getBytes());
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                socket.close();
            }
        }
        serverSocket.close();
    }

}
