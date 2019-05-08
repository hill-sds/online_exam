package top.sdszhq.service;

import top.sdszhq.pojo.Exam;
import java.util.HashMap;
import java.util.List;

public interface TeacherExamService {

    void addExam(Exam ea);

    List<Exam> findExam(HashMap map);
    
}
