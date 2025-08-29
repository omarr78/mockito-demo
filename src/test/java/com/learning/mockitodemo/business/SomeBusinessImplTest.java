package com.learning.mockitodemo.business;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplTest {

    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl someBusinessImpl;

    @Test
    void findTheGreatestNumber_basicScenario() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 25, 15, 5});
        assertEquals(25,someBusinessImpl.findTheGreatestNumber());
    }

    @Test
    void findTheGreatestNumber_withOneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {100});
        assertEquals(100,someBusinessImpl.findTheGreatestNumber());
    }
}
