var i=0;
var images=["img/1.jpeg","img/2.jpeg","img/3.jpeg","img/4.jpeg","img/5.jpeg"];//主页新闻数组
$(document).ready(function(){
    $("#left").hide();//隐藏左右按钮
    $("#right").hide();
    var news=document.getElementById("news");
    news.style.background="url('img/1.jpeg')";
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

})
function lastNews(){//上一条
    var news=document.getElementById("news");
    i--;
    if(i<0)
        i=4;
    news.style.background="url("+images[i]+")";
}
function nextNews(){//下一条
    var news=document.getElementById("news");
    i++;
    if(i>4)
        i=0;
    news.style.background="url("+images[i]+")";
}