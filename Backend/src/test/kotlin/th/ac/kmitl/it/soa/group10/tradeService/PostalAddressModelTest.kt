package th.ac.kmitl.it.soa.group10.tradeService

import org.junit.Assert.assertEquals
import org.junit.Test
import th.ac.kmitl.it.soa.group10.model.supplyChainTradeTransaction.PostalTradeAddressModel


class PostalTradeAddressModelTest {

    var postcodeCode = "74000";
    var cityName = "Samutsakhon"
    var citySubDivisionName = "Krokkark"
    var countryId = "00047"
    var countrySubDivisionId = "0007437"
    var buildingNumber = "999/999"

    @Test
    fun canGetAllDataTest() {

        var postalTradeAddress = PostalTradeAddressModel(this.postcodeCode, this.cityName, this.citySubDivisionName,
                this.countryId, this.countrySubDivisionId, this.buildingNumber);

        assertEquals(this.postcodeCode, postalTradeAddress.postcodeCode);
        assertEquals(this.cityName, postalTradeAddress.cityName);
        assertEquals(this.citySubDivisionName, postalTradeAddress.citySubDivisionName);
        assertEquals(this.countryId, postalTradeAddress.countryId);
        assertEquals(this.countrySubDivisionId, postalTradeAddress.countrySubDivisionId);
        assertEquals(this.buildingNumber, postalTradeAddress.buildingNumber);

    }

}
