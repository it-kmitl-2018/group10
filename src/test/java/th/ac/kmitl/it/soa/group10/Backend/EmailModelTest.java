package th.ac.kmitl.it.soa.group10.backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.backend.model.EmailModel;

import static org.junit.Assert.assertEquals;

public class EmailModelTest {

    @Test
    public void emailTest(){
        EmailModel emailModel = new EmailModel();
        emailModel.setEmail("58070068@kmitl.ac.th");
        assertEquals("58070068@kmitl.ac.th", emailModel.getEmail());
    }
}
