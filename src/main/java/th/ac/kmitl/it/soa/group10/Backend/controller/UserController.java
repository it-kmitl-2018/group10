package th.ac.kmitl.it.soa.group10.Backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmitl.it.soa.group10.Backend.model.User;

@RestController
public class UserController {

    //Initialize Example
    @RequestMapping(value = "/user/1", method = RequestMethod.GET)
    public User getUser() {
        return new User(1, "John");
    }

}
