package top.sdszhq.service;

import top.sdszhq.pojo.ExamInformation;
import top.sdszhq.pojo.ExamResult;
import top.sdszhq.pojo.Question;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StudentExamService {

    //根据考试码查询考试卷
    List<ExamInformation> findExam(HashMap map);

    String findQuestionId(String exam);

    List<Question> findQuestion(String[] id);

    //添加试卷结果
    void addExamResult(ExamResult er);

    //根据考试码查询考试卷
    List<ExamResult> findExamResult(String account,String examCode);

}
