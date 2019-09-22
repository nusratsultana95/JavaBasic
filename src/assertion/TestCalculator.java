package assertion;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int value=calculator.addition(10,22);
      // Assert.assertEquals(value,31,"Assertion failed");//in general we give negetive msg bcuz it will only print if get failed


        SoftAssert softAssert = new SoftAssert();
        int value2=calculator.addition(6,3);
        softAssert.assertEquals(value2,10,"Failed");
        int value3=calculator.addition(2,2);
        softAssert.assertEquals(value3,65,"nope");
        int value4= calculator.addition(1,5);
        softAssert.assertEquals(value4,875,"softAssert failed");
        softAssert.assertAll();


    }
}
