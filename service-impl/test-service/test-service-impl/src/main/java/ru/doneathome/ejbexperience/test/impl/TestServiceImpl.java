package ru.doneathome.ejbexperience.test.impl;

import ru.doneathome.ejbexperience.test.api.TestService;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 * Это реализация сервиса
 *
 * Created by dzhukov on 10.08.17.
 */
@Remote
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class TestServiceImpl implements TestService {

    @Override
    public String doTestService() {
        return "Hello this is TestServiceImpl.doTestService()";
    }

}
