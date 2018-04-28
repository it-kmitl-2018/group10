package th.ac.kmitl.it.soa.group10.Backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import th.ac.kmitl.it.soa.group10.Backend.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
public class PayeetradePartyFormController {
    @PostMapping(path = "/info")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody String newInfo (@RequestParam String id,
                                         @RequestParam String payerGlobalID,
                                         @RequestParam String name,
                                         @RequestParam String taxID,
                                         @RequestParam String email,
                                         @RequestParam String buildingName,
                                         @RequestParam String buildingNo,
                                         @RequestParam String alley,
                                         @RequestParam String village,
                                         @RequestParam String villageNo,
                                         @RequestParam String street,
                                         @RequestParam String subDistrict,
                                         @RequestParam String district,
                                         @RequestParam String subCountry,
                                         @RequestParam String countrycode,
                                         @RequestParam String postcode,
                                         @RequestParam String addrLineOne,
                                         @RequestParam String addrLineTwo) {


        System.out.print(id + " " + name);
        return id + " " + name;
    }
}
