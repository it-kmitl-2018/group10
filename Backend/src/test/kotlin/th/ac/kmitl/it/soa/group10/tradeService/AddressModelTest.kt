package th.ac.kmitl.it.soa.group10.tradeService

import org.junit.Assert.assertEquals
import org.junit.Test
import th.ac.kmitl.it.soa.group10.model.supplyChainTradeTransaction.AddressModel

class AddressModelTest {
    var line_one = "99/999";
    var line_two = "thamkunakorn";
    var postcode = "74000";
    var cityName = "Samutsakhon"
    var citySubDivisionName = "Krokkark";
    var countryId = "00047"
    var countrySubDivisionId = "0007437";

    @Test
    fun canGetAllData() {
        var address = AddressModel(this.line_one, this.line_two, this.postcode, this.cityName, this.citySubDivisionName,
                this.countryId, this.countrySubDivisionId);

        assertEquals(this.line_one, address.line_one);
        assertEquals(this.line_two, address.line_two);
        assertEquals(this.postcode, address.postcode);
        assertEquals(this.cityName, address.cityName);
        assertEquals(this.citySubDivisionName, address.citySubDivisionName);
        assertEquals(this.countryId, address.countryId);
        assertEquals(this.countrySubDivisionId, address.countrySubDivisionId);

    }
}
