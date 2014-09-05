package test;

public class Singleton {
	
	public static Singleton getInstance = SingletonHolder.instance;
	private int i;

private Singleton() {
	i=-1;
}
	
	
private static class SingletonHolder{
	
	private static Singleton instance = new Singleton();
}

}
