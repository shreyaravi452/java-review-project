import com.hr.personnel.SalariedEmployee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalariedEmployeeTest {
    private SalariedEmployee salariedEmployee;

    @Before
    public void setUp(){
        salariedEmployee = new SalariedEmployee("Shreya", "2021-09-09", 34000);
    }

    @Test
    public void testGetEmployeeInfo(){
        String expectedInfo = "34000.0 Shreya 2021-09-09";
        assertEquals(expectedInfo, salariedEmployee.getEmployeeInfo());
    }

    @Test
    public void testComputeMonthlyCompensation(){
        double expectedInfo = 34000;
        assertEquals(expectedInfo, salariedEmployee.computeMonthlyCompensation(), 0.1);
    }

    @Test
    public void testMonthlyTaxToPay(){
        double expectedInfo = 34000*0.30;
        assertEquals(expectedInfo, salariedEmployee.computeMonthlyTaxToPay(), 0.1);
    }
}
