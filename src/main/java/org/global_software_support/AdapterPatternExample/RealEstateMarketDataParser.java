package org.global_software_support.AdapterPatternExample;

public class RealEstateMarketDataParser implements CSVParser {

    @Override
    public void parseCSV() {
        System.out.println("Parsing a real estate related CSV file...");
    }

}
