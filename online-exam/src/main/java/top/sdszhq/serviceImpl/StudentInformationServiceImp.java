package top.sdszhq.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import top.sdszhq.mapper.StudentInformationMapper;
import top.sdszhq.mapper.TeacherExamInformationMapper;
import top.sdszhq.pojo.ExamInformation;
import top.sdszhq.pojo.ExamResult;
import top.sdszhq.service.StudentInformationService;
import top.sdszhq.service.TeacherExamInformationService;

import java.util.HashMap;
import java.util.List;

public class StudentInformationServiceImp implements StudentInformationService {

    @Autowired
    StudentInformationMapper studentInformationMapper;

    @Override
    public List<ExamResult> findExamResult(HashMap map) {
        return studentInformationMapper.findExamResult(map);
    }
}
