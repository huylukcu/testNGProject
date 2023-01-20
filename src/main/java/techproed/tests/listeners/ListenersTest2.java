package techproed.tests.listeners;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;
import techproed.utilities.Driver;

import static org.testng.AssertJUnit.assertTrue;

public class ListenersTest2 {
    @Test
    public void test1() {
        System.out.println("Test case 1 PASS");
        assertTrue(true);//PASS
    }

    @Test
    public void test2() {
        System.out.println("Test case 2 FAIL");
        assertTrue(false);//FAIL
    }

    @Test
    public void test3() {
        System.out.println("Test case 3 SKIPPED");
        throw new SkipException("SKIP THIS TEST CASE");

    }

    @Test
    public void test4() {
        System.out.println("Test case 4 No Such Element Exception");
        Driver.getDriver().get("https://techproeducation.com/");
        Driver.getDriver().findElement(By.id("abcd"));//No Such Element Exception

    }}
