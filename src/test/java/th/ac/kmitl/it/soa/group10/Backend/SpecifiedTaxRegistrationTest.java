package th.ac.kmitl.it.soa.group10.backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.backend.model.SpecifiedTaxRegistration;

import static org.junit.Assert.assertEquals;

public class SpecifiedTaxRegistrationTest {

    @Test
    public void taxIDTest(){
        SpecifiedTaxRegistration specifiedTaxRegistration = new SpecifiedTaxRegistration();
        specifiedTaxRegistration.setTaxID("123768");
        assertEquals("123768", specifiedTaxRegistration.getTaxID());
    }

}
