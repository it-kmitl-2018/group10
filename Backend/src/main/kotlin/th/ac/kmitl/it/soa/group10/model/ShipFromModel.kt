package th.ac.kmitl.it.soa.group10.model

data class ShipFromModel(var sellerId: String, var senderName: String){

    override fun toString(); String {
        return "ShipFromModel(sellerId=$sellerId, senderName=$senderName)";
    }

}
