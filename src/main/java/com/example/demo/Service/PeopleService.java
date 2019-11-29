package com.example.demo.Service;

import com.example.demo.dataobject.PeopleInfo;

import java.util.List;

public interface PeopleService {
    PeopleInfo findByUsernameAndAndPassword(String username, String password);

    PeopleInfo findByUserId(String userId);

    PeopleInfo save(PeopleInfo peopleInfo);

    List<PeopleInfo> findAll();
}
