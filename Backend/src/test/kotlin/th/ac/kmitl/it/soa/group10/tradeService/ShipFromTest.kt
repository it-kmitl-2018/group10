package th.ac.kmitl.it.soa.group10.tradeService

import org.junit.Assert.assertEquals
import org.junit.Test
import th.ac.kmitl.it.soa.group10.model.ShipFromModel

class ShipFromTest {

    var sellId="1000";
    var senderName="Viriya";

    @Test
    fun canGetAllData(){

        var shipFrom = ShipFromModel(this.sellId, this.senderName);

        assertEquals(this.sellId, "1000");
        assertEquals(this.senderName, shipFrom.senderName);

    }

}