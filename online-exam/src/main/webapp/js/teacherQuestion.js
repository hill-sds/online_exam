//试题界面

//加载页面
$(document).ready(function (){
    $("#p9").css('display','none');//隐藏
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

//添加试题界面显示
function addQuestion() {
    $("#p9").css('display','block');//显示
}

//关闭试题界面显示
function closeQuestion() {
    $("#p9").css('display','none');//显示
}

//添加具体的试题
function addQuestionTitle() {
    var question = $("#question").val();
    var answer = $("input[name='answer']:checked").val();
    var optionA = $("#optionA").val();
    var optionB = $("#optionB").val();
    var optionC = $("#optionC").val();
    var optionD = $("#optionD").val();
    var subject = $("#subject").val();
    var difficulty = $("#difficulty").val();
    var book = $("#book").val();
    var chapter = $("#chapter").val();

    var data = {    "question":question,
                    "answer":answer,
                    "optionA":optionA,
                    "optionB":optionB,
                    "optionC":optionC,
                    "optionD":optionD,
                    "subject":subject,
                    "difficulty":difficulty,
                    "book":book,
                    "chapter":chapter
                 };

    $.ajax({
        url: "addQuestion.action",
        type: "post",
        data: JSON.stringify(data),
        contentType:"application/json",
        dataType: "json",
        success: function (data) {
            $("#p9").css('display','none');//显示
            $.messager.alert('温馨提示','添加成功');
            // var json = eval(data);//json为接收的后台返回的数据；
            // if(json.msg=="no") {
            //     $.messager.alert('温馨提示','该账号已被注册，请换一个账号');
            //     $("#account").textbox('setValue');
            // } else if (json.msg=="yes") {
            //     $.messager.alert('温馨提示','注册成功');
            // }
        },
        error: function () {
            alert("error");
        }
    });
}