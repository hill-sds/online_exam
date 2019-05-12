package top.sdszhq.mapper;

import top.sdszhq.pojo.Exam;
import top.sdszhq.pojo.ExamResult;

import java.util.HashMap;
import java.util.List;

public interface StudentInformationMapper {


    //根据条件查询
    List<ExamResult> findExamResult(HashMap map);
}
