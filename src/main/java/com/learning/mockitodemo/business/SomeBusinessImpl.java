package com.learning.mockitodemo.business;

public class SomeBusinessImpl {
    private final DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findTheGreatestNumber() {
        int [] data = dataService.retrieveAllData();
        int greatestNumber = Integer.MIN_VALUE;
        for(int value : data) {
            if(value > greatestNumber) {
                greatestNumber = value;
            }
        }
        return greatestNumber;
    }
}

interface DataService {
    int[] retrieveAllData();
}
