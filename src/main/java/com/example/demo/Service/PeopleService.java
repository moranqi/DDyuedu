package com.example.demo.Service;

import com.example.demo.dataobject.PeopleInfo;

public interface PeopleService {
    PeopleInfo findByUsernameAndAndPassword(String username, String password);
}
