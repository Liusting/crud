<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>首页登陆</title>
</head>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<script type="text/javascript" src="/crud/static/js/jquery-1.12.4.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<style type="text/css">
    #login {
        width: 450px;
        height: 100px;
        margin: 126px auto;
    }

    #btn {
        margin-left: 100px;
        margin-top: -25px;
        width: 120px;
        height: 25px;
        font-size: 11px;
    }

    body {
        background-color: #ecfcf9;
    }
</style>
</head>
<script type="text/javascript">
    var InterValObj; //timer变量，控制时间
    var count = 60; //间隔函数，1秒执行
    var curCount;//当前剩余秒数

    function sendMessage() {
        curCount = count;
        $("#btn").attr("disabled", "true");
        $("#btn").val(curCount + "秒后可重新发送");
        InterValObj = window.setInterval(SetRemainTime, 1000); //启动计时器，1秒执行一次请求后台发送验证码 TODO
    }
    //timer处理函数
    function SetRemainTime() {
        if (curCount == 0) {
            window.clearInterval(InterValObj);//停止计时器
            $("#btn").removeAttr("disabled");//启用按钮
            $("#btn").val("重新发送验证码");
        } else {
            curCount--;
            $("#btn").val(curCount + "秒后可重新发送");
        }
    }
</script>

<body>
<div class="container">
    <div id="login">
        <fieldset>
            <div id="legend" class="">
                <legend class="">用户登录</legend>
            </div>
            <form class="form-horizontal" role="form">

                <div class="form-group"> <label class="col-sm-2 control-label">账号</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" id="account" name="account_name" placeholder="请输入您的账号" >
                    </div>
                </div>
                <div class="form-group"> <label class="col-sm-2 control-label">密码</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" id="password" name="password_name" placeholder="请输入您的密码" >
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="button" class="btn btn-success" id="login">登录</button>
                        <button type="button" class="btn btn-info" id="register">注册</button>
                    </div>
                </div>

            </form>
        </fieldset>
    </div>
</div>
</body>

<script type="text/javascript">
    $("#login").click(function() {
        var account = $("#account").val();
        var password = $("#password").val();
        console.log(account);
        console.log(password);
        if (account == ""&&password == "") {
            alert("用户名或密码不能为空，请重新输入！");
        } 
    });
</script>

</html>
