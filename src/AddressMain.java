
public class AddressMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		Contact contact = new Contact();
		UC1 uc1 = new UC1();
		uc1.add(contact.map, contact.names);
		uc1.print(contact.map, contact.names);

		Contact2 contact2 = new Contact2();
		UC2 uc2 = new UC2();
		uc2.add(contact2.map, contact2.names);
		uc2.print(contact2.map, contact2.names);

	}
}
