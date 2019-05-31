package top.sdszhq.service;

import top.sdszhq.pojo.Exam;
import java.util.HashMap;
import java.util.List;

public interface TeacherExamService {

    void addExam(Exam ea);

    List<Exam> findExam(HashMap map);

    void deleExam(HashMap map);

    List<Exam> seekExamById(HashMap map);

    void updateExam(Exam ea);
    
}
