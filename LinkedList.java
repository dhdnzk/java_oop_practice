package phonebook;

import java.util.Objects;
import java.util.Scanner;

public class LinkedList {
    Node head;
    Node tail;
    Node cur;
    Node before;
    int numOfData;

    LinkedList () {
        this.head = new Node();
        this.head.info = null;
        this.head.next = null;
        this.tail = head;
        this.cur = null;
        this.before = null;
        this.numOfData = 0;
    }

    void addData ( String name, String phoneNumber, String birthday ) {
        Node newNode = new Node( name, phoneNumber, birthday );
        this.tail.next = newNode;
        this.tail = newNode;
        this.cur = null;
        this.before = null;
        this.numOfData++;
    }

    PhoneInfo searchData ( String name ) {
        if ( this.numOfData == 0 ) {
            return null;
        }

        if (Objects.equals(this.LFirst().getName(), name)) {
            return this.cur.info;
        }

        while (this.cur.next != null) {
            if (Objects.equals(this.LNext().getName(), name)) {
                return this.cur.info;
            }
        }
        return null; // 리스트 끝까지 탐색 후 못찾으면 null반환
    }

    PhoneInfo delData ( String name ) {
        if (this.numOfData == 0)
            return null;

        if (Objects.equals(this.LFirst().getName(), name)) {
            PhoneInfo ret = this.cur.info;
            this.before.next = this.cur.next;
            this.cur = this.before;
            this.numOfData --;
            return ret;
        }

        while (this.cur.next != null) {
            if (Objects.equals(this.LNext().getName(), name)) {
                PhoneInfo ret = this.cur.info;
                this.before.next = this.cur.next;
                this.cur = this.before;
                this.numOfData--;
                return ret;
            }
        }
        return null; // 리스트 끝까지 탐색 후 못찾으면 null반환
    }

    void modifyPhoneNumber ( String name ) {
        if ( this.numOfData == 0 ) {
            System.out.println("저장된 데이터가 하나도 없습니다.");
            return;
        }
        Scanner keyboard = new Scanner( System.in );

        if ( Objects.equals( this.LFirst().getName(), name ) ) {

            System.out.print( "바꿀 번호 입력 : " );
            this.cur.info.setPhoneNumber( keyboard.next());
        }

        while ( this.cur.next != null ) {
            if ( Objects.equals( this.LNext().getName(), name ) ) {
                System.out.print( "바꿀 번호 입력 : " );
                this.cur.info.setPhoneNumber( keyboard.next() );
            }
        }
    }

    void showAllData () {

        this.cur = this.head;
        System.out.println( "총 데이터 개수 : " + this.numOfData + "개" );
        while( this.cur.next != null ) {
            this.cur = this.cur.next;
            this.cur.info.getInfo( );
        }
        this.cur = null;
        this.before = null;
    }

    PhoneInfo LFirst () {
        this.cur = this.head.next;
        this.before = this.head;
        return this.cur.info;
    }

    PhoneInfo LNext () {
        this.before = this.cur;
        this.cur = this.cur.next;
        return this.cur.info;
    }
}

