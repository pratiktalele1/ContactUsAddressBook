
public class AddressMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		Contact contact = new Contact();
		UC1 uc1 = new UC1();
		uc1.add(contact.map,contact.names);
		uc1.print(contact.map,contact.names);
		uc1.add(contact.map,contact.names);
		uc1.print(contact.map,contact.names);
		
	}
}
