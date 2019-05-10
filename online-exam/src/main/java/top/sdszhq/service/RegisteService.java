package top.sdszhq.service;

import top.sdszhq.pojo.Student;
import top.sdszhq.pojo.Teacher;

public interface RegisteService {

    String selectAccount(String account);

    void addAccount(Student s1);

    String selectTeaAccount(String account);

    void addTeaAccount(Teacher s1);
}
