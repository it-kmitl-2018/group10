package th.ac.kmitl.it.soa.group10.model

data class ShipFromModel(var sellerCode: String, var senderName: String){

    override fun toString(); String {
        return "ShipFromModel(sellerCode=$sellerCode, senderName=$senderName)";
    }

}
