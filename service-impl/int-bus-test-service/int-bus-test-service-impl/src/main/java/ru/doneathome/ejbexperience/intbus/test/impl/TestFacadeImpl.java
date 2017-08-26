package ru.doneathome.ejbexperience.intbus.test.impl;

import ru.doneathome.ejbexperience.intbus.test.api.TestFacade;
import ru.doneathome.ejbexperience.test.api.TestService;

import javax.ejb.*;

/**
 * реализация фасада
 *
 * Created by dzhukov on 07.08.17.
 */

@Remote
@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class TestFacadeImpl implements TestFacade {

    // инжектим сервис
    @EJB(lookup = "java:global/test-service/test-service-impl/TestServiceImpl!ru.doneathome.ejbexperience.test.api.TestService")
    private TestService testService;


    @Override
    public String doTestFacade() {
        return "this is TestFacadeImpl.doTest()" + testService.doTestService();
    }
}

