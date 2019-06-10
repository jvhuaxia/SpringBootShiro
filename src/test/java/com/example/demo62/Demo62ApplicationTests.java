package com.example.demo62;

import com.example.demo62.mapper.TbProductMapper;
import com.example.demo62.pojo.TbProduct;
import com.example.demo62.pojo.TbProductExam;
import com.example.demo62.utils.MyUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo62ApplicationTests {


    @Autowired
    TbProductMapper tbProductMapper;

    @Test
    public void testTbProduct() throws InterruptedException {
//        TbProduct tbProduct = new TbProduct();
//        for (int i = 0; i < 100; i++) {
//            tbProduct.setNum("100");
//            tbProduct.setName("Name" + i);
//            tbProduct.setTime(MyUtils.dateToString(new Date()));
//            tbProduct.setPrice(new BigDecimal(100));
//            tbProductMapper.insertOne(tbProduct);
//        }

        TbProductExam tbProductExam = new TbProductExam();

//        for (TbProduct tbProduct1 : tbProductMapper.selectAll())
//        {
//            System.out.println(tbProduct1.toString());
//        }
        //TbProduct(id=4a639ca8-8827-11e9-b912-00ff941ae81f, name=Name96, num=Num96, price=96.96, time=2019-06-06 14:49)

//
//        PageHelper.startPage(1, 10);
//        System.out.println(tbProductMapper.selectAll().size());
    }

}
