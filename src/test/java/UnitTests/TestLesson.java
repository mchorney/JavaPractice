package UnitTests;

import homework18.Doctor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLesson {
    @Test
    public void testSumOfThree(){
        // Arrange an Object
        Doctor doc = new Doctor();
        // Act
        int result =doc.sumOfThree(3,5,7);
        //Assert
        Assert.assertEquals(result, 15);
    }
}
