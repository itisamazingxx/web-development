# Servlet
1. servlet是SpringMVC的基石
2. 3.0版本以后支持注解, 同时支持web.xml配置
3. servlet是被tomcat调用的
4. **主要职责是处理HTTP请求, 并生成HTTP响应**

### 浏览器第一次请求Servlet流程
1. 查询web.xml
2. 查看请求资源在web.xml下对应的url-pattern
3. 如果找到url-pattern, 就会得到servlet-name
4. Tomcat维护了一个<id, servlet>, 查询该hashmap, 看看有没有servlet实例
5. 根据servlet-name得到servlet-class(全路径)
6. 利用反射将servlet实例化

### Servlet生命周期

#### 处理浏览器请求阶段
1. 每收到一个http请求, 服务器就会产生一个新的线程去处理

#### GET/POST请求的分发处理
