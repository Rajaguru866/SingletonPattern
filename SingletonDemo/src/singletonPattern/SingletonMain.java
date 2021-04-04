package singletonPattern;

public class SingletonMain {

	public static void main(String[] args) {
		
		SingletonClass obj = SingletonClass.getSingleton();
		SingletonClass obj2 = SingletonClass.getSingleton();
		obj.setValue(249);
		System.out.println("Value of object1 is " + obj.getValue());
		System.out.println("Value of object2 is " + obj2.getValue());

	}

}
