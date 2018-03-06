package th.ac.kmitl.it.soa.group10.model.supplyChainTradeTransaction

data class PostalTradeAddressModel(var postcodeCode: String, var cityName: String, var citySubDivisionName: String,
                                   var countryId: String, var countrySubDivisionId: String, var buildingNumber: String){

    override fun toString(): String {
        return "PostalTradeAddressModel(postcodeCode=$postcodeCode, cityName=$cityName, " +
                "citySubDivisionName=$citySubDivisionName, countryId=$countryId, " +
                "ountrySubDivisionId=$ountrySubDivisionId, buildingNumber=$buildingNumber)";
    }

}