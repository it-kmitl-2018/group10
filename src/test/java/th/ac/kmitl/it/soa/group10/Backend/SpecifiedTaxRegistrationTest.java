package th.ac.kmitl.it.soa.group10.Backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.Backend.model.DocumentRecipient.SpecifiedTaxRegistration;

import static org.junit.Assert.assertEquals;

public class SpecifiedTaxRegistrationTest {

    @Test
    public void testTaxID(){
        SpecifiedTaxRegistration specifiedTaxRegistration = new SpecifiedTaxRegistration();
        specifiedTaxRegistration.setTaxID("141247920");
        assertEquals("141247920", specifiedTaxRegistration.getTaxID());
    }
}
