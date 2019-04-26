package top.sdszhq.service;

import java.util.Map;

public interface LoginService {

    Map<String,String> selectPassword(String account);

    Map<String,String> selectTeacherPassword(String account);

}
