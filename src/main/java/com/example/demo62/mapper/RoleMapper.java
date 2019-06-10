package com.example.demo62.mapper;

import com.example.demo62.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface RoleMapper {
    Role selectOne(int id);

    List<Role> selectByUser(String userId);


}
