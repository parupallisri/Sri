import com.automation.Dog;
import com.automation.Inheritance;

public class Inheritance {

Void  eat() { 
System.out.println("eating..."); }  
}  
class Dog extends Inheritance {  
void bark() { 
System.out.println("barking..."); }  
}  
class TestInheritance {  
public static void main(String args[]) {  
Dog d=new Dog();  
d.bark(); 
d.eat();             
}
}