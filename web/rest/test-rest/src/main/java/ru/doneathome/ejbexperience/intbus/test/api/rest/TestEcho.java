package ru.doneathome.ejbexperience.intbus.test.api.rest;

import ru.doneathome.ejbexperience.intbus.test.api.TestFacade;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by dzhukov on 08.08.17.
 * http://localhost:8080/test-rest/api/rest/services/test-echo/echo
 */
@Path("/test-echo")
public class TestEcho {

    // инжектим фасад
    @EJB(lookup = "ejb:int-bus-test-service-ear/int-bus-test-service-impl/TestFacade!ru.doneathome.ejbexperience.intbus.test.api.TestFacade")
    private TestFacade testFacade;

    @GET
    @Path("/echo")
    public String echo() {
        return "hello, i am TestEcho" + testFacade.doTestFacade();
    }

}
