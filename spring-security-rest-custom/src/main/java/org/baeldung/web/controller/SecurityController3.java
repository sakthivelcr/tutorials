package org.baeldung.web.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecurityController3 {

    public SecurityController3() {
        super();
    }

    // API

    @RequestMapping(value = "/username3", method = RequestMethod.GET)
    @ResponseBody
    public String currentUserNameSimple(final Authentication authentication) {
        return authentication.getName();
    }

}
