import com.hr.personnel.CommissionedEmployee;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CommissionedEmployeeTest {
    private CommissionedEmployee commissionedEmployee;

    @Before
    public void setUp(){
        ArrayList<Double> myArray = new ArrayList<>();
        myArray.add(30000.0);
        commissionedEmployee = new CommissionedEmployee("Shreya", "2020-10-10", 0.2, myArray);
    }

    @Test
    public void testGetEmployeeInfo(){
        String expectedInfo = "";
        assertEquals(expectedInfo, commissionedEmployee.getEmployeeInfo());
    }

    @Test
    public void testComputeMonthlyCompensation(){
        double expectedInfo = 0.2*30000;
        assertEquals(expectedInfo, commissionedEmployee.computeMonthlyCompensation(), 0.1);
    }

    @Test
    public void testComputeMonthlyTaxToPay(){
        assertEquals(0.0, commissionedEmployee.computeMonthlyTaxToPay(), 0.1);
    }
}
