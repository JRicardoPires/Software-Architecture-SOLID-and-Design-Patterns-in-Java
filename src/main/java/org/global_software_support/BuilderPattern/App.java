package org.global_software_support.BuilderPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class App {

    public static void main(String[] args) {


        CSVParser machineLearningParser = new MachineLearningDataParser();
        CSVParser realEstateParser = new RealEstateMarketDataParser();
        CSVParser stockMarketParser = new StockMarketAdapter(new StockMarketDataParser());

        machineLearningParser.parseCSV();
        realEstateParser.parseCSV();
        stockMarketParser.parseCSV();
    }
}