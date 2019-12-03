package com.example.springbootcache.test01.service;

import com.example.springbootcache.test01.domain.Person;
import org.springframework.stereotype.Service;

/**
 * @author luqianjing
 * date: 2019/10/10
 * description:
 */
@Service
public class TestServiceImpl implements TestService {

    private Person person;

    public TestServiceImpl( Person person){
        this.person = person;
    }

//    public void setPerson(Person person) {
//        this.person = person;
//    }

    @Override
    public void say(){
        this.person.say();
    }
}
