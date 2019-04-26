//试题界面

//加载页面
$(document).ready(function (){
});

//查询所有试题
function seekAll() {
    alert("开始查找")

    $.ajax({
        url: "seekAll.action",
        type: "post",
        dataType: "json",
        success: function (data) {
            alert("666");
            var json = eval(data);//json为接收的后台返回的数据；
            $.each(json, function (i, n) {
                var row = $("#template").clone();
                row.find("#id").text(n.id);
                row.find("#question").text(n.question);
                row.find("#answer").text(n.answer);
                row.find("#optionA").text(n.optionA);
                row.find("#optionB").text(n.optionB);
                row.find("#optionC").text(n.optionC);
                row.find("#optionD").text(n.optionD);
                row.find("#subject").text(n.subject);
                row.find("#score").text(n.score);
                row.find("#person").text(n.person);
                row.appendTo("#datas");//添加到模板的容器中
            });
        },
        error: function () {
            alert("error");
        }
    });
}

//添加试题
function addQuestion() {
    alert("666");
    $('#win').window('open');
}