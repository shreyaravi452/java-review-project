import com.hr.personnel.HourlyEmployee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HourlyEmployeeTest {
    private HourlyEmployee hourlyEmployee;

    @Before
    public void setUp(){
        hourlyEmployee = new HourlyEmployee("Shreya", "2020-10-10", 60, 250);
    }

    @Test
    public void testGetEmployeeInfo(){
        String expectedInfo = "250.0 60 Shreya 2020-10-10";
        String info = hourlyEmployee.getEmployeeInfo();
        assertEquals(expectedInfo, info);
    }

    @Test
    public void testComputerMonthlyCompensation(){
        double expectedInfo = 60*250;
        assertEquals(expectedInfo, hourlyEmployee.computeMonthlyCompensation(), 0.1);
    }

    @Test
    public void testComputeMonthlyTaxToPay(){
        double expectedInfo = (60*250*0.25)-250;
        assertEquals(expectedInfo, hourlyEmployee.computeMonthlyTaxToPay(), 0.1);
    }
}
