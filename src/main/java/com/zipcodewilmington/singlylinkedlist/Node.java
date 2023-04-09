package com.zipcodewilmington.singlylinkedlist;

public class Node <T>{
    T data;
    Node<T> next;

    public Node(T data){
        this.data= data;
        next=null;
    }
    public T getData(){
        return data;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }


}
