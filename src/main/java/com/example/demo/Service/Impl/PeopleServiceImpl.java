package com.example.demo.Service.Impl;

import com.example.demo.Service.PeopleService;
import com.example.demo.dataobject.PeopleInfo;
import com.example.demo.repository.PeopleInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleServiceImpl  implements PeopleService {
    @Autowired
    private PeopleInfoRepository repository;

    @Override
    public PeopleInfo findByUsernameAndAndPassword(String username, String password) {
        return repository.findByUsernameAndAndPassword(username,password);
    }
}
