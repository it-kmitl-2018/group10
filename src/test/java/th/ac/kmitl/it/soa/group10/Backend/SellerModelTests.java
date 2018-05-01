package th.ac.kmitl.it.soa.group10.Backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.Backend.model.SellerModel;

import java.lang.annotation.Target;

import static org.junit.Assert.assertEquals;

public class SellerModelTests {

    @Test
    public void testID() {
        SellerModel seller = new SellerModel();
        seller.setId("0001");
        assertEquals("0001", seller.getId());
    }

    @Test
    public void testName() {
        SellerModel seller = new SellerModel();
        seller.setName("John");
        assertEquals("John", seller.getName());
    }

    @Test
    public void testEmail() {
        SellerModel seller = new SellerModel();
        seller.setEmail("John@gmail.com");
        assertEquals("John@gmail.com", seller.getEmail());
    }

    @Test
    public void testBuildingName() {
        SellerModel seller = new SellerModel();
        seller.setBuildingName("Gaysorn Plaza");
        assertEquals("Gaysorn Plaza", seller.getBuildingName());
    }

    @Test
    public void testBuildingNo() {
        SellerModel seller = new SellerModel();
        seller.setBuildingNo("58/2");
        assertEquals("58/2", seller.getBuildingNo());
    }

    @Test
    public void testVillage() {
        SellerModel seller = new SellerModel();
        seller.setVillage("-");
        assertEquals("-", seller.getVillage());
    }

    @Test
    public void testVillageNo() {
        SellerModel seller = new SellerModel();
        seller.setVillageNo("-");
        assertEquals("-", seller.getVillageNo());
    }

    @Test
    public void testStreet() {
        SellerModel seller = new SellerModel();
        seller.setStreet("henri dunant");
        assertEquals("henri dunant", seller.getStreet());
    }

    @Test
    public void testSubDistrict() {
        SellerModel seller = new SellerModel();
        seller.setSubDistrict("Lumphini");
        assertEquals("Lumphini", seller.getSubDistrict());
    }

    @Test
    public void testDistrict() {
        SellerModel seller = new SellerModel();
        seller.setDistrict("Patum-one");
        assertEquals("Patum-one", seller.getDistrict());
    }

    @Test
    public void testSubCountry() {
        SellerModel seller = new SellerModel();
        seller.setSubCountry("Bangkok");
        assertEquals("Bangkok", seller.getSubCountry());
    }

    @Test
    public void testCountry() {
        SellerModel seller = new SellerModel();
        seller.setCountry("Thailand");
        assertEquals("Thailand", seller.getCountry());
    }

    @Test
    public void testPostCode() {
        SellerModel seller = new SellerModel();
        seller.setPostCode("10330");
        assertEquals("10330", seller.getPostCode());
    }

    @Test
    public void testAddrLineOne() {
        SellerModel seller = new SellerModel();
        seller.setAddrLineOne("309 หมู่ 10 ถนนฉลองกรุง");
        assertEquals("309 หมู่ 10 ถนนฉลองกรุง", seller.getAddrLineOne());
    }

    @Test
    public void testAddrLineTwo() {
        SellerModel seller = new SellerModel();
        seller.setAddrLineTwo("458 หมู่ 3 ถนนรามอินทรา");
        assertEquals("458 หมู่ 3 ถนนรามอินทรา", seller.getAddrLineTwo());
    }
}
