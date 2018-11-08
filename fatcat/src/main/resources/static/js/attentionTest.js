$(document).ready(function () {
    $("#testButton").click(function () {
        $.ajax({
            type:'POST',
            url:'news/attention',
            data:{newsId:5},
            success: function(){
                alert("收藏成功")
            },
            error: function(jqXHR){
                alert("error！"+JSON.stringify(jqXHR));
                console.log(JSON.stringify(jqXHR));
            }
        })
    })
})