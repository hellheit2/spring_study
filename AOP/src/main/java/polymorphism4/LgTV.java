package polymorphism4;

/*
 * public class LgTV { public void turnOn() {
 * System.out.println("LgTV.... turn on"); } public void turnOff() {
 * System.out.println("LgTV.... turn off"); } public void soundUp() {
 * System.out.println("LgTV.... sound up"); } public void soundDown() {
 * System.out.println("LgTV.... sound down"); } }
 */

public class LgTV implements TV{

	@Override
	public void powerOn() {
		System.out.println("LgTV.... turn on");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV.... turn off");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTV.... sound up");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV.... sound down");
		
	}
	
}