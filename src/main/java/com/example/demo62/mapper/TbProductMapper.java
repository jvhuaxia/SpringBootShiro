package com.example.demo62.mapper;

import com.example.demo62.pojo.TbProduct;
import com.example.demo62.pojo.TbProductExam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbProductMapper {
    void insertOne(@Param("tbProduct") TbProduct tbProduct);

    List<TbProduct> selectAll();

    void updateById(@Param("tbProduct") TbProduct tbProduct);

    void delById(@Param("id") String id);

    TbProduct selectById(@Param("id") String id);

    List<TbProduct> selectByExam(@Param("tbProductExam") TbProductExam tbProductExam);

    TbProduct selectByName(@Param("name") String name);

}
