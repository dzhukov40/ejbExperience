package ru.doneathome.ejbexperience.test.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by dzhukov on 08.08.17.
 */
@Path("/test-echo")
public class TestEcho {

    @GET
    @Path("/echo")
    public String echo() {
        return "hello, i am TestEcho";
    }

}
