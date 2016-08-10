package com.cool.study.fnal;

/**
 * Created by cool on 16/7/4.
 */
public class FinalTest {

    private FinalTestImpl finalTestImpl;

    public FinalTest(){

        finalTestImpl=new FinalTestImpl("ssss");
    }

    public void hello(){

        finalTestImpl.hello();
    }



}
