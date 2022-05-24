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
public class StackImp {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Stack<String> stk=new Stack<String>();
        System.out.println("Enter 5 elements :");
        for(int i=0;i<5;i++){
            stk.push(sc.next());
        }
        System.out.println("The peek element is :"+ stk.peek());
        System.out.println(stk);
        System.out.println("The popped element:");
        for(int i=0;i<3;i++){
            System.out.println(stk.pop());
        }
        System.out.println("The peek element is :"+ stk.peek());
        System.out.println(stk);
    }
}
