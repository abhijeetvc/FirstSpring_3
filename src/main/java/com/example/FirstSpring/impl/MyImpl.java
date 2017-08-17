package com.example.FirstSpring.impl;

import com.example.FirstSpring.repository.MyInterface;
import org.springframework.stereotype.Service;

/**
 * Created by abhi on 10/08/17.
 */
@Service
public class MyImpl implements MyInterface {

    @Override
    public Integer add(int a,int b) {
        int c=a+b;
        return c;
    }
}
