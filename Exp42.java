class Animal{  
 void eat(){System.out.println("animal is eating...");}  
}  
  
class Exp42 extends Animal{  
 void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  Animal a=new Exp42();  
  a.eat();  
 }  
}  