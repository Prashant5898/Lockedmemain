package com.lockedmemain;

public class LockedMeMain {

	public static void main(String[] args) {
		
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockedMe", "Prashant Patil E-mail:- Prashantpatil5898@gmail.com");
				
				HandleOptions.handleWelcomeScreenInput();
			}


	}


