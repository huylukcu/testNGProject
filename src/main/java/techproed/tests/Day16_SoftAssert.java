package techproed.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day16_SoftAssert {
    @Test
    public void softSoftTest() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Line 11 Code");
        softAssert.assertEquals(3, 5);
        System.out.println("Line 13 Code");
        softAssert.assertAll();
        /*
        Dokuman uzerinde yapilan dogrulama islerine verification deniyor.
        Kodu calistirdiktan sonra ortaya cikan sonuctan, beklenen netice aliniyor mu,
        alinmiyor mu, bunun dogrulanmasina validation denir.
        hard assertion to see the bug reason
        check requirements ==> verification
        check expected and actual match==>validation
         */
    }
}
