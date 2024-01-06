package org.example;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnnotationsTest {
    @BeforeSuite
    public void m1(){
        System.out.println("Suite");
    }
    @AfterSuite
    public void m2(){
        System.out.println("Last");
    }

    @BeforeTest
    public void m3(){
        System.out.println("First");
    }

    @AfterTest
    public void m4(){
        System.out.println("Second");
    }

    @BeforeClass
    public void m5(){
        System.out.println("Third");
    }

    @AfterClass
    public void m6(){
        System.out.println("Fourth");
    }

    @BeforeMethod
    public void m7(){
        System.out.println("Fiftg");
    }

    @AfterMethod
    public void m8(){
        System.out.println("Sixth");
    }

    @Test
    public void m11(){
        System.out.println("hello");
    }

    @Test
    public void m12(){
        System.out.println("hi");
    }

    @Test
    public void m13(){
        System.out.println("how");
    }

    @Test
    public void m14(){
        System.out.println("areu");
    }
}
