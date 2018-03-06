package th.ac.kmitl.it.soa.group10.model

data class ShipFromModel(var vendorCode: String, var interVendorCode: String, var senderName: String){

    override fun toString(); String {
        return "ShipFromModel(vendorCode=$vendorCode, interVendorCode=$interVendorCode, senderName=$senderName)";
    }

}
