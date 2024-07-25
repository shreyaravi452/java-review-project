import com.hr.personnel.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    private Employee employee;

    @Before
    public void setup(){
        employee = new Employee("Shreya", "2024-07-25");
    }

    @Test
    public void testGetEmployeeInfo() {
        String expectedInfo = "name = Shreya, hireDate = 2024-07-25";
        assertEquals(expectedInfo, employee.getEmployeeInfo());
    }

    @Test
    public void testWork() {
        String expectWork = "Shreya worked";
        assertEquals(expectWork, employee.work());
    }

    @Test(expected = java.time.format.DateTimeParseException.class)
    public void testInvalidDatepArsing() {
        new Employee("Diya", "2024/07/25");
    }
}
