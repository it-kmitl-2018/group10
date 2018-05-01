package th.ac.kmitl.it.soa.group10.Backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.Backend.model.SellerForm;

import static org.junit.Assert.assertEquals;

public class SellerFormTests {

    @Test
    public void testID() {
        SellerForm seller = new SellerForm();
        seller.setId("0001");
        assertEquals("0001", seller.getId());
    }

    @Test
    public void testName() {
        SellerForm seller = new SellerForm();
        seller.setName("John");
        assertEquals("John", seller.getName());
    }

    @Test
    public void testEmail() {
        SellerForm seller = new SellerForm();
        seller.setEmail("John@gmail.com");
        assertEquals("John@gmail.com", seller.getEmail());
    }

    @Test
    public void testBuildingName() {
        SellerForm seller = new SellerForm();
        seller.setBuildingName("Gaysorn Plaza");
        assertEquals("Gaysorn Plaza", seller.getBuildingName());
    }

    @Test
    public void testBuildingNo() {
        SellerForm seller = new SellerForm();
        seller.setBuildingNo("58/2");
        assertEquals("58/2", seller.getBuildingNo());
    }

    @Test
    public void testVillage() {
        SellerForm seller = new SellerForm();
        seller.setVillage("-");
        assertEquals("-", seller.getVillage());
    }

    @Test
    public void testVillageNo() {
        SellerForm seller = new SellerForm();
        seller.setVillageNo("-");
        assertEquals("-", seller.getVillageNo());
    }

    @Test
    public void testStreet() {
        SellerForm seller = new SellerForm();
        seller.setStreet("henri dunant");
        assertEquals("henri dunant", seller.getStreet());
    }

    @Test
    public void testSubDistrict() {
        SellerForm seller = new SellerForm();
        seller.setSubDistrict("Lumphini");
        assertEquals("Lumphini", seller.getSubDistrict());
    }

    @Test
    public void testDistrict() {
        SellerForm seller = new SellerForm();
        seller.setDistrict("Patum-one");
        assertEquals("Patum-one", seller.getDistrict());
    }

    @Test
    public void testSubCountry() {
        SellerForm seller = new SellerForm();
        seller.setSubCountry("Bangkok");
        assertEquals("Bangkok", seller.getSubCountry());
    }

    @Test
    public void testCountry() {
        SellerForm seller = new SellerForm();
        seller.setCountry("Thailand");
        assertEquals("Thailand", seller.getCountry());
    }

    @Test
    public void testPostCode() {
        SellerForm seller = new SellerForm();
        seller.setPostCode("10330");
        assertEquals("10330", seller.getPostCode());
    }

    @Test
    public void testAddrLineOne() {
        SellerForm seller = new SellerForm();
        seller.setAddrLineOne("309 หมู่ 10 ถนนฉลองกรุง");
        assertEquals("309 หมู่ 10 ถนนฉลองกรุง", seller.getAddrLineOne());
    }

    @Test
    public void testAddrLineTwo() {
        SellerForm seller = new SellerForm();
        seller.setAddrLineTwo("458 หมู่ 3 ถนนรามอินทรา");
        assertEquals("458 หมู่ 3 ถนนรามอินทรา", seller.getAddrLineTwo());
    }
}