$(document).ready(function () {
    $.ajax({
        url:'/news',
        type:'POST',
        success(data){
            $("#newsId").val(data.newsId);
            $("#newsTitle").val(data.title);
            $("#content1").text(data.content1);
            $("#content2").text(data.content2);
            $("#content3").text(data.content3);
            $("#img1").text(data.img1);
            $("#img2").text(data.img2);
            $("#img3").text(data.img3);
            $("#reporter").val(data.reporter);
            $("#type").val(data.type);
        },
        error:function (jqXHR) {
            alert("error！"+JSON.stringify(jqXHR));
            console.log(JSON.stringify(jqXHR));
        }
    })
})