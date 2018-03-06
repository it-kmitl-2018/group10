package th.ac.kmitl.it.soa.group10.model

data class ShipFromModel(var sellerCode: String, var interSellerCode: String, var senderName: String){

    override fun toString(); String {
        return "ShipFromModel(sellerCode=$sellerCode, interSellerCode=$interSellerCode, senderName=$senderName)";
    }

}
