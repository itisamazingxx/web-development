## Base

1. base标签是HTML语言中的基准网址标记, 是一个单标签, 位于网页头部的head标签内
2. 一个页面最多只能使用一个base元素, 用来提供一个指定的默认目标

## Session  (Cookie)
1. 发生在浏览器和服务器之间(Browser & Server)
2. 不同的浏览器会产生不同的Cookie

**什么是会话？**
```markdown
会话可简单理解为:
用户打开一个浏览器, 点击多个超链接, 访问服务器多个web资源
然后关闭浏览器, 整个过程称之为一个会话
```
```markdown
每个用户在使用浏览器与服务器进行会话的过程中, 不可避免的各自会产生一些数据
服务器要想办法为每个用户保存这些数据
```

### Cookie流程
1. 服务器/Tomcat
```Java
// 创建Cookie对象
Cookie cookie = new Cookie("k1", "v1");
```
2. 浏览器接收到http响应, 解析Cookie并把k1, v1保存在浏览器本地