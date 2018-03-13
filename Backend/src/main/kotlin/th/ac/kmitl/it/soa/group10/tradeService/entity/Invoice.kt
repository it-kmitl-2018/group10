package th.ac.kmitl.it.soa.group10.tradeService.entity

import th.ac.kmitl.it.soa.group10.tradeService.model.Item
import th.ac.kmitl.it.soa.group10.tradeService.model.Note

data class Invoice(var number: String
                   , var seller: Company
                   , var buyer: Company
                   , var transaction_date: String
                   , var note: Note
                   , var items: Item)
