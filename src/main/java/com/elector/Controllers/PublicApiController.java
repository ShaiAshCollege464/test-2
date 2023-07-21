package com.elector.Controllers;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(method = RequestMethod.GET, value = "/fm1")
public class PublicApiController {


    @RequestMapping("/ping")
    public String ping() {
        return "public-api";
    }

    @RequestMapping("/version")
    public String version() {
        return System.getenv("version");
    }




}
