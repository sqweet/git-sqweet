$(document).ready(function () {
    $("#login").click(function () {
        $.ajax({
            url:'login/validate',
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