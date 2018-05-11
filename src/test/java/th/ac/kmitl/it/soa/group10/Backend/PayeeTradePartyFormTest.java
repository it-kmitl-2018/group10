package th.ac.kmitl.it.soa.group10.Backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.Backend.model.PayeeTradePartyFormModel;
import static org.junit.Assert.assertEquals;

public class PayeeTradePartyFormTest {

    @Test
    public void testPayeeID() {
        PayeeTradePartyFormModel payeeTradePartyFormModel = new PayeeTradePartyFormModel();
        payeeTradePartyFormModel.setPayeeID("0001");
        assertEquals("0001",payeeTradePartyFormModel.getPayeeID());
    }

    @Test
    public void testPayeeName() {
        PayeeTradePartyFormModel payeeTradePartyFormModel = new PayeeTradePartyFormModel();
        payeeTradePartyFormModel.setPayeeName("jittakan");
        assertEquals("jittakan",payeeTradePartyFormModel.getPayeeName());
    }

    @Test
    public void testPayeeEmail() {
        PayeeTradePartyFormModel payeeTradePartyFormModel = new PayeeTradePartyFormModel();
        payeeTradePartyFormModel.setPayeeEmail("jittakan@samplemail.com");
        assertEquals("jittakan@samplemail.com",payeeTradePartyFormModel.getPayeeEmail());
    }

    @Test
    public void testPayeeBuildingName() {
        PayeeTradePartyFormModel payeeTradePartyFormModel = new PayeeTradePartyFormModel();
        payeeTradePartyFormModel.setPayeeBuildingName("-");
        assertEquals("-",payeeTradePartyFormModel.getPayeeBuildingName());
    }

    @Test
    public void testPayeeBuildingNo() {
        PayeeTradePartyFormModel payeeTradePartyFormModel = new PayeeTradePartyFormModel();
        payeeTradePartyFormModel.setPayeeBuildingNo("232");
        assertEquals("232",payeeTradePartyFormModel.getPayeeBuildingNo());
    }

    @Test
    public void testPayeeVillage() {
        PayeeTradePartyFormModel payeeTradePartyFormModel = new PayeeTradePartyFormModel();
        payeeTradePartyFormModel.setPayeeVillage("-");
        assertEquals("-",payeeTradePartyFormModel.getPayeeVillage());
    }

    @Test
    public void testPayeeVillageNo() {
        PayeeTradePartyFormModel payeeTradePartyFormModel = new PayeeTradePartyFormModel();
        payeeTradePartyFormModel.setPayeeVillageNo("-");
        assertEquals("-",payeeTradePartyFormModel.getPayeeVillageNo());
    }

    @Test
    public void testPayeeStreet() {
        PayeeTradePartyFormModel payeeTradePartyFormModel = new PayeeTradePartyFormModel();
        payeeTradePartyFormModel.setPayeeStreet("Ladkrabang");
        assertEquals("Ladkrabang",payeeTradePartyFormModel.getPayeeStreet());
    }

    @Test
    public void testPayeeSubDistrict() {
        PayeeTradePartyFormModel payeeTradePartyFormModel = new PayeeTradePartyFormModel();
        payeeTradePartyFormModel.setPayeeSubDistrict("Ladkrabang");
        assertEquals("Ladkrabang",payeeTradePartyFormModel.getPayeeSubDistrict());
    }

    @Test
    public void testPayeeDistrict() {
        PayeeTradePartyFormModel payeeTradePartyFormModel = new PayeeTradePartyFormModel();
        payeeTradePartyFormModel.setPayeeDistrict("Ladkrabang");
        assertEquals("Ladkrabang",payeeTradePartyFormModel.getPayeeDistrict());
    }

    @Test
    public void testPayeeSubCountry() {
        PayeeTradePartyFormModel payeeTradePartyFormModel = new PayeeTradePartyFormModel();
        payeeTradePartyFormModel.setPayeeSubCountry("Bangkok");
        assertEquals("Bangkok",payeeTradePartyFormModel.getPayeeSubCountry());
    }


    @Test
    public void testPayeeCountryCode() {
        PayeeTradePartyFormModel payeeTradePartyFormModel = new PayeeTradePartyFormModel();
        payeeTradePartyFormModel.setPayeeCountryCode("66");
        assertEquals("66",payeeTradePartyFormModel.getPayeeCountryCode());
    }

    @Test
    public void testPayeePostCode() {
        PayeeTradePartyFormModel payeeTradePartyFormModel = new PayeeTradePartyFormModel();
        payeeTradePartyFormModel.setPayeePostCode("10520");
        assertEquals("10520",payeeTradePartyFormModel.getPayeePostCode());
    }

    @Test
    public void testPayeeAddrLineOne() {
        PayeeTradePartyFormModel payeeTradePartyFormModel = new PayeeTradePartyFormModel();
        payeeTradePartyFormModel.setPayeeAddrLineOne("232 Ladkrabang 52 District Ladkrabang Sub-District Ladkrabang");
        assertEquals("232 Ladkrabang 52 District Ladkrabang Sub-District Ladkrabang",payeeTradePartyFormModel.getPayeeAddrLineOne());
    }

    @Test
    public void testPayeeAddrLineTwo() {
        PayeeTradePartyFormModel payeeTradePartyFormModel = new PayeeTradePartyFormModel();
        payeeTradePartyFormModel.setPayeeAddrLineTwo("SubCountry Bangkok poltalcode 10520");
        assertEquals("SubCountry Bangkok poltalcode 10520",payeeTradePartyFormModel.getPayeeAddrLineTwo());
    }
}
