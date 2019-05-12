//试题界面

//加载页面
$(document).ready(function (){
    $("#p9").css('display','none');//隐藏
    seekAll();
});

function seekQuestion() {
    $("#mytab").text("");
    var selectQuestion = $("#selectQuestion").val();
    var selectSubject = $("#selectSubject").val();
    var data = {    "selectQuestion":selectQuestion,
                    "selectSubject":selectSubject,
                };
    if((selectQuestion == null||selectQuestion == "")&&(selectSubject == null||selectSubject == "")){
        seekAll();
    }else {
        $.ajax({
            url: "seekQuestion.action",
            type: "post",
            data: JSON.stringify(data),
            contentType:"application/json",
            dataType: "json",
            success: function (data) {
                var dataObj = eval(data);//json为接收的后台返回的数据；
                var $tab1 = $("#mytab");
                for (i = 0; i < dataObj.length; i++) {
                    $("#mytab").append("<tr><td>"+dataObj[i].id+"</td>" +
                        "<td>"+dataObj[i].question+"</td>" +
                        "<td>"+dataObj[i].answer+"</td>" +
                        "<td>"+dataObj[i].optionA+"</td>" +
                        "<td>"+dataObj[i].optionB+"</td>" +
                        "<td>"+dataObj[i].optionC+"</td>" +
                        "<td>"+dataObj[i].optionD+"</td>" +
                        "<td>"+dataObj[i].subject+"</td>" +
                        "<td>"+dataObj[i].book+"</td>" +
                        "<td>"+dataObj[i].chapter+"</td>" +
                        "<td>"+"&nbsp;<button class=\"layui-btn\" onclick=\"addQuestion()\">修改</button>&nbsp;" +
                        "<button class=\"layui-btn layui-btn-warm\" onclick=\"addQuestion()\">删除</button>"+"</td></tr>");
                }
            },
            error: function () {
                alert("error");
            }
        });
    }
}


//查询所有试题
function seekAll() {
    $("#mytab").text("");
    $.ajax({
        url: "seekAll.action",
        type: "post",
        dataType: "json",
        success: function (data) {
            var dataObj = eval(data);//json为接收的后台返回的数据；
            var $tab1 = $("#mytab");
            for (i = 0; i < dataObj.length; i++) {
                $("#mytab").append("<tr><td>"+dataObj[i].id+"</td>" +
                                   "<td>"+dataObj[i].question+"</td>" +
                                "<td>"+dataObj[i].answer+"</td>" +
                                "<td>"+dataObj[i].optionA+"</td>" +
                                "<td>"+dataObj[i].optionB+"</td>" +
                                "<td>"+dataObj[i].optionC+"</td>" +
                                "<td>"+dataObj[i].optionD+"</td>" +
                                "<td>"+dataObj[i].subject+"</td>" +
                                "<td>"+dataObj[i].book+"</td>" +
                                "<td>"+dataObj[i].chapter+"</td>" +
                                "<td>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button class=\"layui-btn\" onclick=\"updateQuestion()\">修改</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
                                "<button class=\"layui-btn layui-btn-warm\" onclick=\"deleQuestion()\">删除</button>"+"</td></tr>");
            }
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
        },
        error: function () {
            alert("error");
        }
    });
}

//修改题目
function updateQuestion() {

}