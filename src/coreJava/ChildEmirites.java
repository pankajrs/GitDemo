package coreJava;

public class ChildEmirites extends ParentAirCraft{

	public static void main(String[] args) {
		
		ChildEmirites c= new ChildEmirites();
		c.engine();
		c.safetyGuidelines();
		c.bodyColor();

	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}

}
