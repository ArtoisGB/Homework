package org.airport.customlist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CustomLinkedList<T> {
    protected static final Logger LOGGER = LogManager.getLogger(CustomLinkedList.class);
    Node<T> head;
    private int length = 0;

    public CustomLinkedList() {
        this.head = null;
    }

    public void add(T data) {
        Node<T> temp = new Node<>(data);
        if (this.head == null) {
            head = temp;
        } else {
            Node<T> X = head;
            while (X.next != null) {
                X = X.next;
            }
            X.next = temp;
        }
        length++;
    }

    public boolean isEmpty() {
        boolean status = false;
        if (this.head == null) {
            status = true;
        }
        return status;
    }

    public void add(int position, T data) {
        if (position > length + 1) {
            LOGGER.info("Position unavailable");
            return;
        }

        if (position == 1) {
            Node<T> temp = head;
            head = new Node<T>(data);
            head.next = temp;
            return;
        }
        Node<T> temp = head;
        Node<T> prev = new Node<T>(null);
        while (position - 1 > 0) {
            prev = temp;
            temp = temp.next;
            position--;
        }
        prev.next = new Node<T>(data);
        prev.next.next = temp;
    }

    public void remove(T key) {
        Node<T> prev = new Node<>(null);
        prev.next = head;
        Node<T> next = head.next;
        Node<T> temp = head;
        boolean exists = false;

        if (head.data == key) {
            head = head.next;
            exists = true;
        }

        while (temp.next != null) {
            if (String.valueOf(temp.data).equals(
                    String.valueOf(key))) {
                prev.next = next;
                exists = true;
                break;
            }

            prev = temp;
            temp = temp.next;
            next = temp.next;
        }

        if (exists == false
                && String.valueOf(temp.data).equals(
                String.valueOf(key))) {
            prev.next = null;
            exists = true;
        }
        if (exists) {
            length--;
        } else {
            LOGGER.info("Given position is not present in list");
        }
    }

    public void clear() {
        head = null;
        length = 0;
    }

    int length() {
        return this.length;
    }

    public String toString() {
        String S = "{ ";
        Node<T> X = head;
        if (X == null)
            return S + " }";
        while (X.next != null) {
            S += String.valueOf(X.data) + ", ";
            X = X.next;
        }
        S += String.valueOf(X.data);
        return S + " }";
    }
}

