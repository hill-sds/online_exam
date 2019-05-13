package top.sdszhq.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import top.sdszhq.mapper.ScoreAnalysisMapper;
import top.sdszhq.mapper.TeacherExamMapper;
import top.sdszhq.pojo.Exam;
import top.sdszhq.pojo.ExamInformation;
import top.sdszhq.service.ScoreAnalysisService;
import top.sdszhq.service.TeacherExamService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScoreAnalysisServiceImp implements ScoreAnalysisService {

    @Autowired
    ScoreAnalysisMapper scoreAnalysisMapper;

    @Override
    public List<ExamInformation> findExamCode(HashMap map) {
        return scoreAnalysisMapper.findExamCode(map);
    }

    @Override
    public Map<String, String> selectAvg(String examCode) {
        return scoreAnalysisMapper.selectAvg(examCode);
    }
}
