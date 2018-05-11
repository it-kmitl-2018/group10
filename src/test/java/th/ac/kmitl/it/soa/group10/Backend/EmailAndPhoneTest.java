package th.ac.kmitl.it.soa.group10.Backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.Backend.model.DocumentRecipient.EmailAndPhone;

import static org.junit.Assert.assertEquals;

public class EmailAndPhoneTest {

    @Test
    public void emailTest(){
        EmailAndPhone emailAndPhone = new EmailAndPhone();
        emailAndPhone.setEmail("amoeba@hotmail.com");
        assertEquals("amoeba@hotmail.com", emailAndPhone.getEmail());
    }

    @Test
    public void phoneNumberTest(){
        EmailAndPhone emailAndPhone = new EmailAndPhone();
        emailAndPhone.setPhoneNumber("0901201451");
        assertEquals("0901201451", emailAndPhone.getPhoneNumber());
    }

}
