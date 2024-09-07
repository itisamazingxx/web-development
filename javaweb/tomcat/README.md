# Tomcat
1. tomcat的本质就是java程序, 他可以处理来自浏览器的http请求
2. 启动后默认连接http://localhost:8080/

## 目录结构
config下
1. server.xml用于配置tomcat的基本设置(启动端口, 关闭端口, 主机名)
2. web.xml用于指定tomcat运行时配置(servlet..)
3. 在webapp文件下添加新的目录, 可以直接从监听的端口访问

    新建test/test.html
    
    可通过http://8080/test/test.html访问
    