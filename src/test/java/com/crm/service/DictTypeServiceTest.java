package com.crm.service;

import com.bjpowernode.crm.settings.domain.TblUser;
import com.bjpowernode.crm.settings.service.DicTypeService;
import com.bjpowernode.crm.settings.service.UserService;
import com.crm.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DictTypeServiceTest extends BaseTest {

    @Autowired
    private DicTypeService dicTypeService;

    @Test
    public void testDelByCodes(){
        String[] codes={"qq"};
       int number= dicTypeService.deleteDicTypeByCodes(codes);
       System.out.println(number);
    }
}
