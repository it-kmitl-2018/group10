package th.ac.kmitl.it.soa.group10.Backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.Backend.model.PayerTradePartyFormModel;
import static org.junit.Assert.assertEquals;

public class PayerTradePartyFormModelTest {
    @Test
    public void testPayerID() {
        PayerTradePartyFormModel PayerTradePartyFormModel = new PayerTradePartyFormModel();
        PayerTradePartyFormModel.setPayerID("0001");
        assertEquals("0001",PayerTradePartyFormModel.getPayerID());
    }

    @Test
    public void testPayerName() {
        PayerTradePartyFormModel PayerTradePartyFormModel = new PayerTradePartyFormModel();
        PayerTradePartyFormModel.setPayerName("jittakan");
        assertEquals("jittakan",PayerTradePartyFormModel.getPayerName());
    }

    @Test
    public void testPayerEmail() {
        PayerTradePartyFormModel PayerTradePartyFormModel = new PayerTradePartyFormModel();
        PayerTradePartyFormModel.setPayerEmail("jittakan@samplemail.com");
        assertEquals("jittakan@samplemail.com",PayerTradePartyFormModel.getPayerEmail());
    }

    @Test
    public void testPayerBuildingName() {
        PayerTradePartyFormModel PayerTradePartyFormModel = new PayerTradePartyFormModel();
        PayerTradePartyFormModel.setPayerBuildingName("-");
        assertEquals("-",PayerTradePartyFormModel.getPayerBuildingName());
    }

    @Test
    public void testPayerBuildingNo() {
        PayerTradePartyFormModel PayerTradePartyFormModel = new PayerTradePartyFormModel();
        PayerTradePartyFormModel.setPayerBuildingNo("232");
        assertEquals("232",PayerTradePartyFormModel.getPayerBuildingNo());
    }

    @Test
    public void testPayerVillage() {
        PayerTradePartyFormModel PayerTradePartyFormModel = new PayerTradePartyFormModel();
        PayerTradePartyFormModel.setPayerVillage("-");
        assertEquals("-",PayerTradePartyFormModel.getPayerVillage());
    }

    @Test
    public void testPayerVillageNo() {
        PayerTradePartyFormModel PayerTradePartyFormModel = new PayerTradePartyFormModel();
        PayerTradePartyFormModel.setPayerVillageNo("-");
        assertEquals("-",PayerTradePartyFormModel.getPayerVillageNo());
    }

    @Test
    public void testPayerStreet() {
        PayerTradePartyFormModel PayerTradePartyFormModel = new PayerTradePartyFormModel();
        PayerTradePartyFormModel.setPayerStreet("Ladkrabang");
        assertEquals("Ladkrabang",PayerTradePartyFormModel.getPayerStreet());
    }

    @Test
    public void testPayerSubDistrict() {
        PayerTradePartyFormModel PayerTradePartyFormModel = new PayerTradePartyFormModel();
        PayerTradePartyFormModel.setPayerSubDistrict("Ladkrabang");
        assertEquals("Ladkrabang",PayerTradePartyFormModel.getPayerSubDistrict());
    }

    @Test
    public void testPayerDistrict() {
        PayerTradePartyFormModel PayerTradePartyFormModel = new PayerTradePartyFormModel();
        PayerTradePartyFormModel.setPayerDistrict("Ladkrabang");
        assertEquals("Ladkrabang",PayerTradePartyFormModel.getPayerDistrict());
    }

    @Test
    public void testPayerSubCountry() {
        PayerTradePartyFormModel PayerTradePartyFormModel = new PayerTradePartyFormModel();
        PayerTradePartyFormModel.setPayerSubCountry("Bangkok");
        assertEquals("Bangkok",PayerTradePartyFormModel.getPayerSubCountry());
    }


    @Test
    public void testPayerCountryCode() {
        PayerTradePartyFormModel PayerTradePartyFormModel = new PayerTradePartyFormModel();
        PayerTradePartyFormModel.setPayerCountryCode("66");
        assertEquals("66",PayerTradePartyFormModel.getPayerCountryCode());
    }

    @Test
    public void testPayerPostCode() {
        PayerTradePartyFormModel PayerTradePartyFormModel = new PayerTradePartyFormModel();
        PayerTradePartyFormModel.setPayerPostCode("10520");
        assertEquals("10520",PayerTradePartyFormModel.getPayerPostCode());
    }

    @Test
    public void testPayerAddrLineOne() {
        PayerTradePartyFormModel PayerTradePartyFormModel = new PayerTradePartyFormModel();
        PayerTradePartyFormModel.setPayerAddrLineOne("232 Ladkrabang 52 District Ladkrabang Sub-District Ladkrabang");
        assertEquals("232 Ladkrabang 52 District Ladkrabang Sub-District Ladkrabang",PayerTradePartyFormModel.getPayerAddrLineOne());
    }

    @Test
    public void testPayerAddrLineTwo() {
        PayerTradePartyFormModel PayerTradePartyFormModel = new PayerTradePartyFormModel();
        PayerTradePartyFormModel.setPayerAddrLineTwo("SubCountry Bangkok poltalcode 10520");
        assertEquals("SubCountry Bangkok poltalcode 10520",PayerTradePartyFormModel.getPayerAddrLineTwo());
    }
}
