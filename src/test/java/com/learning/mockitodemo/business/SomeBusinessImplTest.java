package com.learning.mockitodemo.business;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SomeBusinessImplTest {
    @Test
    void findTheGreatestNumber_basicScenario() {
        DataService dataServiceStub = new DataServiceStub1();
        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceStub);

        int result = someBusinessImpl.findTheGreatestNumber();
        assertEquals(25,result);
    }

    @Test
    void findTheGreatestNumber_withOneValue() {
        DataService dataServiceStub = new DataServiceStub2();
        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceStub);

        int result = someBusinessImpl.findTheGreatestNumber();
        assertEquals(100,result);
    }
}
class DataServiceStub1 implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] { 25, 15, 5};
    }
}

class DataServiceStub2 implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] {100};
    }
}

