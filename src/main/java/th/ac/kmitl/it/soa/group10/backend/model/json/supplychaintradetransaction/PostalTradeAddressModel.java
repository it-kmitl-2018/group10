package th.ac.kmitl.it.soa.group10.backend.model.json.supplychaintradetransaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class PostalTradeAddressModel {

    @JsonProperty("postalCode")
    public String postalCode;

    @JsonProperty("building")
    public String building;

    @JsonProperty("addressLineOne")
    public String addressLineOne;

    @JsonProperty("addressLineTwo")
    public String addressLineTwo;

    @JsonProperty("addressLineThree")
    public String addressLineThree;

    @JsonProperty("addressLineFour")
    public String addressLineFour;

    @JsonProperty("addressLineFive")
    public String addressLineFive;

    @JsonProperty("street")
    public String street;

    @JsonProperty("district")
    public String district;

    @JsonProperty("subDistrict")
    public String subDistrict;

    @JsonProperty("countryID")
    public String countryID;

    @JsonProperty("provinceID")
    public String provinceID;

    @JsonProperty("houseNumber")
    public String houseNumber;

}


