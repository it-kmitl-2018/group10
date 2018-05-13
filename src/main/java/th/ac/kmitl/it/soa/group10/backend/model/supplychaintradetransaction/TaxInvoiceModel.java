package th.ac.kmitl.it.soa.group10.backend.model.supplychaintradetransaction;

public class TaxInvoiceModel {
    private String taxCode;
    private String taxRate;
    private String valueAmount;
    private String vatAmount;

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public String getValueAmount() {
        return valueAmount;
    }

    public void setValueAmount(String valueAmount) {
        this.valueAmount = valueAmount;
    }

    public String getVatAmount() {
        return vatAmount;
    }

    public void setVatAmount(String vatAmount) {
        this.vatAmount = vatAmount;
    }
}
