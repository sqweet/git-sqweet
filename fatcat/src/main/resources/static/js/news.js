$(document).ready(function() {
    var newsId = 1;
    $.ajax({
        url:'news',
        type:'POST',

        success:function(data){
            newsId = data.newsId;
            $("#nTitle").text(data.title);
            $("#content1").text(data.content1);
            $("#newsPic1").css("background-image","url("+data.img1+")");
            $("#newsPic2").css("background-image","url("+data.img2+")");
            $("#newsPic3").css("background-image","url("+data.img3+")");
            $("#content2").text(data.content2);
            $("#content3").text(data.content3);

            var comments = "<hr><h2>评论</h2><hr>";
            for(var i=0;i<data.comments.length;i++){
                var user = "<p class='user'>"+data.comments[i].user+"</p>"
                var time = "<p class='time'>"+data.comments[i].time+"</p>"
                var content = "<p class='cmContent'>"+data.comments[i].content+"</p>"
                comments = comments+user+time+content+"<hr>";

            }
            $("#comment").html(comments);
            var addCm = "请登录后评论";
            if(data.isLogin){
                addCm = "<input type=\"text\" id=\"cmInput\" class=\"col-md-4\" placeholder=\"发表一下看法吧\">\n" +
                    "        <input type=\"button\" id=\"cmButton\" class=\"col-md-1\" value=\"发布\">";
            }
            $("#write").html(addCm);
        },
        error:function (jqXHR) {
            alert("error！"+JSON.stringify(jqXHR));
            console.log(JSON.stringify(jqXHR));
        }

    })

    $("#cmButton").click(function () {
        $.ajax({
            url:'news/publish',
            data:{content:$("#cmInput").val(),news:newsId},
            type:'POST',
            success(){
                window.location.reload();
            },
            error:function (jqXHR) {
                alert("error！"+JSON.stringify(jqXHR));
                console.log(JSON.stringify(jqXHR));
            }
        })
    })
})

var status=false;
var app=new Vue({
    el: '#clickLike',
    data: function () {
        return {
            img:'img/like.png',
            img1:'img/save.png',
            status: false
        }
    },
    methods: {
        hover:function () {
            this.status=!this.status;
            console.log(this.status);
            if (this.status) {
                this.img='img/like_hover.png'
            }
            else
                this.img='img/like.png'
        },
        hover1:function () {
            this.status=!this.status;
            console.log(this.status);
            if (this.status) {
                this.img1='img/save_hover.png'
            }
            else
                this.img1='img/save.png'
        }
    }
})