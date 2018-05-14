package th.ac.kmitl.it.soa.group10.backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.backend.converters.JsonConverter;
import th.ac.kmitl.it.soa.group10.backend.model.json.supplychaintradetransaction.EmailModel;

import static org.junit.Assert.assertEquals;

public class EmailModelTest {
    private String email = "sdjksadhf@hotmail.ccm";

    @Test
    public void getEmailTest(){
        EmailModel emailModel = EmailModel.builder()
                .email(this.email)
                .build();

        assertEquals(this.email, emailModel.email);
    }

    @Test
    public void getCorrectJsonTest(){
        EmailModel emailModel = EmailModel.builder()
                .email(this.email)
                .build();

        String expectedJsonString
                = "{\n"
                + "    \"email\" : \""+email+"\"\n"
                + "}";

        JsonConverter jsonConverter = new JsonConverter();

        assertEquals(expectedJsonString, jsonConverter.toJson(emailModel));

    }

}
