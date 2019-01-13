var i=0;
var images=["img/titleNews1.1.jpg","img/titleNews2.1.jpg","img/titleNews3.1.jpg","img/titleNews4.1.jpg","img/titleNews5.1.jpg"];//主页新闻数组
var titleNewsTitles=["1","2","3","4","5"];
$(document).ready(function(){

    var id = 1;
    $("#title1").click(function () {id=1;})
    $("#title2").click(function () {id=2;})
    $("#title3").click(function () {id=3})
    $("#title4").click(function () {id=4})
    $("#titleNewsTitle").click(function () {id=5+i;})
    $.ajax({
        url:'/checkLog',
        type:'POST',
        success(data){
            if(data){
                $("#loginForm").html("<li><a href='/logout' id='logout'>注销</a></li>");
            }
        },
        error:function (jqXHR) {
            alert("error！"+JSON.stringify(jqXHR));
            console.log(JSON.stringify(jqXHR));
        }
    })


    $.ajax({
        url:'/getTitles',
        type:'POST',
        success:function(data){
            $("#title1").text(data[0]);
            $("#title2").text(data[1]);
            $("#title3").text(data[2]);
            $("#title4").text(data[3]);
            titleNewsTitles[0] = data[4];
            $("#titleNewsTitle").text(titleNewsTitles[0]);
            titleNewsTitles[1] = data[5];
            titleNewsTitles[2] = data[6];
            titleNewsTitles[3] = data[7];
            titleNewsTitles[4] = data[8];
        },
        error:function (jqXHR) {
            alert("error！"+JSON.stringify(jqXHR));
            console.log(JSON.stringify(jqXHR));
        }

    })

    $("#left").hide();//隐藏左右按钮
    $("#right").hide();
    var news=document.getElementById("news");
    news.style.background="url('img/titleNews1.1.jpg')";
    news.style.backgroundSize="cover";

    var autoPlayer=setInterval(nextNews,3500);//自动播放

    $("#news").hover(function(){
        $("#left").show();//悬停隐藏按钮
        $("#right").show();
        clearInterval(autoPlayer);//鼠标悬停时暂停自动播放
    }, function(){
        $("#left").hide();//离开显示按钮
        $("#right").hide();
        autoPlayer=setInterval(nextNews,3500);//离开时恢复自动播放
    })




    $(".titles").click(function () {
        $.ajax({
            url:'/newsId',
            type:'POST',
            data:{receivedNewsId:id},
            success(){

            },
            error:function (jqXHR) {
                // alert("error！"+JSON.stringify(jqXHR));
                // console.log(JSON.stringify(jqXHR));
    }

        })
    })

})
function lastNews(){//上一条
    var news=document.getElementById("news");

    i--;
    if(i<0)
        i=4;
    news.style.background="url("+images[i]+")";
    news.style.backgroundSize="cover";
    $("#titleNewsTitle").text(titleNewsTitles[i]);
}
function nextNews(){//下一条
    var news=document.getElementById("news");
    i++;
    if(i>4)
        i=0;
    news.style.background="url("+images[i]+")";
    news.style.backgroundSize="cover";
    $("#titleNewsTitle").text(titleNewsTitles[i]);
}