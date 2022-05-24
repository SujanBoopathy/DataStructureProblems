/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA;

/**
 *
 * @author Saubali
 */
import java.util.*;
public class LinkedListImp {
    public static Node head;
    static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
        }
    }
    static void insertVal(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node cur=head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=newNode;
        }
    }
    static void print(){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data);
            cur=cur.next;
            if(cur!=null){
                System.out.print("->");
            }
        }
        
    }
    static void delete(int data){
        Node cur=head;
        while(cur!=null){
            if(cur.next.data==data){
                break;
            }
            cur=cur.next;
        }
        if(cur!=null){
            cur.next=cur.next.next;
        }
    }
    public static void main(String args[]){
        insertVal(4);
        insertVal(5);
        insertVal(6);
        insertVal(7);
        insertVal(8);
        int exit=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Menu:\n1.Insertion \t2.Deletion \t3.print\n");
            int choice=sc.nextInt();
            int temp;
            switch(choice){
                case 1:
                    System.out.println("Enter value :");
                    temp=sc.nextInt();
                    insertVal(temp);
                    break;
                case 2:
                    System.out.println("Enter value to delete:");
                    temp=sc.nextInt();
                    delete(temp);
                    print();
                    break;
                case 3:
                    System.out.println("The linked list is :");
                    print();
                    break;
            }
            System.out.println("\nDo you want to continue(1|0): ");
            exit=sc.nextInt();
        }while(exit==1);
    }
}
