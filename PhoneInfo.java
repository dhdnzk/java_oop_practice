package java_oop_practice;

/**
 * Created by DH on 15. 10. 6..
 * Last modification 15.10.12...
 */
public class PhoneInfo {

    private String name;
    private String phoneNumber;
    private String birthday;

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

    private void setName ( String name ) {
        this.name = name;
    }
    private void setPhoneNumber ( String phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }
    private void setBirthday ( String birthday ) {
       this.birthday = birthday;
   }


    void getInfo() {
        System.out.println( "name : " + this.getName() );
        System.out.println( "phoneNumber : " + this.getPhoneNumber() );
        if ( this.getBirthday() != null ) {
            System.out.println("birthday : " + this.getBirthday());
        }
        System.out.println();
    }
}

