package com.phoneBook;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {

		// Person persons[];

		Address addressPerson1 = new Address("114", "Market St", "St Louis", "MO", "63403", "6366435698",
				"doe@test.com");
		Address addressPerson2 = new Address("324", "Main St", "St Charles", "MO", "63303", "8475390126",
				"edoe@test.com");
		Address addressPerson3 = new Address("574", "Pole Ave", "St Peters", "MO", "63333", "5628592375",
				"westdoe@test.com");

		Person person1 = new Person("John", "Doe", addressPerson1);
		Person person2 = new Person("John", "E Doe", addressPerson2);
		Person person3 = new Person("John", "Michael West Doe", addressPerson3);

		Person persons[] = new Person[10];
		persons[0] = person1;
		persons[1] = person2;
		persons[2] = person3;

		int count = 3;

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
				if (count < 9) { // int count = 3;
					persons[count] = p;
					count++;
					System.out.println("\nEntered recod was successfully saved into PhoneBook\n");
				}

				break;

			// if (persons[i] != null)

			case 2: // Delete by phone number
				Scanner input2 = new Scanner(System.in);
				System.out.println("Enter the Number in this format pls: (xxx)-xxx-xxxx");
				String case2 = input2.nextLine();
				boolean test2 = true;
				int count1 = 0;
				for (int i = 0; i < persons.length; i++) {
					if (persons[i] != null) {
						if (persons[i].getAddress().getPhone().equals(case2)) {
							persons[i] = null;
							count1--;

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
				String case3 = input3.nextLine();
				boolean test3 = true;
				for (int i = 0; i < persons.length; i++) {
					if (persons[i] != null) {
						if (persons[i].getFirstName().equals(case3)) {
							System.out.println(persons[i].getFirstName() + " " + persons[i].getLastName() + " "
									+ persons[i].getAddress());
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
				String case4 = input4.nextLine();
				boolean test4 = true;
				for (int i = 0; i < persons.length; i++) {
					if (persons[i] != null) {
						if (persons[i].getLastName().equals(case4)) {
							System.out.println(persons[i].getFirstName() + " " + persons[i].getLastName() + " "
									+ persons[i].getAddress());
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
				String case5 = input5.nextLine();
				boolean test5 = true;
				for (int i = 0; i < persons.length; i++) {
					if (persons[i] != null) {
						if (persons[i].getAddress().getPhone().equals(case5)) {
							System.out.println(persons[i].getFirstName() + " " + persons[i].getLastName() + " "
									+ persons[i].getAddress());
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
				String case6 = input6.nextLine();
				boolean test6 = true;
				for (int i = 0; i < persons.length; i++) {
					if (persons[i] != null) {
						if (persons[i].getAddress().getCity().equals(case6)) {
							System.out.println(persons[i].getFirstName() + " " + persons[i].getLastName() + " "
									+ persons[i].getAddress());
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
				String case7 = input7.nextLine();
				boolean test7 = true;
				for (int i = 0; i < persons.length; i++) {
					// if (persons[i] != null) {
					if (persons[i].getAddress().getState().equals(case7)) {
						System.out.println(persons[i].getFirstName() + " " + persons[i].getLastName() + " "
								+ persons[i].getAddress());
						test7 = false;
					}
					// }
				}
				if (test7) {
					System.out.println("No such a State name found in PhoneBook\n");
				}

				break;

			case 8: // Show all records in asc order

				// int arr[]={33,3,4,5};
				// Person persons[] = new Person[10];
				// Arrays.sort(persons);
				// System.out.println(Arrays.toString (newarr));

				for (int i = 0; i < persons.length; i++) {
					if (persons[i] != null) {

						System.out.println(persons[i].getFirstName() + " " + persons[i].getLastName() + " "
								+ persons[i].getAddress());
						test7 = false;

					}
				}

				break;

			case 9: // Update by Phone Number
				Scanner input9 = new Scanner(System.in);
				System.out.println("Enter the Number in this format pls: (xxx)-xxx-xxxx");
				String case9 = input9.nextLine();
				System.out.println("Enter the New Number in this format pls: xxxxxxxxxx");
				String case91 = input9.nextLine();
				boolean test9 = true;
				for (int i = 0; i < persons.length; i++) {
					if (persons[i] != null) {
						if (persons[i].getAddress().getPhone().equals(case9)) {

							persons[i].getAddress().setPhone(case91);
							test9 = false;
							System.out.println(case9 + "\nis successfully Updated\n" + case91);
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
