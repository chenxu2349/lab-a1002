package com.example.laba1002;

import com.example.laba1002.mapper.testMapper;
import com.example.laba1002.pojo.testUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LabA1002ApplicationTests {

    @Autowired
    private testMapper mp1;

    @Test
    public void mybatisDemo() {
        testUser u1 = mp1.queryById(1);
        System.out.println(u1.toString());
    }

}
