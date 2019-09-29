package com.province.survey.service;

import com.province.survey.dao.TabMapper;
import com.province.survey.entity.det;
import com.province.survey.entity.inf;
import com.province.survey.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TabService {

    @Autowired
    private TabMapper tabMapper ;

    //查询用户是否存在
    public int findUser(String name)
    {
        return tabMapper.findUser(name);
    }

    //查询用户密码
    public String findPwd(String name)
    {
        return tabMapper.findPwd(name);
    }

    //插入一个用户
    public void insertUser(user user)
    {
        tabMapper.insertUser(user);
    }

    //通过id查询题目描述
    public List<inf> findDes(String username)
    {
        return tabMapper.findDes(username);
    }

    //通过num所有题目选项
    public List<det> findOptByNum(inf t)
    {
        return tabMapper.findOptByNum(t);
    }

    //通过num查询相应题目
    public inf findOneDes(inf t)
    {
        return tabMapper.findOneDes(t);
    }

    //插入题目
    public void insertInf(inf t)
    {
        tabMapper.insertInf(t);
    }

    //插入选项
    public void insertOpt(det t)
    {
        tabMapper.insertOpt(t);
    }

    //查询一个调查表中题目的最大值
    public int findMaxNum(String username)
    {
        return tabMapper.findMaxNum(username);
    }

    //查询一个调查表中选项的最大值
    public int findMaxId(inf t)
    {
        return tabMapper.findMaxId(t);
    }

    //更新题目描述
    public void updateDes(inf t)
    {
        tabMapper.updateDes(t);
    }

    //更新选项描述
    public void updateOpt(det t)
    {
        tabMapper.updateOpt(t);
    }

    //更新选项选择情况
    public void updateRes(det t)
    {
        tabMapper.updateRes(t);
    }

    //删除题目信息
    public void deleteDes(inf t)
    {
        tabMapper.deleteDes(t);
    }

    //删除单个选项
    public void deleteOneOpt(det t)
    {
        tabMapper.deleteOneOpt(t);
    }

    //删除所有选项
    public void deleteAllOpt(inf t)
    {
        tabMapper.deleteAllOpt(t);
    }

}
