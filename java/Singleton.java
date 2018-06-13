package lets.code.every.java;

public class Singleton {

	private volatile static Singleton instance = null;
	private Singleton()
	{
		//do sth.
	}
	public static Singleton getInstance()
	{
		if(instance == null)
		{
			synchronized (Singleton.class) {
				if(null == instance)
				{
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
