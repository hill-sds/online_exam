package top.sdszhq.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import top.sdszhq.mapper.ExamRankMapper;
import top.sdszhq.mapper.LoginMapper;
import top.sdszhq.pojo.ExamResult;
import top.sdszhq.service.ExamRankService;
import top.sdszhq.service.LoginService;

import java.util.List;
import java.util.Map;

public class ExamRankServiceImp implements ExamRankService {

    @Autowired
    ExamRankMapper erm;

    @Override
    public List<ExamResult> selectExamRank(String examCode) {
        return erm.selectExamRank(examCode);
    }
}
