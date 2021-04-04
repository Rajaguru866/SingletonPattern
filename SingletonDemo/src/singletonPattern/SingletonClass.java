package singletonPattern;

public class SingletonClass {
	
	static SingletonClass obj;
	int value = 2021;
	private SingletonClass()
	{
	}
	public static SingletonClass getSingleton()
	{
		if(obj == null)
		{ 
			synchronized(SingletonClass.class)
			{
				if(obj == null)
				{
					obj = new SingletonClass();
				}
			}
		}
		return obj;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	

}
