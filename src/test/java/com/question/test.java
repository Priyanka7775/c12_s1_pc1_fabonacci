package com.question;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test {
    fabonacci fab=null;
    private TestCase Assertions;

    @Before
    public  void setup(){
        fab=new fabonacci();
    }
    @After
    public void tearDown(){
        fab = null;
    }

   @Test
    public void getFabonacci(){
        Assertions.assertEquals(-1,fab.fabonacci(-1));
   }
    @Test
    public void getFabonacciNum(){
        Assertions.assertEquals(21,fab.fabonacci(8));
    }






}
