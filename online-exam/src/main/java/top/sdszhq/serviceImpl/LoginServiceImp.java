package top.sdszhq.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import top.sdszhq.mapper.LoginMapper;
import top.sdszhq.service.LoginService;

import java.util.Map;

public class LoginServiceImp implements LoginService {

    @Autowired
    LoginMapper lm;

    @Override
    public Map<String, String> selectPassword(String account) {
        return lm.selectPassword(account);
    }

    @Override
    public Map<String, String> selectTeacherPassword(String account) {
        return lm.selectTeacherPassword(account);
    }
}
