package com.crm.dao;

import com.bjpowernode.crm.settings.domain.TblUser;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.mapper.TblUserMapper;
import com.bjpowernode.crm.settings.mapper.UserMapper;
import com.bjpowernode.crm.workbench.domain.Activity;
import com.bjpowernode.crm.workbench.mapper.ActivityMapper;
import com.crm.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

//Class newInstance->userDaoTest
//testAllUsers  Method.invoke(testAllUsers,params)
public class ActivityDaoTest extends BaseTest {

    @Autowired
    private ActivityMapper activityMapper;


    @Test
    public void testInsertActivity(){
        Activity activity=new Activity();
        activity.setId("abcde");
        activity.setOwner("cjc");
        activityMapper.insertActivity(activity);
    }

    @Test
    public void test1(){
        HashMap map=new HashMap();
        map.put("name","1");
        map.put("beginNo",0);
        map.put("pageSize",2);
        List<Activity> activities=activityMapper.selectActivityForPageByCondition(map);
        System.out.println(activities.size());
    }

//    @Test
//    public void test2(){
//        HashMap map=new HashMap();
//        map.put("name","1");
//        map.put("beginNo",0);
//        map.put("pageSize",2);
//        long number=activityMapper.selectCountofActivityByCondition(map);
//        System.out.println(number);
//    }


    @Test
    public void test3(){
        HashMap map=new HashMap();
        map.put("activityName","家具");
        map.put("clueId","01b41229673949f7a8196215332aaa70");
        List<Activity> aList=activityMapper.searchActivityNoBoundById(map);
        System.out.println(aList.size());
    }


}
