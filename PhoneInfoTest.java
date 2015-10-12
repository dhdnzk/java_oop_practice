package java_oop_practice;

import java.util.Scanner;
/**
 * Created by DH on 15. 10. 6..
 * Last modification 15.10.12..
 */
public class PhoneInfoTest {
    public static void main (String[] args) {
        int choice;
        Scanner keyboard = new Scanner( System.in );

        while ( true ) {
           ScreenOut.showMenu();

           switch ( keyboard.nextInt() ) {
               case 1:
                    ScreenOut.askName();
                    String name = keyboard.next();
                    ScreenOut.askPhoneNumber();
                    String phoneNumber = keyboard.next();
                    ScreenOut.askBirthday();
                    String birthday = keyboard.next();

                    PhoneInfo p1 = new PhoneInfo( name, phoneNumber, birthday );
                    p1.getInfo();
                   break;

               case 2:
                   System.out.println ( "terminate program." );
                   return;
           }
        }
    }
}
