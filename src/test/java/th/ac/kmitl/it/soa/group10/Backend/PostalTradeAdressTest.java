package th.ac.kmitl.it.soa.group10.Backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.Backend.model.DocumentRecipient.PostalTradeAddress;

import static org.junit.Assert.assertEquals;

public class PostalTradeAdressTest {

    @Test
    public void postalCodeTest(){
        PostalTradeAddress postalTradeAddress = new PostalTradeAddress();
        postalTradeAddress.setPostalCode("14114");
        assertEquals("14114", postalTradeAddress.getPostalCode());
    }

    @Test
    public void buildingTest(){
        PostalTradeAddress postalTradeAddress = new PostalTradeAddress();
        postalTradeAddress.setBuilding("utopia");
        assertEquals("utopia", postalTradeAddress.getBuilding());
    }

    @Test
    public void addressLineOneTest(){
        PostalTradeAddress postalTradeAddress = new PostalTradeAddress();
        postalTradeAddress.setAddressLineOne("123567");
        assertEquals("123567", postalTradeAddress.getAddressLineOne());
    }

    @Test
    public void addressLineTwoTest(){
        PostalTradeAddress postalTradeAddress = new PostalTradeAddress();
        postalTradeAddress.setAddressLineTwo("12367");
        assertEquals("12367", postalTradeAddress.getAddressLineTwo());
    }

    @Test
    public void addressLineThreeTest(){
        PostalTradeAddress postalTradeAddress = new PostalTradeAddress();
        postalTradeAddress.setAddressLineThree("23567");
        assertEquals("23567", postalTradeAddress.getAddressLineThree());
    }

    @Test
    public void addressLineFourTest(){
        PostalTradeAddress postalTradeAddress = new PostalTradeAddress();
        postalTradeAddress.setAddressLineFour("17");
        assertEquals("17", postalTradeAddress.getAddressLineFour());
    }

    @Test
    public void addressLineFiveTest(){
        PostalTradeAddress postalTradeAddress = new PostalTradeAddress();
        postalTradeAddress.setAddressLineFive("567");
        assertEquals("567", postalTradeAddress.getAddressLineFive());
    }

    @Test
    public void streetTest(){
        PostalTradeAddress postalTradeAddress = new PostalTradeAddress();
        postalTradeAddress.setStreet("ladkrabang");
        assertEquals("ladkrabang", postalTradeAddress.getStreet());
    }

    @Test
    public void districtTest(){
        PostalTradeAddress postalTradeAddress = new PostalTradeAddress();
        postalTradeAddress.setDistrict("ladkrabang");
        assertEquals("ladkrabang", postalTradeAddress.getDistrict());
    }

    @Test
    public void subDistrictTest(){
        PostalTradeAddress postalTradeAddress = new PostalTradeAddress();
        postalTradeAddress.setSubDistrict("cat");
        assertEquals("cat", postalTradeAddress.getSubDistrict());
    }

    @Test
    public void countryIDTest(){
        PostalTradeAddress postalTradeAddress = new PostalTradeAddress();
        postalTradeAddress.setCountryID("666777");
        assertEquals("666777", postalTradeAddress.getCountryID());
    }

    @Test
    public void provinceIDTest(){
        PostalTradeAddress postalTradeAddress = new PostalTradeAddress();
        postalTradeAddress.setProvinceID("668777");
        assertEquals("668777", postalTradeAddress.getProvinceID());
    }

    @Test
    public void houseNumber(){
        PostalTradeAddress postalTradeAddress = new PostalTradeAddress();
        postalTradeAddress.setCountryID("41/76777");
        assertEquals("41/76777", postalTradeAddress.getCountryID());
    }

}
