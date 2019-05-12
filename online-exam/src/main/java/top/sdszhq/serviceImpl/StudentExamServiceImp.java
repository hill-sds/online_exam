package top.sdszhq.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import top.sdszhq.mapper.LoginMapper;
import top.sdszhq.mapper.StudentExamMapper;
import top.sdszhq.pojo.ExamInformation;
import top.sdszhq.pojo.ExamResult;
import top.sdszhq.pojo.Question;
import top.sdszhq.service.StudentExamService;

import java.util.HashMap;
import java.util.List;

public class StudentExamServiceImp implements StudentExamService {
    @Autowired
    StudentExamMapper sem;

    @Override
    public List<ExamInformation> findExam(HashMap map) {
        return sem.findExam(map);
    }

    @Override
    public String findQuestionId(String exam) {
        return sem.findQuestionId(exam);
    }

    @Override
    public List<Question> findQuestion(String[] id) {
        return sem.findQuestion(id);
    }

    @Override
    public void addExamResult(ExamResult er) {
        sem.addExamResult(er);
    }

    @Override
    public List<ExamResult> findExamResult(String account, String examCode) {
        return sem.findExamResult(account, examCode);
    }
}
