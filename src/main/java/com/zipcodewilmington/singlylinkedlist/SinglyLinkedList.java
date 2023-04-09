package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T extends Comparable> {
    Node<T>head;

    public void add(T node) {
      if(head== null){
          head=new Node<T>(node);
      }else{
          Node<T>current=head;
          while(current.next != null){
              current=current.next;
          }
          current.setNext(new Node<T>(node));
      }
    }
    public T get(int index) {
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.getData();

    }
    public void remove(T toRemove) {
        if(head.getData().equals(toRemove)){
            head = head.next;
            return;
        }

        Node<T> before = head;
        Node<T> after = head.next;

        while(after != null){
            if(after.getData().equals(toRemove)){
                Node<T> temp = after;
                after = after.next;
                before.next = after;
                return;
            } else{
                before = after;
                after = after.next;
            }
        }
    }
    public int size() {
        int count= 0;
        Node<T> current= head;
        while(current!= null){
            count++;
            current=current.next;
        }
        return count;
    }
    public boolean contains(T expected) {
        Node<T> current =head;
        while (current != null) {
            if(current.getData().equals(expected)){
                return true;
            }
            current= current.next;
        }
        return false;
    }
    public int find(T target) {
        if(head == null){
            System.out.println("null");
            return -1;
        }
        Node<T> current = head;
        int count = 0;
        while(current != null){
            if(current.getData().equals(target)){
                return count;
            }
            count++;
            current = current.next;
        }
        return -1;
    }
    public SinglyLinkedList<T> copy() {
        SinglyLinkedList<T> newList = new SinglyLinkedList<>();
        Node<T> current = head;
        while(current != null){
            newList.add(current.getData());
            current = current.next;
        }
        return newList;
    }
    public void sort() {
        SinglyLinkedList<T> newList = new SinglyLinkedList<>();
        //T.T
        Node<T> min = head;
        Node<T> current = head;
        int startSize = this.size();
        for (int i = 0; i < startSize; i++) {
            current = head;
            min = current;
            for (int j = 0; j < this.size(); j++) {
                if (current.getData().compareTo(min.getData()) < 0) {
                    min = current;
                }
                current = current.next;
            }
            newList.add(min.getData());
            this.remove(min.getData());

            head = newList.head;
        }
    }

}
