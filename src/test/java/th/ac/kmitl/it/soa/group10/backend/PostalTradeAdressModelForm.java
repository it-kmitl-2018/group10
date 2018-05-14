package th.ac.kmitl.it.soa.group10.backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.backend.model.supplychaintradetransaction.PostalTradeAddressForm;

import static org.junit.Assert.assertEquals;

public class PostalTradeAdressModelForm {

    @Test
    public void postalCodeTest(){
        PostalTradeAddressForm postalTradeAddress = new PostalTradeAddressForm();
        postalTradeAddress.setPostalCode("14114");
        assertEquals("14114", postalTradeAddress.getPostalCode());
    }

    @Test
    public void buildingTest(){
        PostalTradeAddressForm postalTradeAddress = new PostalTradeAddressForm();
        postalTradeAddress.setBuilding("utopia");
        assertEquals("utopia", postalTradeAddress.getBuilding());
    }

    @Test
    public void addressLineOneTest(){
        PostalTradeAddressForm postalTradeAddress = new PostalTradeAddressForm();
        postalTradeAddress.setAddressLineOne("123567");
        assertEquals("123567", postalTradeAddress.getAddressLineOne());
    }

    @Test
    public void addressLineTwoTest(){
        PostalTradeAddressForm postalTradeAddress = new PostalTradeAddressForm();
        postalTradeAddress.setAddressLineTwo("12367");
        assertEquals("12367", postalTradeAddress.getAddressLineTwo());
    }

    @Test
    public void addressLineThreeTest(){
        PostalTradeAddressForm postalTradeAddress = new PostalTradeAddressForm();
        postalTradeAddress.setAddressLineThree("23567");
        assertEquals("23567", postalTradeAddress.getAddressLineThree());
    }

    @Test
    public void addressLineFourTest(){
        PostalTradeAddressForm postalTradeAddress = new PostalTradeAddressForm();
        postalTradeAddress.setAddressLineFour("17");
        assertEquals("17", postalTradeAddress.getAddressLineFour());
    }

    @Test
    public void addressLineFiveTest(){
        PostalTradeAddressForm postalTradeAddress = new PostalTradeAddressForm();
        postalTradeAddress.setAddressLineFive("567");
        assertEquals("567", postalTradeAddress.getAddressLineFive());
    }

    @Test
    public void streetTest(){
        PostalTradeAddressForm postalTradeAddress = new PostalTradeAddressForm();
        postalTradeAddress.setStreet("ladkrabang");
        assertEquals("ladkrabang", postalTradeAddress.getStreet());
    }

    @Test
    public void districtTest(){
        PostalTradeAddressForm postalTradeAddress = new PostalTradeAddressForm();
        postalTradeAddress.setDistrict("ladkrabang");
        assertEquals("ladkrabang", postalTradeAddress.getDistrict());
    }

    @Test
    public void subDistrictTest(){
        PostalTradeAddressForm postalTradeAddress = new PostalTradeAddressForm();
        postalTradeAddress.setSubDistrict("cat");
        assertEquals("cat", postalTradeAddress.getSubDistrict());
    }

    @Test
    public void countryIDTest(){
        PostalTradeAddressForm postalTradeAddress = new PostalTradeAddressForm();
        postalTradeAddress.setCountryID("666777");
        assertEquals("666777", postalTradeAddress.getCountryID());
    }

    @Test
    public void provinceIDTest(){
        PostalTradeAddressForm postalTradeAddress = new PostalTradeAddressForm();
        postalTradeAddress.setProvinceID("668777");
        assertEquals("668777", postalTradeAddress.getProvinceID());
    }

    @Test
    public void houseNumber(){
        PostalTradeAddressForm postalTradeAddress = new PostalTradeAddressForm();
        postalTradeAddress.setCountryID("41/76777");
        assertEquals("41/76777", postalTradeAddress.getCountryID());
    }

}
