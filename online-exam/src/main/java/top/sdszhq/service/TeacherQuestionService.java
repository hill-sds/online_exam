package top.sdszhq.service;

import top.sdszhq.pojo.Question;

import java.util.HashMap;
import java.util.List;

public interface TeacherQuestionService {

    List<Question> findQuestionAll(String name);

    void addQuestion(Question qt);

    List<Question> findQuestion(HashMap map);

    List<Question> findQuestionById(HashMap map);

    void updateQuestion(Question qt);

    void deleQuedtion(HashMap map);
    
}
