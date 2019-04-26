package top.sdszhq.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import top.sdszhq.mapper.TeacherQuestionMapper;
import top.sdszhq.pojo.Question;
import top.sdszhq.service.TeacherQuestionService;

import java.util.List;

public class TeacherQuestionServiceImp implements TeacherQuestionService {

    @Autowired
    TeacherQuestionMapper teacherQuestionMapper;

    @Override
    public List<Question> findQuestionAll() {
        return teacherQuestionMapper.findQuestionAll();
    }
}
