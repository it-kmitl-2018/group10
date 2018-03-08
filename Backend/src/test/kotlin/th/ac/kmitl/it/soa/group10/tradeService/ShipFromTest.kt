package th.ac.kmitl.it.soa.group10.tradeService

import org.junit.Assert.assertEquals
import org.junit.Test
import th.ac.kmitl.it.soa.group10.model.ShipFromModel

class ShipFromTest {
    var id="1000";
    var name="Viriya";

    @Test
    fun canGetAllData(){
        var shipFrom = ShipFromModel(this.id, this.name);

        assertEquals(this.id,  shipFrom.id);
        assertEquals(this.name, shipFrom.name);

    }
}
