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
        LinkedList l1 = new LinkedList();


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
                   l1.addData( name, phoneNumber, birthday );
                   break;

               case 2:
                   break;

               case 3:
                   break;

               case 4:
                    l1.showAllData();
                    break;

               case 5:
                   System.out.println ( "terminate program." );
                   return;
           }
        }
    }
}
