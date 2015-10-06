package java_oop_practice;

/**
 * Created by DH on 15. 10. 6..
 */
public class PhoneInfo {

    String name;
    String phoneNumber;
    String birthday;

    PhoneInfo ( String name, String phoneNumber, String birthday ) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }

    PhoneInfo ( String name, String phoneNumber ) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = null;
    }

    String getName () {
        return this.name;
    }

    String getPhoneNumber () {
        return this.phoneNumber;
    }

    String getBirthday () {
        return this.birthday;
    }

    void getInfo() {
        System.out.println( "이름 : " + this.getName() );
        System.out.println( "전화번호 : " + this.getPhoneNumber() );
        if ( this.getBirthday() != null ) {
            System.out.println("생년월일 : " + this.getBirthday());
        }
        System.out.println();
    }

    int plus (int a, int b ) {
        return a + b;
    }

}
