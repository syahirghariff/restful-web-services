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

    @GetMapping(path="/person", params = "version=1")
    public PersonV1 getFirstByParams(){
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path="/person", params = "version=2")
    public PersonV2 getSecondByParams(){
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    @GetMapping(path="/person", headers="X-API-VERSION=1")
    public PersonV1 getFirstByHeaders(){
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path="/person", headers="X-API-VERSION=2")
    public PersonV2 getSecondByHeaders(){
        return new PersonV2(new Name("Bob", "Charlie"));
    }


}
