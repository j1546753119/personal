package com.example.springbootcache.test03.Service;

import com.example.springbootcache.test03.mapper.UserMapper;
import com.example.springbootcache.test03.model.User;
import com.example.springbootcache.test03.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static sun.misc.Version.print;

/**
 * @author luqianjing
 * date: 2019/10/20
 * description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    UserRelService userRelService;

    @Override
    //@Transactional(rollbackFor = Exception.class)
    public List<User> query() {
        UserExample example = new UserExample();
        example.createCriteria().andNameEqualTo("test");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return userMapper.selectByExample(example);
    }

    @Override
    //@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Long addUser(User user) {
        userMapper.insert(user);
        return user.getId();
    }

    private void test() {
        userRelService.addRel(1000L);
    }
}
