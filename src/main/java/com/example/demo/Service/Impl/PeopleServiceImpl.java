package com.example.demo.Service.Impl;

import com.example.demo.Service.PeopleService;
import com.example.demo.dataobject.PeopleInfo;
import com.example.demo.repository.PeopleInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("peopleService")
public class PeopleServiceImpl  implements PeopleService {
    @Autowired
    private PeopleInfoRepository repository;

    @Override
    public PeopleInfo findByUsernameAndAndPassword(String username, String password) {
        return repository.findByUsernameAndAndPassword(username,password);
    }

    @Override
    public PeopleInfo findByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public PeopleInfo save(PeopleInfo peopleInfo) {
        return repository.save(peopleInfo);
    }

    @Override
    public List<PeopleInfo> findAll() {
        return repository.findAll();
    }
}
