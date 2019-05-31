package top.sdszhq.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import top.sdszhq.mapper.TeacherQuestionMapper;
import top.sdszhq.pojo.Question;
import top.sdszhq.service.TeacherQuestionService;

import java.util.HashMap;
import java.util.List;

public class TeacherQuestionServiceImp implements TeacherQuestionService {

    @Autowired
    TeacherQuestionMapper teacherQuestionMapper;

    @Override
    public List<Question> findQuestionAll(String name) {
        return teacherQuestionMapper.findQuestionAll(name);
    }

    @Override
    public void addQuestion(Question qt) {
        teacherQuestionMapper.addQuedtion(qt);
    }

    @Override
    public List<Question> findQuestion(HashMap map) {
        return teacherQuestionMapper.findQuestion(map);
    }

    @Override
    public List<Question> findQuestionById(HashMap map) {
        return teacherQuestionMapper.findQuestionById(map);
    }

    @Override
    public void updateQuestion(Question qt) {
        teacherQuestionMapper.updateQuestion(qt);
    }

    @Override
    public void deleQuedtion(HashMap map) {
        teacherQuestionMapper.deleQuedtion(map);
    }
}
