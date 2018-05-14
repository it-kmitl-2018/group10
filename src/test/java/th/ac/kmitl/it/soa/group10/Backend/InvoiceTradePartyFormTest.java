package th.ac.kmitl.it.soa.group10.backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.backend.model.supplychaintradetransaction.InvoiceTradePartyForm;

import static org.junit.Assert.assertEquals;

public class InvoiceTradePartyFormTest {

    @Test
    public void idTest(){
        InvoiceTradePartyForm invoiceeTradeParty = new InvoiceTradePartyForm();
        invoiceeTradeParty.setId("000009");
        assertEquals("000009", invoiceeTradeParty.getId());
    }

    @Test
    public void globalIDTest(){
        InvoiceTradePartyForm invoiceeTradeParty = new InvoiceTradePartyForm();
        invoiceeTradeParty.setGloBalID("3333456");
        assertEquals("3333456", invoiceeTradeParty.getGloBalID());
    }

    @Test
    public void nameTest(){
        InvoiceTradePartyForm invoiceeTradeParty = new InvoiceTradePartyForm();
        invoiceeTradeParty.setName("CaramelSugar");
        assertEquals("CaramelSugar", invoiceeTradeParty.getName());
    }

}
