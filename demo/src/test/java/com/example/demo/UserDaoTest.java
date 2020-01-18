package com.example.demo;

import com.example.demo.login.domain.repository.UserDao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
public class UserDaoTest {
    @Autowired
    @Qualifier("UserDaoJdbcImpl")
    UserDao dao;

    // カウントメソッドのテスト1
    @Test
    public void countTest1() {
        // カウントメソッドの結果が2件であることをテスト
        assertEquals(dao.count(), 2);
    }
}