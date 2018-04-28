package th.ac.kmitl.it.soa.group10.Backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import th.ac.kmitl.it.soa.group10.Backend.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
public class PayeetradePartyFormController {
    @PostMapping(path = "/infopayee")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody String newInfo (@RequestParam String payeeID,
                                         @RequestParam String payeeGlobalID,
                                         @RequestParam String payeeName,
                                         @RequestParam String payeeTaxID,
                                         @RequestParam String payeeEmail,
                                         @RequestParam String payeeBuildingName,
                                         @RequestParam String payeeBuildingNo,
                                         @RequestParam String payeeAlley,
                                         @RequestParam String payeeVillage,
                                         @RequestParam String payeeVillageNo,
                                         @RequestParam String payeeStreet,
                                         @RequestParam String payeeSubDistrict,
                                         @RequestParam String payeeDistrict,
                                         @RequestParam String payeeSubCountry,
                                         @RequestParam String payeeCountryCode,
                                         @RequestParam String payeePostCode,
                                         @RequestParam String payeeAddrLineOne,
                                         @RequestParam String payeeAddrLineTwo) {


        System.out.print(payeeID + " " + payeeName);
        return payeeID + " " + payeeName;
    }
}