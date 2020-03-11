package org.zerock.ch04.service;

import org.springframework.stereotype.Service;

@Service
class SampleServiceImpl implements SampleService {
    @Override
    public void doA() {
        System.out.println("doA..............");
    }

    @Override
    public void doB() {
        System.out.println("doB...............");
    }

    @Override
    public void doC(String str) throws Exception{

        Thread.sleep(1000);
        System.out.println("doC....................");

    }

    @Override
    public void doD(String str)throws Exception  {

        Thread.sleep(5000);
        System.out.println("doD.................");

    }
}
