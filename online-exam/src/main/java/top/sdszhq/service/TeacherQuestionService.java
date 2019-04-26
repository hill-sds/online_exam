package top.sdszhq.service;

import top.sdszhq.pojo.Question;
import java.util.List;

public interface TeacherQuestionService {

    List<Question> findQuestionAll();
    
}
