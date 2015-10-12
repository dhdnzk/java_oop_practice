package java_oop_practice;

/**
 * Created by DH on 15. 10. 12..
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
        this.tail = null;
        this.cur = null;
        this.before = null;
        this.numOfData = 0;
    }

    void addData ( String name, String phoneNumber, String biorthday ) {



    }

    PhoneInfo delData ( String name ) {



    }

    PhoneInfo searchData ( String name ) {



    }
}

class Node {
    PhoneInfo info;
    Node next;

    Node () {
        this.info = null;
        this.next = null;
    }
}
