package com.example.demo.repository;


import com.example.demo.dataobject.PeopleInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleInfoRepository extends JpaRepository<PeopleInfo,String> {
    PeopleInfo findByUsernameAndAndPassword(String username, String password);
}
