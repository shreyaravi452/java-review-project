package gov.irs;

public class IRS {
    private TaxPayer[] taxPayers = new TaxPayer[100];
    private int currentIndex = 0;

    public void register(TaxPayer taxPayer){
        this.taxPayers[this.currentIndex] = taxPayer;
        this.currentIndex++;
    }
    public double computeTotalMonthlyTaxToCollect() {
        double total = 0.0;
        for (int i = 0; i < this.taxPayers.length; i++) {
            if(this.taxPayers[i]!=null)
                total+=this.taxPayers[i].computeMonthlyTaxToPay();
        }
        return total;
    }
}
