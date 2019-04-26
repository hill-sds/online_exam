package top.sdszhq.mapper;

import top.sdszhq.pojo.Question;

import java.util.List;

public interface TeacherQuestionMapper {
    //查询所有记录
    List<Question> findQuestionAll();
}
