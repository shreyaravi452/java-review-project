import com.hr.corp.Corporation;
import gov.irs.TaxPayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CorporationTest {
    private TaxPayer corp;

    @Before
    public void setUp(){
        corp = new Corporation("LIC", 35000);
    }

    @Test
    public void testComputeMonthlyTaxToPay(){
        double expectedInfo = 35000*0.1;
        assertEquals(expectedInfo, corp.computeMonthlyTaxToPay(), 0.1);
    }
}
