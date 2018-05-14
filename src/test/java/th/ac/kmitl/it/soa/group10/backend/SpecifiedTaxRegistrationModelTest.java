package th.ac.kmitl.it.soa.group10.backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.backend.model.SpecifiedTaxRegistrationModel;

import static org.junit.Assert.assertEquals;

public class SpecifiedTaxRegistrationModelTest {

    @Test
    public void taxIDTest(){
        SpecifiedTaxRegistrationModel specifiedTaxRegistration = new SpecifiedTaxRegistrationModel();
        specifiedTaxRegistration.setTaxID("123768");
        assertEquals("123768", specifiedTaxRegistration.getTaxID());
    }

}