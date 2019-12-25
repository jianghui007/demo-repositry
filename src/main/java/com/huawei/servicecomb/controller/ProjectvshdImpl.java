package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-12-25T02:33:59.184Z")

@RestSchema(schemaId = "projectvshd")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class ProjectvshdImpl {

    @Autowired
    private ProjectvshdDelegate userProjectvshdDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectvshdDelegate.helloworld(name);
    }

}
