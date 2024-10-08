# Tomcat
1. tomcat的本质就是java程序, 他可以处理来自浏览器的http请求
2. 进入桌面tobcat下bin目录中的startup.bat, terminal运行
3. 启动后默认连接http://localhost:8080/
4. tomcat启动后需要手动关闭


## 目录结构
config下
1. server.xml用于配置tomcat的基本设置(启动端口, 关闭端口, 主机名)
2. web.xml用于指定tomcat运行时配置(servlet..)
3. 在webapp文件下添加新的目录, 可以直接从监听的端口访问

    新建test/test.html
    
    可通过http://8080/test/test.html访问

## 浏览器请求web服务器资源分析
1. 解析主机名(域名)是为了找到对应的IP地址 这样才能确定要向哪个服务器(tomcat)发送请求
2. 服务器会根据请求的类型返回相应的资源


