package th.ac.kmitl.it.soa.group10.backend;

import org.junit.Test;
import th.ac.kmitl.it.soa.group10.backend.converters.JsonConverter;
import th.ac.kmitl.it.soa.group10.backend.model.json.supplychaintradetransaction.PostalTradeAddressModel;
import static org.junit.Assert.assertEquals;

public class PostalTradeAddressModelTest {

   private String postCode = "14572";
   private String building = "23423420";
   private String addressLineOne = "4512";
   private String addressLineTwo = "1242";
   private String addressLineThree = "3572145";
   private String addressLineFour = "sajdsksdaj";
   private String addressLineFive = "nmaskdjkciqpzx";
   private String street = "xjzcnjish";
   private String district = "ncjishajqxza";
   private String subDistrict = "cmaqpzla";
   private String countryID = "lkzxjcjisa";
   private String provinceID = "242417";
   private String houseNumber = "123424";

    @Test
    public void shouldGetAllInfo() {
        PostalTradeAddressModel address = PostalTradeAddressModel.builder()
                .postalCode(this.postCode)
                .building(this.building)
                .addressLineOne(this.addressLineOne)
                .addressLineTwo(this.addressLineTwo)
                .addressLineThree(this.addressLineThree)
                .addressLineFour(this.addressLineFour)
                .addressLineFive(this.addressLineFive)
                .street(this.street)
                .district(this.district)
                .subDistrict(this.subDistrict)
                .countryID(this.countryID)
                .provinceID(this.provinceID)
                .houseNumber(this.houseNumber)
                .build();

        assertEquals(this.postCode, address.postalCode);
        assertEquals(this.building, address.building);
        assertEquals(this.addressLineOne, address.addressLineOne);
        assertEquals(this.addressLineTwo, address.addressLineTwo);
        assertEquals(this.addressLineThree, addressLineThree);
        assertEquals(this.addressLineFour, addressLineFour);
        assertEquals(this.addressLineFive, addressLineFive);
        assertEquals(this.street, address.street);
        assertEquals(this.district, address.district);
        assertEquals(this.subDistrict, address.subDistrict);
        assertEquals(this.countryID, address.countryID);
        assertEquals(this.provinceID, address.provinceID);
        assertEquals(this.houseNumber, address.houseNumber);

    }

    @Test
    public void shouldGetCorrectJson() {

        PostalTradeAddressModel address = PostalTradeAddressModel.builder()
                .postalCode(this.postCode)
                .building(this.building)
                .addressLineOne(this.addressLineOne)
                .addressLineTwo(this.addressLineTwo)
                .addressLineThree(this.addressLineThree)
                .addressLineFour(this.addressLineFour)
                .addressLineFive(this.addressLineFive)
                .street(this.street)
                .district(this.district)
                .subDistrict(this.subDistrict)
                .countryID(this.countryID)
                .provinceID(this.provinceID)
                .houseNumber(this.houseNumber)
                .build();

        String expectedJsonString
                = "{\n"
                + "    \"postalCode\" : \""+postCode+"\",\n"
                + "    \"building\" : \""+building+"\",\n"
                + "    \"addressLineOne\" : \""+addressLineOne+"\",\n"
                + "    \"addressLineTwo\" : \""+addressLineTwo+"\",\n"
                + "    \"addressLineThree\" : \""+addressLineThree+"\",\n"
                + "    \"addressLineFour\" : \""+addressLineFour+"\",\n"
                + "    \"addressLineFive\" : \""+addressLineFive+"\",\n"
                + "    \"street\" : \""+street+"\",\n"
                + "    \"district\" : \""+district+"\",\n"
                + "    \"subDistrict\" : \""+subDistrict+"\",\n"
                + "    \"countryID\" : \""+countryID+"\",\n"
                + "    \"provinceID\" : \""+provinceID+"\",\n"
                + "    \"houseNumber\" : \""+houseNumber+"\"\n"
                + "}";

        JsonConverter jsonConverter = new JsonConverter();

        assertEquals(expectedJsonString, jsonConverter.toJson(address));
    }
}
