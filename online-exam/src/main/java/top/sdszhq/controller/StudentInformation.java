package top.sdszhq.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.sdszhq.pojo.Exam;
import top.sdszhq.pojo.ExamResult;
import top.sdszhq.pojo.Question;
import top.sdszhq.service.StudentInformationService;
import top.sdszhq.service.TeacherExamService;
import top.sdszhq.utils.CookieUtil;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class StudentInformation {
    @Autowired
    public StudentInformationService sis;

    @ResponseBody
    @RequestMapping(value = "/html/selectExamRes.action",produces = "application/json; charset=utf-8")
    public String seekQuestion(@RequestBody Map<String,String> map,HttpServletRequest request) {
        String examName = map.get("examName");
        String examSubject = map.get("examSubject");
        String examCode = map.get("examCode");
        String studentAccount = map.get("studentAccount");
        String studentName = map.get("studentName");
        List<ExamResult> list = new ArrayList<>();
        String person = CookieUtil.getCookie(request,"name");
        HashMap map1 = new HashMap();
        map1.put("examName",examName);
        map1.put("examSubject",examSubject);
        map1.put("examCode",examCode);
        map1.put("studentAccount",studentAccount);
        map1.put("studentName",studentName);
        map1.put("name",person);
        list = sis.findExamResult(map1);
        return new Gson().toJson(list);
    }
}
