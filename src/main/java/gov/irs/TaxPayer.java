package gov.irs;

public interface TaxPayer {
    static final double HOURLY_TAX_RATE = 0.25;
    static final double SALARIED_TAX_RATE = 0.30;
    static final double CORP_TAX_RATE = 0.10;
    static final double DEFAULT_STANDARD_EMPLOYEE_MONTHLY_DEDUCTION = 250.0;

    double computeMonthlyTaxToPay();
    default double computeStandardEmployeeMonthlyDeduction(){
        return DEFAULT_STANDARD_EMPLOYEE_MONTHLY_DEDUCTION;
    }
}
