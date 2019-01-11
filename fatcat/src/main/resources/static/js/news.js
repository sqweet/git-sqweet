$(document).ready(function() {

    $.ajax({
        url:'news',
        type:'POST',

        success:function(data){
            $("#nTitle").text(data.title);
            $("#content1").text(data.content1);
            $("#newsPic1").css("background-image","url("+data.img1+")");
            $("#newsPic2").css("background-image","url("+data.img2+")");
            $("#newsPic3").css("background-image","url("+data.img3+")");
            $("#content2").text(data.content2);
            $("#content3").text(data.content3);
            // alert(data.comments);
            var comments = "";
            for(var i=0;i<data.comments.length;i++){
                var user = "<p class='user'>"+data.comments[i].user+"</p>"
                var time = "<p class='time'>"+data.comments[i].time+"</p>"
                var content = "<p class='cmContent'>"+data.comments[i].content+"</p>"
                comments = "<hr>"+comments+user+time+content+"<hr>";

            }
            $("#comment").html(comments);

        },
        error:function (jqXHR) {
            alert("error！"+JSON.stringify(jqXHR));
            console.log(JSON.stringify(jqXHR));
        }

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