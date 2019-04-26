package top.sdszhq.service;

import top.sdszhq.pojo.Student;

public interface RegisteService {

    String selectAccount(String account);

    void addAccount(Student s1);
}
