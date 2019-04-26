package top.sdszhq.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.sdszhq.service.LoginService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginUser {

    @Autowired
    public LoginService ls;

    //学生登录
    @ResponseBody
    @RequestMapping("*/login.action")
    public String selectId(String account, String password, HttpServletResponse response) {
        Map pas = new HashMap();
        pas = ls.selectPassword(account);
        Map map = new HashMap();
        if(pas==null) {
            map.put("msg", "null");
        }else {
            if(pas.get("password").equals(password)) {
                map.put("msg", "yes");
            }else {
                map.put("msg", "no");
            }
        }
        return new Gson().toJson(map);
    }

    @ResponseBody
    @RequestMapping("login.action")
    public String selectId2(String account, String password, HttpServletResponse response) {
        Map pas = new HashMap();
        pas = ls.selectPassword(account);
        Map map = new HashMap();
        if(pas==null) {
            map.put("msg", "null");
        }else {
            if(pas.get("password").equals(password)) {
                map.put("msg", "yes");
            }else {
                map.put("msg", "no");
            }
        }
        return new Gson().toJson(map);
    }

    //教师登录
    @ResponseBody
    @RequestMapping("/html/teacherLogin.action")
    public String teacherLogin(String account, String password, HttpServletResponse response) {
        Map pas = new HashMap();
        pas = ls.selectTeacherPassword(account);
        Map map = new HashMap();
        if(pas==null) {
            map.put("msg", "null");
        }else {
            if(pas.get("password").equals(password)) {
                map.put("msg", "yes");
                String name = (String) pas.get("name");
                Cookie nameCookie = new Cookie("name", (String) pas.get("name"));
                /*Cookie cookie1 = new Cookie("status",(String) pas.get("status"));*/
                response.addCookie(nameCookie);
            }else {
                map.put("msg", "no");
            }
        }
        return new Gson().toJson(map);
    }
}
