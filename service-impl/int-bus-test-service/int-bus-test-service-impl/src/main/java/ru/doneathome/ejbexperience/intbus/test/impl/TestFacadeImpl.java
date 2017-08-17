package ru.doneathome.ejbexperience.intbus.test.impl;

import ru.doneathome.ejbexperience.intbus.test.api.TestFacade;
import ru.doneathome.ejbexperience.intbus.test.api.api.TestService;

import javax.ejb.*;

/**
 * реализация фасада
 *
 * Created by dzhukov on 07.08.17.
 */

@Remote
@Stateless(name = "TestFacade")
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class TestFacadeImpl implements TestFacade {

    // инжектим сервис
    @EJB(lookup = "ejb:test-service-ear/test-service-impl/TestService!ru.doneathome.ejbexperience.test.impl.TestService")
    private TestService testService;


    @Override
    public String doTestFacade() {
        return "this is TestFacadeImpl.doTest()" + testService.doTestService();
    }
}

