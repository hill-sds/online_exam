package top.sdszhq.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import top.sdszhq.mapper.TeacherExamMapper;
import top.sdszhq.pojo.Exam;
import top.sdszhq.service.TeacherExamService;

import java.util.HashMap;
import java.util.List;

public class TeacherExamServiceImp implements TeacherExamService {

    @Autowired
    TeacherExamMapper teacherExamMapper;


    @Override
    public void addExam(Exam ea) {
        teacherExamMapper.addExam(ea);
    }

    @Override
    public List<Exam> findExam(HashMap map) {
        return teacherExamMapper.findExam(map);
    }

    @Override
    public void deleExam(HashMap map) {
        teacherExamMapper.deleExam(map);
    }

    @Override
    public List<Exam> seekExamById(HashMap map) {
        return teacherExamMapper.seekExamById(map);
    }

    @Override
    public void updateExam(Exam ea) {
        teacherExamMapper.updateExam(ea);
    }

}
