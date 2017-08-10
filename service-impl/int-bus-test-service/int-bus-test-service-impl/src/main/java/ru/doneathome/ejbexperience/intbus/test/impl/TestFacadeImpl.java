package ru.doneathome.ejbexperience.intbus.test.impl;

import ru.doneathome.ejbexperience.test.TestFacade;
import ru.doneathome.ejbexperience.test.api.TestService;

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

    //@EJB(lookup = "")
    private TestService testService;


    @Override
    public String doTestFacade() {
        return "this is TestFacadeImpl.doTest()";
    }
}

