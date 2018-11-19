package com.ut.trivia.Factory;

import com.ut.trivia.AdminOptions.AdminFunctionalities;

public class ApplicationFactory {
	public static AdminFunctionalities adminFunctionsInstance;
	
	public static AdminFunctionalities getAdminFunctionsInstance() {
		if(adminFunctionsInstance == null) {
			adminFunctionsInstance = new AdminFunctionalities();
		}
		return adminFunctionsInstance;
	}
}
