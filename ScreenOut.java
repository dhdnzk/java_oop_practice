package java_oop_practice;

/**
 * Created by DH on 15. 10. 8..
 * Last modification 15. 10. 12..
 */
public class ScreenOut {

    static void showMenu () {
        System.out.println( "\nSELECT." );
        System.out.println( "1. Add Info." );
        System.out.println( "2. Search Info." );
        System.out.println( "3. Delete Info" );
        System.out.println( "4. Modify phone number." );
        System.out.println( "5. Show all Info" );
        System.out.println( "6. Screen clear." );
        System.out.println( "7. EXIT." );
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

    static void screenClear () {
        for ( int i = 0; i < 80; i ++ ) {
            System.out.println( "" );
        }
    }
}
