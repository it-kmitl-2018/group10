package th.ac.kmitl.it.soa.group10.tradeService.model

data class Item(var description: String
        , var quantity: Int
        , var price_per_item: Int
        , var have_vat: Boolean
        , var vat_rate: Float)
