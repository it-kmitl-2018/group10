package th.ac.kmitl.it.soa.group10.backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.backend.model.EmailForm;

import static org.junit.Assert.assertEquals;

public class EmailFormTest {

    @Test
    public void emailTest(){
        EmailForm emailModel = new EmailForm();
        emailModel.setEmail("58070068@kmitl.ac.th");
        assertEquals("58070068@kmitl.ac.th", emailModel.getEmail());
    }
}
