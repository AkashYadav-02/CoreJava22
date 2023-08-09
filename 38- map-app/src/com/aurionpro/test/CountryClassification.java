package com.aurionpro.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryClassification {

	public static void main(String[] args) {

		Map<Integer, String> region = new HashMap<>();
		region.put(1, "Europe");
		region.put(2, "Americas");
		region.put(3, "Asia");
		region.put(4, "Middle East and Africa");
		Map<String, String> country = new HashMap<>();
		country.put("UK", "United Kingdom");
		country.put("FR", "France");
		country.put("DE", "Germany");
		country.put("ZM", "Zambia");
		country.put("EG", "Egypt");
		country.put("BR", "Brazil");
		country.put("CH", "Switzerland");
		country.put("NL", "Netherlands");
		country.put("MX", "Mexico");
		country.put("KW", "Kuwait");
		country.put("IL", "Israel");
		country.put("DK", "Denmark");
		country.put("HK", "HongKong");
		country.put("NG", "Nigeria");
		country.put("AR", "Argentina");
		country.put("BE", "Belgium");
		country.put("IT", "Italy");
		country.put("JP", "Japan");
		country.put("US", "United States of America");
		country.put("CA", "Canada");
		country.put("CN", "China");
		country.put("IN", "India");
		country.put("AU", "Australia");
		country.put("ZW", "Zimbabwe");
		country.put("SG", "Singapore");
		


		Map<String, Integer> countryRegion = new HashMap<>();
		countryRegion.put("IT", 1);
		countryRegion.put("JP", 3);
		countryRegion.put("US", 2);
		countryRegion.put("CA", 2);
		countryRegion.put("CN", 3);
		countryRegion.put("IN", 3);
		countryRegion.put("AU", 3);
		countryRegion.put("ZW", 4);
		countryRegion.put("SG", 3);
		countryRegion.put("UK", 1);
		countryRegion.put("FR", 1);
		countryRegion.put("DE", 1);
		countryRegion.put("ZM", 4);
		countryRegion.put("EG", 4);
		countryRegion.put("BR", 2);
		countryRegion.put("CH", 1);
		countryRegion.put("NL", 1);
		countryRegion.put("MX", 2);
		countryRegion.put("KW", 4);
		countryRegion.put("IL", 4);
		countryRegion.put("DK", 1);
		countryRegion.put("HK", 3);
		countryRegion.put("NG", 4);
		countryRegion.put("AR", 2);
		countryRegion.put("BE", 1);
		

		getContinentByRegionId(1,region);
		
		
		
		
		
		

}
	
	public  static  void getContinentByRegionId( int regionid,Map<Integer, String> region) {
		if(region.containsKey(regionid))
		System.out.println( "Continent  of  region is:"+region.get(regionid));
		
	}
	
	public static  void getcountrybyname( String name  ,Map<String, String> country )
	{
		
	}
}