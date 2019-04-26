package top.sdszhq.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.sdszhq.pojo.Question;
import top.sdszhq.service.TeacherQuestionService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TeacherQuestion {
    @Autowired
    public TeacherQuestionService tqs;

    @ResponseBody
    @RequestMapping(value = "/html/seekAll.action",produces = "application/json; charset=utf-8")
    public String seekAll() {
        System.out.println("666");
        List<Question> list = new ArrayList<>();
        list = tqs.findQuestionAll();
        return new Gson().toJson(list);
    }
}
