<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script>

        
        //定义方法
        function  fun() {
            //使用$.ajax()发送异步请求

            $.ajax({
                url:"ajaxJquery" , // 请求路径
                type:"POST" , //请求方式
                //data: "username=jack&age=23",//请求参数
                data:{"username":"jack","age":23},
                success:function (data) {
                    alert(data);
                },//响应成功后的回调函数
                error:function () {
                    alert("出错啦...")
                },//表示如果请求响应出现错误，会执行的回调函数

                dataType:"text"//设置接受到的响应数据的格式
            });
        }
        
    </script>
    
    
</head>
<body>

    <input type="button" value="发送异步请求" onclick="fun();">

    <input>
</body>
</html>