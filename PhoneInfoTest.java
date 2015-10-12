package java_oop_practice;

import java.util.Scanner;
/**
 * Created by DH on 15. 10. 6..
 * Last modification 15.10.12..
 */
public class PhoneInfoTest {
    public static void main (String[] args) {
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
                    if( l1.numOfData != 0 ) {
                        System.out.print("\n조회할 이름 입력 : ");
                        try {
                            l1.searchData(keyboard.next()).getInfo();
                            System.out.println("입니다.");
                        } catch (NullPointerException e) {
                            System.out.println("입력하신 데이터가 존재하지 않습니다.");
                        }
                        break;
                    }
                    else {
                        System.out.println ( "저장된 데이터가 하나도 없습니다." );
                    }
                    break;

                case 3:
                    if( l1.numOfData != 0 ) {
                        System.out.print("\n삭제할 이름 입력 : ");
                        try {
                            l1.delData(keyboard.next()).getInfo();
                            System.out.println("삭제되었습니다.");
                        } catch (NullPointerException e) {
                            System.out.println("입력하신 데이터가 존재하지 않습니다.");
                        }
                        break;
                    }
                    else {
                        System.out.println ( "저장된 데이터가 하나도 없습니다." );
                    }
                    break;

                case 4:
                    if( l1.numOfData != 0 ) {
                        System.out.println("\n번호 수정할 사람 이름 입력 ");
                        try {
                            l1.modifyPhoneNumber(keyboard.next());


                        } catch (NullPointerException e) {
                            System.out.println("입력하신 이름은 존재하지 않습니다.");
                        }
                        break;
                    }
                    else {
                        System.out.println ( "저장된 데이터가 하나도 없습니다." );
                    }
                    break;

                case 5:
                    l1.showAllData();
                    break;

                case 6:
                    ScreenOut.screenClear();
                    break;

                case 7:
                    System.out.println ( "terminate program." );
                    return;
            }
        }
    }
}
