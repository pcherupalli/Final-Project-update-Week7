package com.info.client;

import com.info.bed.BedFactory;
import com.info.bed.Hospital;

public class BedChecker {
	
	public static void main(String[] args) {
		
		//Register the patient 
		
		//Factory pattern to 
		BedFactory bedFactory = new BedFactory();
		
		Hospital bedtype = bedFactory.getInstance("old_patient");
		
		//Iterator pattern to show the available beds 
		
		//Command pattern to change the status of the beds 
		
		
		
	}

}
