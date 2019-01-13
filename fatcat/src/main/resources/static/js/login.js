$(document).ready(function () {
    $("#loginBtn").click(function () {
        $.ajax({
            url:'login/validate',
            type:'POST',
            data:{id:$("#id").val(),password:$("#password").val()},
            success:function(msg){
                alert(msg);
                if("登录成功"==msg){
                    window.location.href = "/";
                }
            },
            error:function (jqXHR) {
                alert("error！"+JSON.stringify(jqXHR));
                console.log(JSON.stringify(jqXHR));
            }

        })
    })
    $("#regiBtn").click(function () {
        $.ajax({
            url:'login/regist',

            type:'POST',
            data:{id:$("#id").val(),password:$("#password").val()},
            success:function(msg){
                alert(msg);
            },
            error:function (jqXHR) {
                alert("error！"+JSON.stringify(jqXHR));
                console.log(JSON.stringify(jqXHR));
            }

        })
    })
})