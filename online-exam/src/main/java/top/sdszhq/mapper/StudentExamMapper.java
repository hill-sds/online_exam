package top.sdszhq.mapper;

import top.sdszhq.pojo.ExamInformation;
import top.sdszhq.pojo.ExamResult;
import top.sdszhq.pojo.Question;

import java.util.HashMap;
import java.util.List;


public interface StudentExamMapper {

    //根据考试码查询考试卷
    List<ExamInformation> findExam(HashMap map);

    //根据考试码查询考试卷
    List<ExamResult> findExamResult(String account,String examCode);

    String findQuestionId(String exam);

    List<Question> findQuestion(String[] id);

    //添加试卷结果
    void addExamResult(ExamResult er);
}
