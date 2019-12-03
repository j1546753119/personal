package com.example.springbootcache.test03.Service;

import com.example.springbootcache.test03.mapper.UserRelMapper;
import com.example.springbootcache.test03.model.UserRel;
import com.example.springbootcache.test03.model.UserRelExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;
import java.util.List;

/**
 * @author luqianjing
 * date: 2019/10/21
 * description:
 */
@Service
public class UserRelServiceImpl implements UserRelService {

    @Autowired
    UserRelMapper userRelMapper;

    @Override
    public List<UserRel> query() {
        return userRelMapper.selectByExample(new UserRelExample());
    }

    @Override
    @Transactional(propagation = Propagation.NESTED,rollbackFor = Exception.class)
    public void addRel(Long userId) {
        UserRel rel = new UserRel();
        rel.setUserId(userId);
        userRelMapper.insertSelective(rel);
        int i = 1/0;
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream(new File("C:/test.txt"));
        for (int i = 0; i < 39100; i++) {
            os.write("update at_replenishment_stock set is_delete = 1 where id = \t;\r\n".getBytes());
        }
        os.close();
    }
}
