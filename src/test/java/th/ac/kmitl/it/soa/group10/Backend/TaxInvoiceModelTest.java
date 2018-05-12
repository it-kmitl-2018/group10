package th.ac.kmitl.it.soa.group10.Backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.Backend.model.supplychaintradetransaction.TaxInvoiceModel;

import static org.junit.Assert.assertEquals;

public class TaxInvoiceModelTest {

    @Test
    public void taxCodeTest() {
        TaxInvoiceModel taxInvoice = new TaxInvoiceModel();
        taxInvoice.setTaxCode("75431");
        assertEquals("75431", taxInvoice.getTaxCode());
    }

    @Test
    public void taxRateTest() {
        TaxInvoiceModel taxInvoice = new TaxInvoiceModel();
        taxInvoice.setTaxRate("324");
        assertEquals("324", taxInvoice.getTaxRate());
    }

    @Test
    public void valueAmountTest() {
        TaxInvoiceModel taxInvoice = new TaxInvoiceModel();
        taxInvoice.setValueAmount("144404");
        assertEquals("144404", taxInvoice.getValueAmount());
    }

    @Test
    public void vatAmountTest() {
        TaxInvoiceModel taxInvoice = new TaxInvoiceModel();
        taxInvoice.setVatAmount("774");
        assertEquals("774", taxInvoice.getVatAmount());
    }
    
}
