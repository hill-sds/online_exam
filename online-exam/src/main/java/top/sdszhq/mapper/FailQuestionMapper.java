package top.sdszhq.mapper;

import top.sdszhq.pojo.ExamResult;

import java.util.HashMap;
import java.util.List;

public interface FailQuestionMapper {


    //根据条件查询
    List<ExamResult> seedFailQuestion(HashMap map);

}
