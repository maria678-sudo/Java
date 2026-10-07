/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
class Overload{
    Overload(){
            System.out.println("Default");
}
     Overload(int a){
            System.out.println("constructor:"+a);
}
      Overload(int a,int b){
            System.out.println("constructor"+a+"and"+b);
}
      void display(int a){
          System.out.println("method "+a);
      }
    void display(int a,int b){
          System.out.println("method "+a+"and"+b);
      }
    void display(String msg){
          System.out.println("method "+msg);
      }
}


public class Overloads {
    public static void main(String[]args){
        Overload obj1=new Overload();
        Overload obj2=new Overload(10);
        Overload obj3=new Overload(10,20);
        obj1.display(10);
        obj1.display(30,40);
        obj1.display("Hello");
    }
}
