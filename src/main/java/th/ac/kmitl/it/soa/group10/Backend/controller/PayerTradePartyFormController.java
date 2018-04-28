package th.ac.kmitl.it.soa.group10.Backend.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import th.ac.kmitl.it.soa.group10.Backend.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
public class PayerTradePartyFormController {
    @PostMapping(path = "/infopayer")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody
    String newInfo(@RequestParam String payerID,
                   @RequestParam String payerGlobalID,
                   @RequestParam String payerName,
                   @RequestParam String payerTaxID,
                   @RequestParam String payerEmail,
                   @RequestParam String payerBuildingName,
                   @RequestParam String payerBuildingNo,
                   @RequestParam String payerAlley,
                   @RequestParam String payerVillage,
                   @RequestParam String payerVillageNo,
                   @RequestParam String payerStreet,
                   @RequestParam String payerSubDistrict,
                   @RequestParam String payerDistrict,
                   @RequestParam String payerSubCountry,
                   @RequestParam String payerCountryCode,
                   @RequestParam String payerPostCode,
                   @RequestParam String payerAddrLineOne,
                   @RequestParam String payerAddrLineTwo) {


        System.out.print(payerID + " " + payerName);
        return payerID + " " + payerName;
    }
}
