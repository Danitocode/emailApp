package emailApp;

import java.util.Random;
import java.util.Scanner;

public class Email {

	private int id;
	private String email;
	private static String department;
	private static String password;
	private int mailBoxCap = 500;
	private String alternateEmail;
	private String firstName;
	private String lastName;
	private String companyName = "aeycompany";
	
	public Email(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("New worker : " + this.firstName + " Department code : ");
	}

	
	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("New worker : " + this.firstName + " Department code : " + this.department);
	}

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public static String setDepartment(){
		boolean control = false;
		System.out.print("\n Insert your department : \n 1 for Sales\n 2 for Developement \n 3 for Accounting \n for none : ");

		while( control == false ) {
			Scanner inDep = new Scanner(System.in);
			int depInt = inDep.nextInt();
				if(depInt == 1) {
					System.out.println("Your department is Sales\n");
					department = "Sales";
					control = true;
					return department;
				}else if(depInt == 2){
					System.out.println("Your department is Development\n");
					department = "Development";
					control = true;
					return department;
				}else if(depInt == 3){
					System.out.println("Your department is Accounting\n");
					control = true;
					department = "Accounting";
					return department;
				}else{
					System.out.print("Please, insert a valid answer :  ");
				}
		}

		return department;

	}

	
	public static String getPassword() {
		
		System.out.print("Insert the length of your new password :  ");
		Scanner inPass = new Scanner(System.in);
		int passInt = inPass.nextInt();
		System.out.println("Your password is " + setPassword(passInt));

		return password;
	}


	public static String setPassword(int length) {
		String passwordSet = "qwertyuiopasdfghjklñzxcvbnm,123456789·$%&/!";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] =  passwordSet.charAt(rand);
		}
		return new String(password);
		
	}

	
	
	public int getMailBoxCap() {
		return mailBoxCap;
	}


	public void setMailBoxCap(int mailBoxCap) {
		this.mailBoxCap = mailBoxCap;
	}


	public String getAlternateEmail() {
		return alternateEmail;
	}
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Email other = (Email) obj;
		if (id != other.id)
			return false;
		return true;
	}


	public String showInfo() {
		return "Display name: " + firstName + " " + lastName + "\nCompany name : " + companyName
				+ "\nCompany email: " + firstName +  lastName + "@" + department +  "." + companyName + ".com" + "\nMailbox capacity : " + mailBoxCap + "mb" ;
	}


}
