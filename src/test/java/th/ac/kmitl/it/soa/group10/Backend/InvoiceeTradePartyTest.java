package th.ac.kmitl.it.soa.group10.Backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.Backend.model.DocumentRecipient.InvoiceeTradeParty;

import static org.junit.Assert.assertEquals;

public class InvoiceeTradePartyTest {

    @Test
    public void idTest(){
        InvoiceeTradeParty invoiceeTradeParty = new InvoiceeTradeParty();
        invoiceeTradeParty.setId("000009");
        assertEquals("000009", invoiceeTradeParty.getId());
    }

    @Test
    public void globalIDTest(){
        InvoiceeTradeParty invoiceeTradeParty = new InvoiceeTradeParty();
        invoiceeTradeParty.setGloBalID("3333456");
        assertEquals("3333456", invoiceeTradeParty.getGloBalID());
    }

    @Test
    public void nameTest(){
        InvoiceeTradeParty invoiceeTradeParty = new InvoiceeTradeParty();
        invoiceeTradeParty.setName("CaramelSugar");
        assertEquals("CaramelSugar", invoiceeTradeParty.getName());
    }

}
