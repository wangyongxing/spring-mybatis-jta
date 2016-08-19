package com.dremy.bh.test;

import com.dreamy.bh.service.JtaService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: wangyongxing
 * Date: 16/8/18
 * Time: 下午3:41
 * To change this template use File | Settings | File Templates.
 */
public class AuthorTest extends BaseJunitTest {

    @Autowired
    JtaService jtaService;

    @Test
    public void save(){
       jtaService.save();

    }
}
