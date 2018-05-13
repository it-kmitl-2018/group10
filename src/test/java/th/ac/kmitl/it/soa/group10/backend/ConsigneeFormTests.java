package th.ac.kmitl.it.soa.group10.backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.backend.model.ConsigneeForm;

import static org.junit.Assert.assertEquals;

public class ConsigneeFormTests {


    @Test
    public void testID() {
        ConsigneeForm consignee = new ConsigneeForm();
        consignee.setId("0001");
        assertEquals("0001", consignee.getId());
    }

    @Test
    public void testName() {
        ConsigneeForm consignee = new ConsigneeForm();
        consignee.setName("John");
        assertEquals("John", consignee.getName());
    }

    @Test
    public void testEmail() {
        ConsigneeForm consignee = new ConsigneeForm();
        consignee.setEmail("John@gmail.com");
        assertEquals("John@gmail.com", consignee.getEmail());
    }

    @Test
    public void testBuildingName() {
        ConsigneeForm consignee = new ConsigneeForm();
        consignee.setBuildingName("Gaysorn Plaza");
        assertEquals("Gaysorn Plaza", consignee.getBuildingName());
    }

    @Test
    public void testBuildingNo() {
        ConsigneeForm consignee = new ConsigneeForm();
        consignee.setBuildingNo("58/2");
        assertEquals("58/2", consignee.getBuildingNo());
    }

    @Test
    public void testVillage() {
        ConsigneeForm consignee = new ConsigneeForm();
        consignee.setVillage("-");
        assertEquals("-", consignee.getVillage());
    }

    @Test
    public void testVillageNo() {
        ConsigneeForm consignee = new ConsigneeForm();
        consignee.setVillageNo("-");
        assertEquals("-", consignee.getVillageNo());
    }

    @Test
    public void testStreet() {
        ConsigneeForm consignee = new ConsigneeForm();
        consignee.setStreet("henri dunant");
        assertEquals("henri dunant", consignee.getStreet());
    }

    @Test
    public void testSubDistrict() {
        ConsigneeForm consignee = new ConsigneeForm();
        consignee.setSubDistrict("Lumphini");
        assertEquals("Lumphini", consignee.getSubDistrict());
    }

    @Test
    public void testDistrict() {
        ConsigneeForm consignee = new ConsigneeForm();
        consignee.setDistrict("Patum-one");
        assertEquals("Patum-one", consignee.getDistrict());
    }

    @Test
    public void testSubCountry() {
        ConsigneeForm consignee = new ConsigneeForm();
        consignee.setSubCountry("Bangkok");
        assertEquals("Bangkok", consignee.getSubCountry());
    }

    @Test
    public void testCountry() {
        ConsigneeForm consignee = new ConsigneeForm();
        consignee.setCountry("Thailand");
        assertEquals("Thailand", consignee.getCountry());
    }

    @Test
    public void testPostCode() {
        ConsigneeForm consignee = new ConsigneeForm();
        consignee.setPostCode("10330");
        assertEquals("10330", consignee.getPostCode());
    }

    @Test
    public void testAddrLineOne() {
        ConsigneeForm consignee = new ConsigneeForm();
        consignee.setAddrLineOne("309 หมู่ 10 ถนนฉลองกรุง");
        assertEquals("309 หมู่ 10 ถนนฉลองกรุง", consignee.getAddrLineOne());
    }

    @Test
    public void testAddrLineTwo() {
        ConsigneeForm consignee = new ConsigneeForm();
        consignee.setAddrLineTwo("458 หมู่ 3 ถนนรามอินทรา");
        assertEquals("458 หมู่ 3 ถนนรามอินทรา", consignee.getAddrLineTwo());
    }
}
