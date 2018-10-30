window.onload=function(){
    var images=["img/1.jpeg","img/2.jpeg","img/4.jpeg","img/5.jpeg"];
    var news=document.getElementById("news");
    news.style.background="url('img/1.jpeg')";
    var i=1;
    function duration() {
        news.style.background="url("+images[i]+")";
        i++;
        i=i%4;
    }
        setInterval(duration,3500)
}
function pic1(){
    news.style.background="url('img/1.jpeg')";
    i=1;
}
function pic1(){
    news.style.background="url('img/1.jpeg')";
    i=1;
}
function pic1(){
    news.style.background="url('img/1.jpeg')";
    i=1;
}
function pic1(){
    news.style.background="url('img/1.jpeg')";
    i=1;
}