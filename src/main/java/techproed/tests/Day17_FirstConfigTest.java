package techproed.tests;

import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import static org.testng.AssertJUnit.assertEquals;

public class Day17_FirstConfigTest {
    //assert title
    @Test
    public void firstConfigTest(){
        //go to techproed homepage
        // Driver.getDriver().get("https://www.techproeducation.com");
        Driver.getDriver().get(ConfigReader.getProperty("url_prod_techproed"));
        System.out.println(Driver.getDriver().getTitle());
        //assert title
        //assertEquals("Techpro Education | Online It Courses & Bootcamps",Driver.getDriver().getTitle());  Hard Coding
        assertEquals(ConfigReader.getProperty("app_title"),Driver.getDriver().getTitle());

    }}
