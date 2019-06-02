package top.sdszhq.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import top.sdszhq.mapper.TeacherExamInformationMapper;
import top.sdszhq.mapper.TeacherExamMapper;
import top.sdszhq.pojo.Exam;
import top.sdszhq.pojo.ExamInformation;
import top.sdszhq.service.TeacherExamInformationService;
import top.sdszhq.service.TeacherExamService;

import java.util.HashMap;
import java.util.List;

public class TeacherExamInformationServiceImp implements TeacherExamInformationService {

    @Autowired
    TeacherExamInformationMapper teacherExamInformationMapper;


    @Override
    public void addExamInformation(ExamInformation ea) {
        teacherExamInformationMapper.addExamInformation(ea);
    }

    @Override
    public List<ExamInformation> findExamInformation(HashMap map) {
        return teacherExamInformationMapper.findExamInformation(map);
    }

    @Override
    public List<ExamInformation> seekInforById(HashMap map) {
        return teacherExamInformationMapper.seekInforById(map);
    }

    @Override
    public void sureUpdateExam(ExamInformation ei) {
        teacherExamInformationMapper.sureUpdateExam(ei);
    }

    @Override
    public void deleInfo(HashMap map) {
        teacherExamInformationMapper.deleInfo(map);
    }
}
