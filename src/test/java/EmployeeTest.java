import com.hr.personnel.Employee;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    private Employee employee;

    @Before
    public void setup(){
        employee = new Employee("Shreya", "2018-07-25");
    }

    @Test
    public void testGetEmployeeInfo() {
        String expectedInfo = "name = Shreya, hireDate = 2018-07-25";
        assertEquals(expectedInfo, employee.getEmployeeInfo());
    }

    @Test
    public void testWork() {
        String expectWork = "Shreya worked";
        assertEquals(expectWork, employee.work());
    }

    @Test
    public void testComputeNumberOfYearsWorkedSinceHired() {
        int expectedYears = LocalDate.now().getYear() - 2018;
        assertEquals(expectedYears, employee.computeNumberOfYearsWorkedSinceHired());
    }

    @Test(expected = java.time.format.DateTimeParseException.class)
    public void testInvalidDatepArsing() {
        new Employee("Diya", "2024/07/25");
    }
}
