package ui;

import model.SystemController;

import java.time.LocalDate;
import java.util.Scanner;

public class SystemManager {
	
	private Scanner sc;
	private SystemController controller;
	
	public SystemManager() {
		this.sc = new Scanner (System.in);
		this.controller = new SystemController();
	}
	
	public static void main(String[] args) {
		SystemManager manager = new SystemManager();
		manager.menu();
	}
	
	public void menu() {
		System.out.println("Welcome to NeoTunes");
		boolean exit = false;
		
		while(!exit) {
			System.out.println("What would you like to do?\n1. Register Artist users"
					+ "\n2. Register Content Creator users" + "\n3. Register Standard users"
					+ "\n4. Register Premium users");
			int option = sc.nextInt();
			
			switch(option) {
				case 0:
					exit = true;
					break;
				case 1:
					registerUserArtist();
					break;
				case 2:
					registerUserCCreator();
					break;
				case 3:
					registerUserStandard();
					break;
				case 4:
					registerUserPremium();
					break;
				default:
					
			}
		}
	}
	
	public void registerUserArtist() {
		System.out.println("Type the name of the user");
		String name = sc.nextLine();
		
		System.out.println("Type the id");
		String id = sc.nextLine();
		
		LocalDate date = LocalDate.now();
		
		System.out.println("Type the url of your perfil photo");
		String url = sc.nextLine();
		
		if (controller.registerUserArtist(name, id, date, url)) {
			System.out.println("User register successfully");
		}
		else {
			System.out.println("It was not possible register the user\n");
		}
	}
	
	public void registerUserCCreator() {
		System.out.println("Type the name of the user");
		String name = sc.nextLine();
		
		System.out.println("Type the id");
		String id = sc.nextLine();
		
		LocalDate date = LocalDate.now();
		
		System.out.println("Type the url of your perfil photo");
		String url = sc.nextLine();
		
		if (controller.registerUserCCreator(name, id, date, url)) {
			System.out.println("User register successfully");
		}
		else {
			System.out.println("It was not possible register the user\n");
		}
	}
	
	public void registerUserStandard() {
		System.out.println("Type the name of the user");
		String name = sc.nextLine();
		
		System.out.println("Type the id");
		String id = sc.nextLine();
		
		LocalDate date = LocalDate.now();
		
		if(controller.registerUserStandard(name, id, date)) {
			System.out.println("User register successfully");
		}
		else {
			System.out.println("It was not possible register the user\n");
		}
	}
	
	public void registerUserPremium() {
		System.out.println("Type the name of the user");
		String name = sc.nextLine();
		
		System.out.println("Type the id");
		String id = sc.nextLine();
		
		LocalDate date = LocalDate.now();
		
		if (controller.registerUserPremium(name, id, date)) {
			System.out.println("User register successfully");
		}
		else {
			System.out.println("It was not possible register the user\n");
		}
	}

}
