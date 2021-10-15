package com.info.bed;

import com.info.beans.Patient;

public class BedFactory {
	
	
	public Hospital getInstance(String bedType) {
		//Logic to be implemented 
		if(bedType.equals("")) {
			return new Patient();
		}
		
		
		return null;
		
	}

}
