package th.ac.kmitl.it.soa.group10.Backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.Backend.model.ConsigneeModel;

import static org.junit.Assert.assertEquals;

public class ConsigneeModelTests {


    @Test
    public void testID() {
        ConsigneeModel consignee = new ConsigneeModel();
        consignee.setId("0001");
        assertEquals("0001", consignee.getId());
    }

    @Test
    public void testName() {
        ConsigneeModel consignee = new ConsigneeModel();
        consignee.setName("John");
        assertEquals("John", consignee.getName());
    }

    @Test
    public void testEmail() {
        ConsigneeModel consignee = new ConsigneeModel();
        consignee.setEmail("John@gmail.com");
        assertEquals("John@gmail.com", consignee.getEmail());
    }

    @Test
    public void testBuildingName() {
        ConsigneeModel consignee = new ConsigneeModel();
        consignee.setBuildingName("Gaysorn Plaza");
        assertEquals("Gaysorn Plaza", consignee.getBuildingName());
    }

    @Test
    public void testBuildingNo() {
        ConsigneeModel consignee = new ConsigneeModel();
        consignee.setBuildingNo("58/2");
        assertEquals("58/2", consignee.getBuildingNo());
    }

    @Test
    public void testVillage() {
        ConsigneeModel consignee = new ConsigneeModel();
        consignee.setVillage("-");
        assertEquals("-", consignee.getVillage());
    }

    @Test
    public void testVillageNo() {
        ConsigneeModel consignee = new ConsigneeModel();
        consignee.setVillageNo("-");
        assertEquals("-", consignee.getVillageNo());
    }

    @Test
    public void testStreet() {
        ConsigneeModel consignee = new ConsigneeModel();
        consignee.setStreet("henri dunant");
        assertEquals("henri dunant", consignee.getStreet());
    }

    @Test
    public void testSubDistrict() {
        ConsigneeModel consignee = new ConsigneeModel();
        consignee.setSubDistrict("Lumphini");
        assertEquals("Lumphini", consignee.getSubDistrict());
    }

    @Test
    public void testDistrict() {
        ConsigneeModel consignee = new ConsigneeModel();
        consignee.setDistrict("Patum-one");
        assertEquals("Patum-one", consignee.getDistrict());
    }

    @Test
    public void testSubCountry() {
        ConsigneeModel consignee = new ConsigneeModel();
        consignee.setSubCountry("Bangkok");
        assertEquals("Bangkok", consignee.getSubCountry());
    }

    @Test
    public void testCountry() {
        ConsigneeModel consignee = new ConsigneeModel();
        consignee.setCountry("Thailand");
        assertEquals("Thailand", consignee.getCountry());
    }

    @Test
    public void testPostCode() {
        ConsigneeModel consignee = new ConsigneeModel();
        consignee.setPostCode("10330");
        assertEquals("10330", consignee.getPostCode());
    }

    @Test
    public void testAddrLineOne() {
        ConsigneeModel consignee = new ConsigneeModel();
        consignee.setAddrLineOne("309 หมู่ 10 ถนนฉลองกรุง");
        assertEquals("309 หมู่ 10 ถนนฉลองกรุง", consignee.getAddrLineOne());
    }

    @Test
    public void testAddrLineTwo() {
        ConsigneeModel consignee = new ConsigneeModel();
        consignee.setAddrLineTwo("458 หมู่ 3 ถนนรามอินทรา");
        assertEquals("458 หมู่ 3 ถนนรามอินทรา", consignee.getAddrLineTwo());
    }
}
