package com.example.demo62.controller;

import com.example.demo62.dto.Page;
import com.example.demo62.dto.Result;
import com.example.demo62.mapper.TbProductMapper;
import com.example.demo62.pojo.TbProduct;
import com.example.demo62.pojo.TbProductExam;
import com.example.demo62.utils.MyUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/tbProduct")
public class TbProductController {

    @Autowired
    TbProductMapper tbProductMapper;

    @RequestMapping("/listView")
    public String listView() {
        return "tbProduct/list";
    }

    @RequestMapping("/addView")
    public String addView() {
        return "tbProduct/add";
    }

    @RequestMapping("/updateView")
    public ModelAndView updateView(String id) {
        ModelAndView modelAndView = new ModelAndView("tbProduct/update");
        modelAndView.addObject("product", tbProductMapper.selectById(id));
        return modelAndView;
    }

    @RequestMapping("/listPage")
    @ResponseBody
    public Result<Page<TbProduct>> listPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer limit, TbProductExam tbProductExam) {
        tbProductExam.init();
        PageHelper.startPage(page, limit);
        List<TbProduct> tbProducts = tbProductMapper.selectByExam(tbProductExam);
//        MyUtils.printMyLog(tbProducts.size());
        PageInfo<TbProduct> pageInfo = new PageInfo<>(tbProducts);
//        MyUtils.printMyLog(pageInfo);

        MyUtils.printMyLog(tbProductExam);


        Page<TbProduct> tbProductPage = new Page<>();
        tbProductPage.setTotal(pageInfo.getTotal());
        tbProductPage.setRecords(tbProducts);

        return new Result<Page<TbProduct>>(true, 0, tbProductPage, "success");
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result<String> add(TbProduct tbProduct) {
        tbProduct.setTime(MyUtils.dateToString(new Date()));
        if (tbProduct.getName() == null || tbProduct.getNum() == null || tbProduct.getPrice() == null || tbProduct.getTime() == null) {
            return new Result<>(false, 0, "请检查是否有值没有输入");
        }
        if (MyUtils.hasDigit(tbProduct.getName())) {
            return new Result<>(false, 0, "产品名称不能有数字");
        }
        if (tbProductMapper.selectByName(tbProduct.getName()) != null) {
            return new Result<>(false, 0, "产品名称重复");
        }
        if (!(tbProduct.getNum().length() >= 10 && tbProduct.getNum().length() <= 12)) {
            return new Result<>(false, 0, "产品序列号必须要满足长度在10到12之间");
        }

        tbProductMapper.insertOne(tbProduct);

        return new Result<>(false, 1, "保存成功");
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result<String> update(TbProduct tbProduct) {
        tbProduct.setTime(MyUtils.dateToString(new Date()));
        if (tbProduct.getName() == null || tbProduct.getNum() == null || tbProduct.getPrice() == null || tbProduct.getTime() == null) {
            return new Result<>(false, 0, "请检查是否有值没有输入");
        }
        if (MyUtils.hasDigit(tbProduct.getName())) {
            return new Result<>(false, 0, "产品名称不能有数字");
        }
        if (tbProductMapper.selectByName(tbProduct.getName()) != null) {
            if (tbProductMapper.selectByName(tbProduct.getName()).getId().equals(tbProduct.getId())) {
                tbProductMapper.updateById(tbProduct);
                return new Result<>(false, 1, "修改成功");
            } else {
                return new Result<>(false, 0, "产品名称重复");
            }
        }
        if (!(tbProduct.getNum().length() >= 10 && tbProduct.getNum().length() <= 12)) {
            return new Result<>(false, 0, "产品序列号必须要满足长度在10到12之间");
        }

        tbProductMapper.updateById(tbProduct);

        return new Result<>(false, 1, "修改成功");
    }

    @RequestMapping("/delById")
    @ResponseBody
    public Result<String> delById(String id) {
        tbProductMapper.delById(id);
        return new Result<>(true, 1, "删除成功");
    }

}
