package coreJava;

public abstract class ParentAirCraft {

	public void engine() {
		System.out.println("follow engine guidelines");
	}
	
	protected void safetyGuidelines()
	{
		System.out.println("follow safety guideline");
	}
	
	public abstract void bodyColor();

}
