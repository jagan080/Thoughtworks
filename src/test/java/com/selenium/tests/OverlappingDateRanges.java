package com.selenium.tests;

import java.util.ArrayList;
import java.util.List;

public class OverlappingDateRanges {
	
	
	
	public static void main(String args[]){
		List<String> l = new ArrayList<String>();
		l.add("01-09-2017,05-10-2017");
		l.add("04-10-2017,08-10-2017");
		l.add("12-12-2017,18-12-2017");
		
		
		for (int i = 0; i < l.size(); i ++){
			String[] endDate = l.get(i).split(",");
			String[] endDateArray = endDate[1].split("-");
			String endDateYear = endDateArray[2];
			String endDateMonth = endDateArray[1];
			String endDateDay = endDateArray[0];
			
			for (int j = 0; j < l.size(); j ++){
				String[] startDate = l.get(j).split(",");
				String[] startDateArray = startDate[1].split("-");
				String startDateYear = startDateArray[2];
				String startDateMonth = startDateArray[1];
				String startDateDay = startDateArray[0];
				
				if (endDateYear.equals(startDateYear)&&endDateMonth.equals(startDateMonth)){
					if (Integer.parseInt(endDateDay)>Integer.parseInt(startDateDay)){
						System.out.println(l.get(j)+" overlaps with "+l.get(i));
					}
				}
				
			}
			
		}
			
		
	}
	
	
	

}
