package top.sdszhq.mapper;

import top.sdszhq.pojo.Student;

public interface RegisteMapper {

    //查询该账号是否被注册过
    String selectAccount(String account);

    //注册账号
    void addAccount(Student t1);
}
