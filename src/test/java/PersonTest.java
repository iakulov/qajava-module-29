import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @DataProvider(name = "TeenagerDataProvider")
    Object[][] TeenagerDataProvider() {
        return new Object[][] {
                {10, false},   //test run 1
                {12, false},   //test run 2
                {13, true},   //test run 3
                {15, true},  //test run 4
                {19, true},  //test run 5
                {20, false},  //test run 6
                {25, false},   //test run 7
        };
    }

    @Test(dataProvider = "TeenagerDataProvider")
    public void testisTeenager(int arg, boolean isValid) {
        boolean result = Person.isTeenager(arg);
        System.out.println(result);
        assertEquals(result, isValid);
    }

}
