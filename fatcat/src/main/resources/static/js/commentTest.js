$(document).ready(function () {
    $.ajax({
        url:'news/testComment',
        type:'POST',
        dataType:"json",
        success:function (data) {
            showData(data);
        },
        error:function (jqXHR) {
            alert("error！"+JSON.stringify(jqXHR));
            console.log(JSON.stringify(jqXHR));
        }
    })
})

function showData(data) {
    var str = "";//定义用于拼接的字符串
    for (var i = 0; i < data.length; i++) {
        //拼接表格的行和列
        str = "<tr><td>" + data[i].user + "</td><td>" + data[i].content + "</td></tr>";
        //追加到table中
        $("#tableId").append(str);
    }
}