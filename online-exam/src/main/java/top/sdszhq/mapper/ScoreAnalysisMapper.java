package top.sdszhq.mapper;

import top.sdszhq.pojo.Exam;
import top.sdszhq.pojo.ExamInformation;
import top.sdszhq.pojo.ExamResult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ScoreAnalysisMapper {


    //根据条件查询
    List<ExamInformation> findExamCode(HashMap map);

    Map<String,String> selectAvg(String examCode);
}
