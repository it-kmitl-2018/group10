package th.ac.kmitl.it.soa.group10.backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.backend.model.SpecifiedTaxRegistrationForm;

import static org.junit.Assert.assertEquals;

public class SpecifiedTaxRegistrationFormTest {

    @Test
    public void taxIDTest(){
        SpecifiedTaxRegistrationForm specifiedTaxRegistration = new SpecifiedTaxRegistrationForm();
        specifiedTaxRegistration.setTaxID("123768");
        assertEquals("123768", specifiedTaxRegistration.getTaxID());
    }

}