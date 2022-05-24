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
public class QueueImp {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int exit=0;
        do{
            System.out.println("Menu : \n1.LinkedListQueue \n2.PriorityQueue");
            int choice=sc.nextInt();
            if(choice==1){
                Queue<String> q=new LinkedList<>();

                System.out.println("Enter 5 element :");
                for(int i=0;i<5;i++){
                    q.add(sc.next());
                }
                System.out.println("The peek element is :"+q.peek());
                System.out.println(q);
                System.out.println("The removed element is :");
                for(int i=0;i<3;i++){
                    System.out.print(q.remove()+" ");
                }
                System.out.println("\nThe peek element is :"+q.peek());
                System.out.println(q);

            }
            else{
                Queue<String> q=new PriorityQueue<>();

                System.out.println("Enter 5 element :");
                for(int i=0;i<5;i++){
                    q.add(sc.next());
                }
                System.out.println("The peek element is :"+q.peek());
                System.out.println(q);
                System.out.println("The removed element is :");
                for(int i=0;i<3;i++){
                    System.out.println(q.remove()+" ");
                }
                System.out.print("\nThe peek element is :"+q.peek());
                System.out.println(q);
                
            }
            System.out.println("Do you want to continue(1|0): ");
                exit=sc.nextInt();
        }while(exit==1);
    }
}
