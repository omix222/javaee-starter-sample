package com.example.jee8.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/example")
public class ExampleService {

    @GET
    public Response get() {
        return Response.ok("Hello World").build();
    }

}
