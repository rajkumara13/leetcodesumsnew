package org.example;
import java.util.*;
class Node {
      int val;
      Node next;
      Node(int val){
          this.val=val;
      }
}
class linkedList {
    Node head = null;
    public void atStart(int val){
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
        return;
    }
    public void addAtHead(int val){
        if(head==null){
            atStart(val);
            return;
        }
        Node nn=new Node(val);
        nn.next=head;
        head=nn;
        return;
    }
    public void addAtTail(int val){
        if(head==null){
            atStart(val);
            return;
        }
        Node newNode=new Node(val);
        Node curr=head;
        while(curr.next !=null){
            curr=curr.next;
        }
        curr.next=newNode;
        return;
    }
    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.val+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public void addAtIndex(int index,int val){
        Node newNode=new Node(val);
        if(index==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        int i=0;
        Node curr=head;
        while(curr!=null){
            if(i==index-1) {
                newNode.next = curr.next;
                curr.next = newNode;
                return;
            }
            i++;
            curr=curr.next;
        }
        System.out.println("Index is OutOfBound");
        return;
    }
    public int get(int index){
        int i=0;
        Node curr=head;
        while(curr!=null){
            if(i==index){
                return curr.val;
            }
            i++;
            curr=curr.next;
        }
        System.out.println("Index is Not Valid");
        return -1;
    }
    public void deleteAtIndex(int index){
        if(head==null)return;
        int i=0;
        if(index==0){
            head=head.next;
            return;
        }
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            if(i==index){
                prev.next=curr.next;
                return;
            }
            i++;
            prev=curr;
            curr=curr.next;
        }
        System.out.println("Not valid for delete index");
    }

}
public class Main {
    public static void main(String[] args) {
           linkedList ls=new linkedList();
           ls.addAtHead(10);
           ls.addAtHead(20);
           ls.display();
           ls.addAtHead(20);
           ls.display();
           ls.addAtTail(50);
           ls.addAtTail(60);
           ls.display();
           ls.addAtIndex(2,30);
           ls.addAtIndex(7,100);
           ls.addAtIndex(0,90);
           ls.addAtIndex(0,110);
           ls.display();
           System.out.println(ls.get(6));
           ls.deleteAtIndex(3);
           ls.deleteAtIndex(6);
           ls.display();
           ls.deleteAtIndex(2);
           ls.display();
        }
    }
