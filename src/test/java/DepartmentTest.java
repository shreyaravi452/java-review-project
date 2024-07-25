import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepartmentTest {
    private Department department;
    private Employee employee1;
    private Employee employee2;

    @Before
    public void setUp() {
        department = new Department("HR", "Headquarters");
        employee1 = new Employee("Shreya", "2018-06-15");
        employee2 = new Employee("Diya", "2019-01-20");
    }

    @Test
    public void testAddEmployee() {
        department.addEmployee(employee1);

        assertEquals(employee1, department.getEmployees()[0]);
    }

    @Test
    public void testLetEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        department.addEmployee(employee1);
        department.addEmployee(employee2);
        int numberOfEmployeesWhoWorked = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        assertEquals(2, numberOfEmployeesWhoWorked);
    }
}
