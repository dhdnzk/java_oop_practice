package java_oop_practice;

/**
 * Created by DH on 15. 10. 8..
 * Last modification 15. 10. 12..
 */
public class ScreenOut {

    static void showMenu () {
        System.out.println( "SELECT." );
        System.out.println( "1. add Info." );
        System.out.println( "2. search Info." );
        System.out.println( "3. delete Info" );
        System.out.println( "4. show all Info" );
        System.out.println( "5. EXIT." );
        System.out.print( "select : " );
    }

    static void askName () {
        System.out.print ( "name : " );
    }
    static void askPhoneNumber () {
        System.out.print( "phoneNumber : " );
    }
    static void askBirthday () {
        System.out.print("birthday : ");
    }
}
