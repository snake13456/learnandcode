package com.weapon.wx.service.impl;

import com.weapon.wx.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public void test(int i) {
        System.out.println("input number is "+i);
    }
}
