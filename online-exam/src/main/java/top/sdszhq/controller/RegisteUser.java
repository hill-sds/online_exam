package top.sdszhq.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.sdszhq.pojo.Student;
import top.sdszhq.service.RegisteService;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RegisteUser {

    @Autowired
    public RegisteService rs;

    @ResponseBody
    @RequestMapping("/html/registe.action")
    public String selectId(@RequestBody Map<String,String> map) {
        String account = map.get("account").toString();
        String oldAccount = rs.selectAccount(account);//查询账号是否被注册过
        Map rtnMap = new HashMap();
        if(oldAccount != null) {
            rtnMap.put("msg","no");
        } else {
            String name = map.get("name").toString();
            String password = map.get("password").toString();
            String question = map.get("question").toString();
            String answer = map.get("answer").toString();
            Student u1 =new Student(name,account,password,question,answer);
            rs.addAccount(u1);
            rtnMap.put("msg","yes");
        }
        return new Gson().toJson(rtnMap);
    }
}
