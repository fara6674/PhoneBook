/*ClassName PhoneBook

Version 1.1.1

Copyright Notice Public 

Project 2 PhoneBook Application
Write a program to simulate the actions of a phonebook.
Your program should be able to :
Add new entries 
Search for an existing entry
Search by first name *
Search by last name *
Search by full name *note name is not unique therefore the result should be an array of Person Objects.
Search by telephone number
Search by city or state
Delete a record for a given telephone number
Update a record for a given telephone number
Show all records in asc order
An option to exit the program 
Your program should operate on the console. It should display all the choices when the program loads. Eg 1. Add new record
    2. Delete a record
               Etc.. where 1 representing the action for adding a record and 2 representing the action
               for deleting a record.
Your program should run until the user selects the exit option. 
Your program should have a minimum of 2 classes a Person class, an Address  class.

Test case :
John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
John E Doe, 324 Main St, St Charles, MO,63303, 8475390126
John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375

Searching for John should return a list of all 3 records above, displaying the telephone number in this order (636)-453-8563.

Optional add additional features to your program, for storing cell, home, work and fax numbers. 
Also features for storing events like birthday, anniversary, email… etc  */

package com.phoneBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {

		Address addressPerson1 = new Address("114", "Market St", "St Louis", "MO", "63403", "6366435698",
				"doe@test.com");
		Address addressPerson2 = new Address("324", "Main St", "St Charles", "MO", "63303", "8475390126",
				"edoe@test.com");
		Address addressPerson3 = new Address("574", "Pole Ave", "St Peters", "MO", "63333", "5628592375",
				"westdoe@test.com");

		Person person1 = new Person("John", "Doe", addressPerson1);
		Person person2 = new Person("Zack", "E Doe", addressPerson2);
		Person person3 = new Person("Adam", "Michael West Doe", addressPerson3);

		ArrayList<Person> personsArrayList = new ArrayList<>();

		personsArrayList.add(person1);
		personsArrayList.add(person2);
		personsArrayList.add(person3);

		int countOfPeopleArray = 3;

		int opt;
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Phone Book, Please choose from below options to continue !!!\n");

		while (true) {
			System.out.println("Enter 1 to Add new Record");
			System.out.println("Enter 2 to Delete a Record");
			System.out.println("Enter 3 for Searching by First name");
			System.out.println("Enter 4 for Searching by Last name");
			System.out.println("Enter 5 for Searching by Phone");
			System.out.println("Enter 6 for Searching by City name");
			System.out.println("Enter 7 for Searching by State name");
			System.out.println("Enter 8 to Show all records in asc order"); // how to do asc order????
			System.out.println("Enter 9 to Update a record by Phone Number");
			System.out.println("Enter 10 to Exit");
			opt = s.nextInt();
			switch (opt) {
			case 1: // add new record

				// get person details from the user..

				Scanner input1 = new Scanner(System.in);

				System.out.println("Enter First Name: ");
				String firstName = input1.nextLine();

				System.out.println("Enter Last Name: ");
				String lastName = input1.nextLine();

				System.out.println("Now you can Enter the Address: ");
				System.out.println("Enter stree number");
				String streetNum = input1.nextLine();

				System.out.println("Enter stree name");
				String streetNam = input1.nextLine();

				System.out.println("Enter city");
				String city = input1.nextLine();

				System.out.println("Enter state");
				String state = input1.nextLine();

				System.out.println("Enter zip");
				String zip = input1.nextLine();

				System.out.println("Enter Phone Number");
				String phone = input1.nextLine();

				System.out.println("Enter eMail");
				String eMail = input1.nextLine();

				Person p = new Person(firstName, lastName,
						new Address(streetNum, streetNam, city, state, zip, phone, eMail));
				//addPerson(personsArrayList, p);
				personsArrayList.add(p);
				System.out.println("\nEntered recod was successfully saved into PhoneBook\n");

				break;

			// if (personsArrayList[i] != null)

			case 2: // Delete by phone number
				Scanner input2 = new Scanner(System.in);
				System.out.println("Enter the Number in this format pls: (xxx)-xxx-xxxx");
				String deleteByPhone = input2.nextLine();
				boolean test2 = true;
				int countOfPeopleArray1 = 0;
				for (int i = 0; i < personsArrayList.size(); i++) {
					if (personsArrayList.get(i)!= null) {
						if (personsArrayList.get(i).getAddress().getPhone().equals(deleteByPhone)) {
							personsArrayList.remove(i);
							countOfPeopleArray1--;
							System.out.println("\nRequested record was successfully deleted\n");
							test2 = false;
						}
					}
				}
				if (test2) {
					System.out.println("No such a Number found in PhoneBook\n");
				}

				break;

			case 3: // Search by First name
				Scanner input3 = new Scanner(System.in);
				System.out.println("Enter first name, *Case sansative*");
				String findByFname = input3.nextLine();
				boolean test3 = true;
				for (int i = 0; i < personsArrayList.size(); i++) {
					if (personsArrayList.get(i) != null) {
						if (personsArrayList.get(i).getFirstName().equals(findByFname)) {
							System.out.println(personsArrayList.get(i).getFirstName() + " "
									+ personsArrayList.get(i).getLastName() + " " + personsArrayList.get(i).getAddress());
							test3 = false;
						}
					}
				}
				if (test3) {
					System.out.println("No such a Name found in PhoneBook\n");
				}

				break;

			case 4: // Search by Last name
				Scanner input4 = new Scanner(System.in);
				System.out.println("Enter last name, *Case sansative*");
				String findByLname = input4.nextLine();
				boolean test4 = true;
				for (int i = 0; i < personsArrayList.size(); i++) {
					if (personsArrayList.get(i) != null) {
						if (personsArrayList.get(i).getLastName().equals(findByLname)) {
							System.out.println(personsArrayList.get(i).getLastName() + " "
									+ personsArrayList.get(i).getFirstName() + " " + personsArrayList.get(i).getAddress());
							test4 = false;
						}
					}
				}
				if (test4) {
					System.out.println("No such a Name found in PhoneBook\n");
				}

				break;

			case 5: // Search by Phone
				Scanner input5 = new Scanner(System.in);
				System.out.println("Enter Phone Number in format (xxx)-xxx-xxxx");
				String findByPhone = input5.nextLine();
				boolean test5 = true;
				for (int i = 0; i < personsArrayList.size(); i++) {
					if (personsArrayList.get(i) != null) {
						if (personsArrayList.get(i).getAddress().getPhone().equals(findByPhone)) {
							System.out.println(personsArrayList.get(i).getFirstName() + " "
									+ personsArrayList.get(i).getLastName() + " " + personsArrayList.get(i).getAddress());
							test5 = false;
						}
					}
				}
				if (test5) {
					System.out.println("No such a Number in PhoneBook\n");
				}

				break;

			case 6: // Search by City
				Scanner input6 = new Scanner(System.in);
				System.out.println("Enter the City, *Case sansative*");
				String findByCity = input6.nextLine();
				boolean test6 = true;
				for (int i = 0; i < personsArrayList.size(); i++) {
					if (personsArrayList.get(i) != null) {
						if (personsArrayList.get(i).getAddress().getCity().equals(findByCity)) {
							System.out.println(personsArrayList.get(i).getFirstName() + " "
									+ personsArrayList.get(i).getLastName() + " " + personsArrayList.get(i).getAddress());
							test6 = false;
						}
					}
				}
				if (test6) {
					System.out.println("No such a City name found in PhoneBook\n");
				}

				break;

			case 7: // Search by State
				Scanner input7 = new Scanner(System.in);
				System.out.println("Enter the State, *Case sansative*");
				String findByState = input7.nextLine();
				boolean test7 = true;
				for (int i = 0; i < personsArrayList.size(); i++) {
					if (personsArrayList.get(i) != null) {
						if (personsArrayList.get(i).getAddress().getState().equals(findByState)) {
							System.out.println(personsArrayList.get(i).getFirstName() + " "
									+ personsArrayList.get(i).getLastName() + " " + personsArrayList.get(i).getAddress());
							test7 = false;
						}
					}
				}

				if (test7) {
					System.out.println("No such a State name found in PhoneBook\n");
				}

				break;

			case 8: // Show all records in asc order

				// int arr[]={33,3,4,5};
				// Person personsArrayList[] = new Person[10];
				// Arrays.sort(personsArrayList);
				// System.out.println(Arrays.toString (newarr));
				int count = 0;
				for (int i = 0; i < personsArrayList.size(); i++) {
					if (personsArrayList.get(i) != null) {
						count++;
					}
				}

				String[] personNames = new String[count];

				for (int i = 0; i < personNames.length; i++) {
					personNames[i] = personsArrayList.get(i).getFirstName();
				}

				Collections.sort(personsArrayList);

				for (int i = 0; i < personsArrayList.size(); i++) {
					System.out.println(personsArrayList.get(i));
				}

				break;

			case 9: // Update by Phone Number
				Scanner input9 = new Scanner(System.in);
				System.out.println("Enter the Number in this format pls: (xxx)-xxx-xxxx");
				String updateByPhone = input9.nextLine();
				System.out.print("Enter the New Number in this format pls: xxxxxxxxxx");
				String newPhoneNum = input9.nextLine();
				boolean test9 = true;
				for (int i = 0; i < personsArrayList.size(); i++) {
					if (personsArrayList.get(i) != null) {
						if (personsArrayList.get(i).getAddress().getPhone().equals(updateByPhone)) {

							personsArrayList.get(i).getAddress().setPhone(newPhoneNum);
							test9 = false;
							System.out.println(updateByPhone + "\nis successfully Updated to\n" + newPhoneNum+"\n");
						}
					}
				}
				if (test9) {
					System.out.println("No such a Number found in PhoneBook\n");
				}

				break;

			case 10: // exit
				System.out.println("\nThank you for your participation, Good Bye!!!");
				System.exit(0);

			default:
				System.out.println("\nplease enter a valid option\n");
			}
		}

	}

	

}
