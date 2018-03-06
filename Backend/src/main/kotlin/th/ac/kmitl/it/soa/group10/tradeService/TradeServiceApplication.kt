package th.ac.kmitl.it.soa.group10.tradeService

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class TradeServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(TradeServiceApplication::class.java
            , *args)
}
