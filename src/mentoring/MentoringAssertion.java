package mentoring;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class MentoringAssertion {
    public static void main(String[] args) {
        int a= 10;
        int b=12;
        int i= 30;
        int j= 20;

        //hard assert

        //Assert.assertEquals(a,b,"assertion failed");

        //soft assert
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(i,j,"soft assert failed");
        softAssert.assertAll();
    }
}
