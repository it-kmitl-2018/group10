package th.ac.kmitl.it.soa.group10.Backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.Backend.model.supplychaintradetransaction.PostalTradeAddressModel;

import static org.junit.Assert.assertEquals;

public class PostalTradeAdressModelTest {

    @Test
    public void postalCodeTest(){
        PostalTradeAddressModel postalTradeAddress = new PostalTradeAddressModel();
        postalTradeAddress.setPostalCode("14114");
        assertEquals("14114", postalTradeAddress.getPostalCode());
    }

    @Test
    public void buildingTest(){
        PostalTradeAddressModel postalTradeAddress = new PostalTradeAddressModel();
        postalTradeAddress.setBuilding("utopia");
        assertEquals("utopia", postalTradeAddress.getBuilding());
    }

    @Test
    public void addressLineOneTest(){
        PostalTradeAddressModel postalTradeAddress = new PostalTradeAddressModel();
        postalTradeAddress.setAddressLineOne("123567");
        assertEquals("123567", postalTradeAddress.getAddressLineOne());
    }

    @Test
    public void addressLineTwoTest(){
        PostalTradeAddressModel postalTradeAddress = new PostalTradeAddressModel();
        postalTradeAddress.setAddressLineTwo("12367");
        assertEquals("12367", postalTradeAddress.getAddressLineTwo());
    }

    @Test
    public void addressLineThreeTest(){
        PostalTradeAddressModel postalTradeAddress = new PostalTradeAddressModel();
        postalTradeAddress.setAddressLineThree("23567");
        assertEquals("23567", postalTradeAddress.getAddressLineThree());
    }

    @Test
    public void addressLineFourTest(){
        PostalTradeAddressModel postalTradeAddress = new PostalTradeAddressModel();
        postalTradeAddress.setAddressLineFour("17");
        assertEquals("17", postalTradeAddress.getAddressLineFour());
    }

    @Test
    public void addressLineFiveTest(){
        PostalTradeAddressModel postalTradeAddress = new PostalTradeAddressModel();
        postalTradeAddress.setAddressLineFive("567");
        assertEquals("567", postalTradeAddress.getAddressLineFive());
    }

    @Test
    public void streetTest(){
        PostalTradeAddressModel postalTradeAddress = new PostalTradeAddressModel();
        postalTradeAddress.setStreet("ladkrabang");
        assertEquals("ladkrabang", postalTradeAddress.getStreet());
    }

    @Test
    public void districtTest(){
        PostalTradeAddressModel postalTradeAddress = new PostalTradeAddressModel();
        postalTradeAddress.setDistrict("ladkrabang");
        assertEquals("ladkrabang", postalTradeAddress.getDistrict());
    }

    @Test
    public void subDistrictTest(){
        PostalTradeAddressModel postalTradeAddress = new PostalTradeAddressModel();
        postalTradeAddress.setSubDistrict("cat");
        assertEquals("cat", postalTradeAddress.getSubDistrict());
    }

    @Test
    public void countryIDTest(){
        PostalTradeAddressModel postalTradeAddress = new PostalTradeAddressModel();
        postalTradeAddress.setCountryID("666777");
        assertEquals("666777", postalTradeAddress.getCountryID());
    }

    @Test
    public void provinceIDTest(){
        PostalTradeAddressModel postalTradeAddress = new PostalTradeAddressModel();
        postalTradeAddress.setProvinceID("668777");
        assertEquals("668777", postalTradeAddress.getProvinceID());
    }

    @Test
    public void houseNumber(){
        PostalTradeAddressModel postalTradeAddress = new PostalTradeAddressModel();
        postalTradeAddress.setCountryID("41/76777");
        assertEquals("41/76777", postalTradeAddress.getCountryID());
    }

}
