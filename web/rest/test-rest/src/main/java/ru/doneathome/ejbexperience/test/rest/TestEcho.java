package ru.doneathome.ejbexperience.test.rest;

import ru.doneathome.ejbexperience.intbus.test.api.TestFacade;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by dzhukov on 08.08.17.
 * http://localhost:8080/test-rest/api/rest/services/test-echo/echo
 * http://localhost:8080/test-rest/api/rest/services/test-echo/fasade
 */
@Path("/test-echo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Stateless
@TransactionAttribute(TransactionAttributeType.NEVER)
public class TestEcho {

    // инжектим фасад
    @EJB(lookup = "java:global/int-bus-test-service/int-bus-test-service-impl/TestFacadeImpl!ru.doneathome.ejbexperience.intbus.test.api.TestFacade")
    private TestFacade testFacade;

    @GET
    @Path("/echo")
    public String echo1() {
        return "hello, i am TestEcho";
    }

    @GET
    @Path("/fasade")
    public String fasade() {
        String string;

        string = testFacade.doTestFacade();
        return "hello, i am TestEcho" + string;
    }

}
