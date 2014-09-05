package test;

public class AbctractImpl extends Abstractnij{

	public AbctractImpl()  {
//		super();
		System.out.println("  AbctractImpl");
	}

	public AbctractImpl(int i)  {
		//super(i);
		System.out.println("  AbctractImpl PARAM i="+i);
	}
	
	@Override
	void m1() {
		System.out.println("  AbctractImpl = m1()");
		
	}

	void m2(){
		System.out.println("  AbctractImpl = m2()");
		
	}
	
}
