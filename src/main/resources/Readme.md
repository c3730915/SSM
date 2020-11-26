##Readme
##那些年我们踩过的坑
- 数据库驱动connector要用8.0
- 数据库连接的时候需要传入时间参数，不然会报错
- mysql8.0以上使用了一种新的ssl加密，需要在连接的时候传入参数useSSL=false
- 刚开始servlet映射地址，忘写了一个/ 在WEB-INF最后 servlet标签中
- 要想要前端能够取到数据，需要修改前端的请求页面，把请求为一个jsp改为请求一个servlet映射地址
- 有的时候为了注入bean自动生成的setter函数很有可能没有代码，如果不加，this.set xxx 会导致注入出错，即使使用Autowried也会出错
- 开启js需要在jsp页面头加入isIgnored = false 不然el表达式无法使用
- 在配置前缀的时候，一定要使用/content/ 这样的形式，注意要有两个/ 不然会404

##项目说明
练习学习ssm框架所搭建的小项目
