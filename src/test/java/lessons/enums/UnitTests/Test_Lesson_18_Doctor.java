package lessons.enums.UnitTests;

import l18.Doctor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Lesson_18_Doctor {
    @Test
    public void test_SumOfThree(){
        // Arrange
        Doctor doctor = new Doctor();

        // Act
        int result = doctor.sum_of_three(3,5,7);

        // Assert
        Assert.assertEquals(result,15);
    }
}
