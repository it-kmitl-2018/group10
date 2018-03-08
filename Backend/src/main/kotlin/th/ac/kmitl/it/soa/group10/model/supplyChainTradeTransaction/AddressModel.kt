package th.ac.kmitl.it.soa.group10.model.supplyChainTradeTransaction

data class AddressModel(var postcode: String, var cityName: String, var citySubDivisionName: String,
                        var countryId: String, var countrySubDivisionId: String, var buildingNumber: String)
