package th.ac.kmitl.it.soa.group10.tradeService

import th.ac.kmitl.it.soa.group10.tradeService.model.supplyChainTradeTransaction.SpecifiedTaxRegistrationModel
import org.junit.Assert.assertEquals
import org.junit.Test

class SpecifiedTaxRegistrationModelTest{
    var id = "10342135";

    @Test
    fun getDataTest(){
        var taxRegistration = SpecifiedTaxRegistrationModel(this.id);

        assertEquals(this.id, taxRegistration.id);

    }

}
