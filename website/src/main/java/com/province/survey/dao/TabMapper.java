package com.province.survey.dao;

import com.province.survey.entity.det;
import com.province.survey.entity.inf;
import com.province.survey.entity.user;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TabMapper {

    //查询用户是否存在
    int findUser(String name);

    //查询用户密码
    String findPwd(String name);

    //插入一个用户
    void insertUser(user user);

    //通过id查询题目描述
    List<inf> findDes(String username);

    //通过num查询相应题目
    inf findOneDes(inf t);

    //通过num查询所有题目的选项
    List<det> findOptByNum(inf t);

    //查询一个调查表中num的最大值
    int findMaxNum(String username);

    //查询一个题中选项的最大值
    int findMaxId(inf t);

    //插入题目
    void insertInf(inf t);

    //插入题目描述
    void insertOpt(det t);

    //更新题目描述
    void updateDes(inf t);

    //更新选项描述
    void updateOpt(det t);

    //更新选项选择情况
    void updateRes(det t);

    //删除题目信息
    void deleteDes(inf t);

    //删除单个选项信息
    void deleteOneOpt(det t);

    //删除所有选项信息
    void deleteAllOpt(inf t);
}
