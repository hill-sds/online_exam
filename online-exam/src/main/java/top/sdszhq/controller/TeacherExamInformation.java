package top.sdszhq.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.sdszhq.pojo.Exam;
import top.sdszhq.pojo.ExamInformation;
import top.sdszhq.pojo.Question;
import top.sdszhq.service.TeacherExamInformationService;
import top.sdszhq.service.TeacherExamService;
import top.sdszhq.utils.CookieUtil;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class TeacherExamInformation {
    @Autowired
    public TeacherExamInformationService tei;

    @ResponseBody
    @RequestMapping(value = "/html/addExamInformation.action",produces = "application/json; charset=utf-8")
    public String addQuestion(@RequestBody Map<String,String> map, HttpServletRequest request) {
        String name = map.get("name");
        String subject = map.get("subject");
        String score = map.get("score");
        String examId = map.get("examId");
        String examCode = map.get("examCode");//examDate
        String examDate = map.get("examDate");
        String person = CookieUtil.getCookie(request,"name");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String createDate = df.format(new Date());
        String exam = examId.substring(0,1);
        ExamInformation ei = new ExamInformation(name,createDate,exam,score,examCode,person,subject,examDate);
        tei.addExamInformation(ei);
        List<Question> list = new ArrayList<>();
        return new Gson().toJson(list);
    }

    @ResponseBody
    @RequestMapping(value = "/html/selectExamInformation.action",produces = "application/json; charset=utf-8")
    public String selectExamInformation(@RequestBody Map<String,String> map,HttpServletRequest request) {
        String selectExamInformation = map.get("selectExamInformation");
        List<ExamInformation> list = new ArrayList<>();
        String person = CookieUtil.getCookie(request,"name");
        HashMap map1 = new HashMap();
        map1.put("selectExamInformation",selectExamInformation);
        map1.put("name",person);
        list = tei.findExamInformation(map1);
        return new Gson().toJson(list);
    }
}
