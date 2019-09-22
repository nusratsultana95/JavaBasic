package assertion;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TestAssertion {
    //uses>>enables to test assumption of program
    public static void main(String[] args) {
        int x=10;
        int z=110;
        int a=13;
        int b=12;
        //hard assert>>dont need to create object bcuz its a static method & if found exception will not execute
       // Assert.assertEquals(a,b,"assertion failed");//actual & expected,so it found 13 but expect 12

        //soft assert
        SoftAssert softAssert = new SoftAssert();
        System.out.println("test");
        softAssert.assertEquals(a,b,"1st try custom messege assertion failed");
        softAssert.assertEquals(x,z,"2nd try");
        softAssert.assertAll();//everytime u use softassert u need assertall() & this line has to be last line.
        //in this line ur softassert get execute,that, it is equal or not and throws exception

        //*********************************************************************
       //note: hard assert>>when ur expected condition passes it doest do anything.like x=10,y=10 it that case it will not execute
        //if it fails it will give u exception and stop working.like x=10,y=13
        // note: hard assert u need when u want to stop ur execution
        //note: softassert execute, doesnt matter its true or false and stores into softassert object
    }
}
