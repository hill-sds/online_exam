package top.sdszhq.mapper;

import top.sdszhq.pojo.ExamInformation;
import top.sdszhq.pojo.ExamResult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ExamRankMapper {


    //根据条件查询
    List<ExamResult> selectExamRank(String examCode);

}
