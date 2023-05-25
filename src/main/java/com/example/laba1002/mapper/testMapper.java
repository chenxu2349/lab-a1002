package com.example.laba1002.mapper;

import com.example.laba1002.pojo.testUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface testMapper {

  testUser queryById(int id);
}
