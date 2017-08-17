package ru.doneathome.ejbexperience.intbus.test.api.impl;

import ru.doneathome.ejbexperience.intbus.test.api.api.TestService;

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
@Stateless(name = "AdditionalAgreementService")
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class TestServiceImpl implements TestService {

    @Override
    public String doTestService() {
        return "Hello this is TestServiceImpl.doTestService()";
    }

}
