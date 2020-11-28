package emailApp;

public class App {

	public static void main(String[] args) {
		Email em1 = new Email("John", "Smith");
		Email.setDepartment();
		Email.getPassword();
		System.out.print(em1.showInfo());

	}

}
