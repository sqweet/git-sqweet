window.onload=function(){
    var images=["img/1.jpeg","img/2.jpeg","img/3.jpg","img/4.jpeg","img/5.jpeg"];
    var news=document.getElementById("news");
    news.style.background="url('img/1.jpeg')";
    var i=1;
    function duration() {
        news.style.background="url("+images[i]+")";
        i++;
        i=i%5;
    }
        setInterval(duration,3500)
}
function pic1(){
    news.style.background="url('img/1.jpeg')";
    i=1;
}
function pic2(){
    news.style.background="url('img/2.jpeg')";
    i=2;
}
function pic3(){
    news.style.background="url('img/3.jpg')";
    i=3;
}
function pic4(){
    news.style.background="url('img/4.jpeg')";
    i=4;
}
function pic5(){
    news.style.background="url('img/5.jpeg')";
    i=5;
}