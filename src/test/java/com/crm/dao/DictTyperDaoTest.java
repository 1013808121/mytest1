package com.crm.dao;

import com.bjpowernode.crm.settings.domain.TblUser;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.mapper.DicTypeMapper;
import com.bjpowernode.crm.settings.mapper.TblUserMapper;
import com.bjpowernode.crm.settings.mapper.UserMapper;
import com.crm.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

//Class newInstance->userDaoTest
//testAllUsers  Method.invoke(testAllUsers,params)
public class DictTyperDaoTest extends BaseTest {

    @Autowired
    private DicTypeMapper dicTypeMapper;

    @Test
    public void delBycodes(){
        String[] codes={"aa","returnPriority"};
        int number=dicTypeMapper.deleteDicTypeByCodes(codes);
        System.out.println(number);
    }

}
