package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }

    @Test
    public void testMethod3() {
        /**
         * TODO：finish the test function
         */
        HelloWorld hw = new HelloWorld();
        int a = hw.Method3(6, -1, 1);
        a = hw.Method3(4, -1, -1);
        a = hw.Method3(4, 1, -3);
        a = hw.Method3(6, 1, -3);
         a = hw.Method3(6,1,1);
    }

    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */

    @Test
    public void testMethod4() {

        HelloWorld hw = new HelloWorld();
        int a = hw.Method4(0, 1, 1, 1, 0f);
        a = hw.Method4(1, 1, 0, 0, 0f);
        a = hw.Method4(5, 4, 1, 1, 0f);

        try {
            a = hw.Method4(5,4,0,1,0f);
        }
        catch (Exception e) {
            assertEquals("/ by zero",e.getMessage());
            //System.out.println(e.getMessage());
        }
        try {
            a = hw.Method4(4,3,1,1,0f);
        }
        catch (Exception e) {
            assertEquals("/ by zero",e.getMessage());
            //System.out.println(e.getMessage());

        }
    }

    @Test
    public void testBug() {

        HelloWorld hw = new HelloWorld();
        boolean a = hw.bug(5);
        a=hw.bug(4);

    }

    @Test
    public void testisTriangle(){
        HelloWorld hw = new HelloWorld();
        boolean a = hw.isTriangle(0,0,0);
        assertEquals(false, a);
        a = hw.isTriangle(1,0,0);
        assertEquals(false, a);
        a=hw.isTriangle(1,1,0);
        assertEquals(false, a);
        a=hw.isTriangle(1,2,4);
        assertEquals(false, a);
        a=hw.isTriangle(4,1,2);
        assertEquals(false, a);
        a=hw.isTriangle(1,4,2);
        assertEquals(false, a);
        a=hw.isTriangle(2,3,4);
        assertEquals(true, a);
    }

    @Test
    public void testminiCalculator()
    {
        HelloWorld hw = new HelloWorld();
        double a = hw.miniCalculator(1,2,'+');
        assertEquals(3.0, a,0.0001);
        a=hw.miniCalculator(1,2,'-');
        assertEquals(-1.0, a,0.0001);
        a=hw.miniCalculator(1,2,'*');
        assertEquals(2.0, a,0.0001);
        a=hw.miniCalculator(1,2,'/');
        assertEquals(0.5, a,0.0001);
        a=hw.miniCalculator(1,2,'h');
    }

    @Test
    public void testisBirthday()
    {
        HelloWorld hw = new HelloWorld();
        boolean a=hw.isBirthday(-1,0,0);
        a=hw.isBirthday(2020,0,0);
        assertEquals(false, a);
        a=hw.isBirthday(2019,11,0);
        assertEquals(false, a);
        a=hw.isBirthday(2019,10,0);
        assertEquals(false, a);
        a=hw.isBirthday(2019,10,2);
        assertEquals(false, a);
        a=hw.isBirthday(2019,9,1);
        assertEquals(true, a);
        a=hw.isBirthday(2000,0,0);
        assertEquals(false, a);
        a=hw.isBirthday(2000,13,0);
        assertEquals(false, a);
        a=hw.isBirthday(2000,2,0);
        assertEquals(false, a);
        a=hw.isBirthday(2000,2,32);
        assertEquals(false, a);
        a=hw.isBirthday(2000,2,31);
        assertEquals(false, a);
        a=hw.isBirthday(2000,9,31);
        assertEquals(false, a);
        a=hw.isBirthday(2000,3,31);
        assertEquals(true, a);
        a=hw.isBirthday(2000,8,31);
        assertEquals(true, a);
        a=hw.isBirthday(2000,2,30);
        assertEquals(false, a);
        a=hw.isBirthday(2000,3,30);
        assertEquals(true, a);
        a=hw.isBirthday(2000,3,29);
        assertEquals(true, a);
        a=hw.isBirthday(2000,2,29);
        assertEquals(true, a);
        a=hw.isBirthday(2001,2,29);
        assertEquals(false, a);
        a=hw.isBirthday(2000,1,28);
        assertEquals(true, a);
    }

}

