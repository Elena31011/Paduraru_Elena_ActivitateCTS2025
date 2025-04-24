package main;

import clase.AbstractAirQualityReport;
import clase.FactoryRaport;

public class Main {
    public static void main(String[] args) {
        FactoryRaport factoryRaport= new FactoryRaport();
        AbstractAirQualityReport abstractAirQualityReport = factoryRaport.getRaport(-1);
        abstractAirQualityReport.generateRaport();
    }
}
