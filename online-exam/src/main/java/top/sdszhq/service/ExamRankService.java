package top.sdszhq.service;

import top.sdszhq.pojo.ExamResult;

import java.util.List;
import java.util.Map;

public interface ExamRankService {

    List<ExamResult> selectExamRank(String examCode);
}
