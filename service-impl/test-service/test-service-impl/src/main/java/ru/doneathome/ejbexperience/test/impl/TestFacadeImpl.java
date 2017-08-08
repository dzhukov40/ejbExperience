package ru.doneathome.ejbexperience.test.impl;


import ru.doneathome.ejbexperience.test.TestFacade;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 * Created by dzhukov on 07.08.17.
 */

@Remote
@Stateless(name = "TestFacade")
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class TestFacadeImpl implements TestFacade {

    @Override
    public String doTest() {
        return "this is TestFacadeImpl.doTest()";
    }
}
