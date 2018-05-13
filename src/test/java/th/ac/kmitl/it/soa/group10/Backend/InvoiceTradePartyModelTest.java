package th.ac.kmitl.it.soa.group10.backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.Backend.model.supplychaintradetransaction.InvoiceTradePartyModel;

import static org.junit.Assert.assertEquals;

public class InvoiceTradePartyModelTest {

    @Test
    public void idTest(){
        InvoiceTradePartyModel invoiceeTradeParty = new InvoiceTradePartyModel();
        invoiceeTradeParty.setId("000009");
        assertEquals("000009", invoiceeTradeParty.getId());
    }

    @Test
    public void globalIDTest(){
        InvoiceTradePartyModel invoiceeTradeParty = new InvoiceTradePartyModel();
        invoiceeTradeParty.setGloBalID("3333456");
        assertEquals("3333456", invoiceeTradeParty.getGloBalID());
    }

    @Test
    public void nameTest(){
        InvoiceTradePartyModel invoiceeTradeParty = new InvoiceTradePartyModel();
        invoiceeTradeParty.setName("CaramelSugar");
        assertEquals("CaramelSugar", invoiceeTradeParty.getName());
    }

}
