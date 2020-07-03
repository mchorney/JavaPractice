package seleniumTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import passenger_1.TicketPrice;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest_CorrectCredentials_LoggedToApp(){
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginTest_CorrectCredentials_LoggedToApp1(){
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginTest_CorrectCredentials_LoggedToApp2(){
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginTest_CorrectCredentials_LoggedToApp3(){
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginTest_CorrectCredentials_LoggedToApp4(){
        Assert.assertTrue(mainPage.isMain());
    }
    @DataProvider(name = "Ages")
    public Object[][] createData(){
        return new Object[][]{
                {1,1000,0.0},
                {5,1000,500.0},
                {15,1000,1000.0},
                {68,1000,800.0}
        };
    }
    @Test(dataProvider = "Ages")
    public void ticketPriceCalculator(int age, int fare, double result){
        TicketPrice calcuator= new TicketPrice();
        double ticketPrice = calcuator.getTicketPrice(age, fare);
        Assert.assertEquals(ticketPrice, result);

    }
}
