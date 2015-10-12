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
        LinkedList l1 = new LinkedList(); // 리스트 추가

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
                    System.out.print( "\n조회할 이름 입력 : " );
                    PhoneInfo search = ( l1.searchData( keyboard.next() ) );
                    if ( search != null ) {
                        search.getInfo();
                        System.out.println("입니다.");
                    }
                    else {
                        System.out.println( "입력하신 데이터가 존재하지 않습니다." );
                    }
                    break;

                case 3:
                    System.out.print( "삭제할 이름 입력 : " );
                    PhoneInfo del = ( l1.delData(keyboard.next() ) );
                    if ( del != null ) {
                        del.getInfo();
                        System.out.println( "삭제되었습니다." );
                    }
                    else {
                        System.out.println ( "입력하신 데이터가 존재하지 않습니다." );
                    }
                    break;

                case 4:
                    l1.showAllData();
                    break;

                case 5:
                    ScreenOut.screenClear();
                    break;

                case 6:
                    System.out.println ( "terminate program." );
                    return;
            }
        }
    }
}
