import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    //1. Positive unit test "Happy path"
    // if (start <= end)
    //return array;

    @Test   // start < end

    public void testStartLessThanEnd_HappyPath() {
        // AAA:
        //arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
                               "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end); //creating object and calling methods

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Positive unit test "Happy path"
    // if (start == end)
    //return array;

    @Test   // start = end

    public void testStartEqualsEnd_HappyPath() {
        // AAA:
        //arrange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end); //creating object and calling methods

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //3. Positive unit test
    // if (start = end)
    //return array;
    @Ignore
    @Test   // start = end

    public void testStartLessThanEnd_StartAndEndNegative_HappyPath() {
        // AAA:
        //arrange
        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz"};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end); //creating object and calling methods

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //4. Negative unit test
    // if (start > end)
    //return new String[0];

    @Test   // start > end

    public void testStartGreaterThanEnd_HappyPath() {
        // AAA:
        //arrange
        int start = 20;
        int end = 1;
        String[] expectedResult = {};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end); //creating object and calling methods

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}


