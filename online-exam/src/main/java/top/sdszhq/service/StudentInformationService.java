package top.sdszhq.service;

import top.sdszhq.pojo.ExamInformation;
import top.sdszhq.pojo.ExamResult;

import java.util.HashMap;
import java.util.List;

public interface StudentInformationService {


    //根据条件查询
    List<ExamResult> findExamResult(HashMap map);
    
}
