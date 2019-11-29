package com.example.demo.repository;


import com.example.demo.dataobject.PeopleInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleInfoRepository extends JpaRepository<PeopleInfo,String> {
    public PeopleInfo findByUserId(String userId);

    public PeopleInfo findByUsernameAndAndPassword(String username, String password);
}
