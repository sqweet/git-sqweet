$(document).ready(function() {
    alert("hello");
    $.ajax({
        url:'news',
        type:'POST',
        data:{id:2},
        success:function(data){
            alert(data.content1);
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