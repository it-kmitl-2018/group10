package th.ac.kmitl.it.soa.group10.tradeService

import org.junit.Assert.assertEquals
import org.junit.Test
import th.ac.kmitl.it.soa.group10.model.supplyChainTradeTransaction.AddressModel

class AddressModelTest {
    var postcode = "74000";
    var cityName = "Samutsakhon"
    var citySubDivisionName = "Krokkark"
    var countryId = "00047"
    var countrySubDivisionId = "0007437"
    var buildingNumber = "999/999"

    @Test
    fun canGetAllData() {
        var address = AddressModel(this.postcode, this.cityName, this.citySubDivisionName,
                this.countryId, this.countrySubDivisionId, this.buildingNumber);

        assertEquals(this.postcode, address.postcode);
        assertEquals(this.cityName, address.cityName);
        assertEquals(this.citySubDivisionName, address.citySubDivisionName);
        assertEquals(this.countryId, address.countryId);
        assertEquals(this.countrySubDivisionId, address.countrySubDivisionId);
        assertEquals(this.buildingNumber, address.buildingNumber);

    }
}
