package org.acme;

import javax.ws.rs.ext.ParamConverter;

public class TestObjConverter implements ParamConverter<TestObj> {

    @Override
    public TestObj fromString(String s) {
        System.out.println("TestObjfromString");
        System.out.println(s);
        return new TestObj();
    }

    @Override
    public String toString(TestObj testObj) {
        return null;
    }
}