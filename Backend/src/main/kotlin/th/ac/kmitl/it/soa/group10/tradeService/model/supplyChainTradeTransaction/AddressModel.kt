package th.ac.kmitl.it.soa.group10.tradeService.model.supplyChainTradeTransaction

data class AddressModel(var line_one : String, var line_two : String, var postcode: String, var cityName: String, var citySubDivisionName: String,
                        var countryId: String, var countrySubDivisionId: String)
