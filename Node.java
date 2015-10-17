package phonebook;

public class Node {

    PhoneInfo info;
    Node next;

    Node () {
        this.info = null;
        this.next = null;
    }

    Node (String name, String phoneNumber, String birthday ) {
        info = new PhoneInfo( name, phoneNumber, birthday);
        this.next = null;
    }
}
