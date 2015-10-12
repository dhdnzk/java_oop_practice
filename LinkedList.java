package java_oop_practice;

/**
 * Created by DH on 15. 10. 12..
 * Last modification 15. 10. 12..
 */
public class LinkedList {
    Node head;
    Node tail;
    Node cur;
    Node before;
    int numOfData;

    LinkedList (  ) {
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
        this.numOfData++;
    }

    void showAllData () {

        this.cur = this.head;
        while( this.cur.next != null ) {
            this.cur = this.cur.next;
            this.cur.info.getInfo( );
        }
    }



/*
    PhoneInfo delData ( String name ) {
        if ( this.numOfData == 0 ) {
            return null;
        }




    }

    PhoneInfo searchData ( String name ) {

    }

    PhoneInfo LFirst () {

    }

    PhoneInfo LNext () {

    }
    */
}


class Node {
    PhoneInfo info;
    Node next;

    Node () {
        this.info = null;
        this.next = null;
    }

    Node (String name, String phoneNumber, String birthday ) {
        info = new PhoneInfo( name, phoneNumber, birthday);
        this.next = null;
    }
}
