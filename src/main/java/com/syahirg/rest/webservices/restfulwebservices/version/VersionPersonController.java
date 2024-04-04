package com.syahirg.rest.webservices.restfulwebservices.version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionPersonController {

    @GetMapping("/v1/person")
    public PersonV1 getFirstVersion(){
        return new PersonV1("Bob Charlie");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersion(){
        return new PersonV2(new Name("Bob", "Charlie"));
    }
}