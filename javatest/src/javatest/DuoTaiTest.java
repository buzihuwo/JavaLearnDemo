package javatest;

public class DuoTaiTest {
	public static void main(String[] args) {
//		show(new Cat());
//		show(new Dog1());
		
		Animal1 a=new Cat();
		a.eat();
		Cat c=(Cat)a;
		c.work();
	}
	
	public static void show(Animal1 a)
	{
		a.eat();
		if(a instanceof Cat)
		{
			Cat c=(Cat)a;
//			c.work();
		}else if(a instanceof Dog1){
			Dog1 c=(Dog1)a;
//			c.work();
		}
	}
}


abstract class Animal1 {  
    abstract void eat();  
}  
  
class Cat extends Animal1 {  
    public void eat() {  
        System.out.println("吃鱼");  
    }  
    public void work() {  
        System.out.println("抓老鼠");  
    }  
}  
  
class Dog1 extends Animal1 {  
    public void eat() {  
        System.out.println("吃骨头");  
    }  
    public void work() {  
        System.out.println("看家");  
    }  
}