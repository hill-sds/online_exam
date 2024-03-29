package top.sdszhq.service;

import top.sdszhq.pojo.Exam;
import top.sdszhq.pojo.ExamInformation;

import java.util.HashMap;
import java.util.List;

public interface TeacherExamInformationService {

    void addExamInformation(ExamInformation ea);

    List<ExamInformation> findExamInformation(HashMap map);

    List<ExamInformation> seekInforById(HashMap map);

    void sureUpdateExam(ExamInformation ei);

    void deleInfo(HashMap map);
}
