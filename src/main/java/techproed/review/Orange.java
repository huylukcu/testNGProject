package techproed.review;
import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertEquals;

public class Orange {
    @BeforeClass
    public void setUp() {
        System.out.println("This is before class");
    }

    @BeforeMethod
    public void testSetUp() {
        System.out.println("This is before method");
    }

    @AfterMethod
    public void teatCleanUp() {
        System.out.println("This is after method");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("This is after class");

    }

    @Test
    public void test1() {

        System.out.println("This is test 1");
        assertEquals(55,55);
    }

    @Test
    public void orangeTest() {
        System.out.println("This is orange");

    }
}