package top.sdszhq.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import top.sdszhq.mapper.ExamRankMapper;
import top.sdszhq.mapper.FailQuestionMapper;
import top.sdszhq.pojo.ExamResult;
import top.sdszhq.service.ExamRankService;
import top.sdszhq.service.FailQuestionService;

import java.util.HashMap;
import java.util.List;

public class FailQuestionServiceImp implements FailQuestionService {

    @Autowired
    FailQuestionMapper fqm;

    @Override
    public List<ExamResult> seedFailQuestion(HashMap map) {
        return fqm.seedFailQuestion(map);
    }
}
