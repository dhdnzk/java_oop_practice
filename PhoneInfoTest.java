package java_oop_practice;

/**
 * Created by DH on 15. 10. 6..
 */
public class PhoneInfoTest {
    public static void main (String[] args) {
    PhoneInfo p1 = new PhoneInfo ( "홍길동", "010-123-1234", "2015.10.06" );
    PhoneInfo p2 = new PhoneInfo ( "가나다", "010-111-1111", "2000.01.01" );
    PhoneInfo p3 = new PhoneInfo ( "라마바", "010-987-6543" );
    PhoneInfo p4 = new PhoneInfo ( "사아자", "010-345-4567" );

        p1.getInfo();
        p2.getInfo();
        p3.getInfo();
        p4.getInfo();
    }
}

