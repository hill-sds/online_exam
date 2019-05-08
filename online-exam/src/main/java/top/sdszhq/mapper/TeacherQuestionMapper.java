package top.sdszhq.mapper;

import top.sdszhq.pojo.Question;

import java.util.HashMap;
import java.util.List;

public interface TeacherQuestionMapper {
    //查询所有试题
    List<Question> findQuestionAll(String name);

    //根据条件查询试题
    List<Question> findQuestion(HashMap map);

    //添加试题
    void addQuedtion(Question qt);
}
