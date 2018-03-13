package th.ac.kmitl.it.soa.group10.tradeService.entity

import th.ac.kmitl.it.soa.group10.tradeService.model.Address

data class Company(var tax_number: String
                   , var branch_number: String
                   , var name_en: String
                   , var name_th: String
                   , var email: String
                   , var telephone: String
                   , var fax: String
                   , var address: Address)
