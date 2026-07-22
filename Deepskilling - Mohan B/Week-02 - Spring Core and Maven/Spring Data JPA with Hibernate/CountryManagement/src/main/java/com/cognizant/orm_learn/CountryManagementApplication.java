package com.cognizant.orm_learn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.StockRepository;
import com.cognizant.orm_learn.service.*;

import lombok.Builder;
import com.cognizant.orm_learn.model.Stock;

public class CountryManagementApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryManagementApplication.class);
    
    // Include a static reference to CountryService 
    private static CountryService countryService;
    private static StockRepository stockRepository;
    public static void main(String[] args) { 
        
        // Modify SpringApplication.run() to set the application context 
        ApplicationContext context = SpringApplication.run(CountryManagementApplication.class, args);
        
        // Get the CountryService reference from the application context 
        countryService = context.getBean(CountryService.class);
        stockRepository = context.getBean(StockRepository.class);
        LOGGER.info("Inside main"); 
        
       
        // testGetAllCountries();
        //  getCountryByCode();
        addCountryToDatabase();
        deleteCountryByIdFromDatabase();
        updateCountryToDatabase();
        // 2nd document 
        findCountryBySearchingName();
     //  testGetFBStocksSept2019();
    }
    
    private static void addCountryToDatabase() {
        LOGGER.info("Start"); 
        
     Country co = Country.builder().code("XY").name("Kailasam").build();
     
     countryService.addCountry(co);   
        LOGGER.debug("countries={}", co); 
        
        LOGGER.info("End"); 
    }
    
    private static void updateCountryToDatabase() {
        LOGGER.info("Start"); 
        
     Country co = Country.builder().code("XY").name("Kailasam by Nithyananda").build();
     
     countryService.updateCountryByCode("XY", co);
        LOGGER.debug("countries={}", co); 
        
        LOGGER.info("End"); 
    }

    private static void getCountryByCode() {
        LOGGER.info("Start"); 
        
      Country co = countryService.findCountryByCode("XY"); 
        
        LOGGER.debug("countries={}", co); 
        
        LOGGER.info("End"); 
    }

    
    private static void testGetAllCountries() {
        LOGGER.info("Start"); 
        
        List<Country> countries = countryService.getAllCountries(); 
        System.out.println("Countries List");
        for(Country co : countries) {
        System.out.println(co);
        }
       
        
        LOGGER.info("End"); 
    }
    private static void deleteCountryByIdFromDatabase() {
        LOGGER.info("Start"); 
        
  //   Country co = Country.builder().code("XY").name("Kailasam").build();
     
    countryService.deleteCountryByCode("AD");
        
        LOGGER.info("End"); 
    }
    private static void findCountryBySearchingName() {
        LOGGER.info("Start"); 
        
        List<Country> countries = countryService.findCountryBySearching("Aus"); 
        
        LOGGER.debug("countries={}", countries); 
        
        LOGGER.info("End"); 
    }

    private static void testGetFBStocksSept2019() {
        LOGGER.info("Start testGetFBStocksSept2019 directly from Repository"); 
        
        try {
        
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
            
            Date startDate = sdf.parse("2019-09-01");
            Date endDate = sdf.parse("2019-09-30");
            
            
            List<Stock> fbStocks = stockRepository.findByCodeAndDateBetween("FB", startDate, endDate);
            
            LOGGER.debug("FB Stocks in Sept 2019:");
            for (Stock stock : fbStocks) {
                LOGGER.debug(stock.toString());
            }
            
        } catch (Exception e) {
            LOGGER.error("Error parsing dates or fetching data", e);
        }
        
        LOGGER.info("End testGetFBStocksSept2019"); 
    }
}