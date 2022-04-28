package com.weapon.wx;

import com.weapon.wx.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class SpringLean {

    @Autowired
    private TestService testService;

    @Test
    public void test() {
        testService.test(1);
    }
}
