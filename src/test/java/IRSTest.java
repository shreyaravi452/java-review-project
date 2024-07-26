import gov.irs.IRS;
import gov.irs.TaxPayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IRSTest {
    private IRS irs;

    @Before
    public void setUp(){
        irs = new IRS();
        TaxPayer taxPayer = new TaxPayer() {
            @Override
            public double computeMonthlyTaxToPay() {
                return 0;
            }
        };
        irs.register(taxPayer);
    }

    @Test
    public void testComputeTotalMonthlyTaxToCollect(){
        assertEquals(0.0, irs.computeTotalMonthlyTaxToCollect(), 0.1);
    }

}
