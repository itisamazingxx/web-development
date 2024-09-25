## CSS
1. Cascading Style Sheet
2. 内容(html)和样式(css)分离, 提高了web开发的效率
3. Most commonly associated with HTML

### css选择器
1. 元素选择器
2. 类选择器(.xxxxx)

    需要在HTML元素的class属性中填写相同的类名来引用这些样式

3. id选择器(#xxxx)

    那么需要在id属性中填写相同的名称
    
    但id是唯一的, 每个id在页面中只能使用一次, 而class可以在多个元素中重复使用

### css使用的三种方式
1. **Inline-styling** (内联样式)

    直接在标签内部进行渲染, 使用style这个attribute

2. **Internal Styling** (内部样式)

    在 HTML文件的<head>标签内使用<style>标签定义样式

3. **External Styling** (外部样式)

    通过<link>标签将外部CSS文件链接到HTML文档中