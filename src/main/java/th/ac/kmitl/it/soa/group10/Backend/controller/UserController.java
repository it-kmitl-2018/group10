package th.ac.kmitl.it.soa.group10.Backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import th.ac.kmitl.it.soa.group10.Backend.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
public class UserController {
    String id = "";
    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    public static final String HELLO_TEXT = "Hello from Spring Boot Backend!";

    @RequestMapping(path = "/hello")
    public @ResponseBody String sayHello() {
        LOG.info("GET called on /hello resource");
        return HELLO_TEXT;
    }

}
