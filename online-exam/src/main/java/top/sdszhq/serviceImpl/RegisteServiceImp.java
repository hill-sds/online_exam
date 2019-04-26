package top.sdszhq.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import top.sdszhq.mapper.RegisteMapper;
import top.sdszhq.pojo.Student;
import top.sdszhq.service.RegisteService;

public class RegisteServiceImp implements RegisteService {

    @Autowired
    RegisteMapper registeMapper;

    @Override
    public String selectAccount(String account) {
        return registeMapper.selectAccount(account);
    }

    @Override
    public void addAccount(Student s1) {
        registeMapper.addAccount(s1);
    }
}
