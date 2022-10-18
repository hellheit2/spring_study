package polymorphism;

/*
 * public class SamsungTV { public void powerOn() {
 * System.out.println("SamsungTV.... power on"); } public void powerOff() {
 * System.out.println("SamsungTV.... power off"); } public void volumeUp() {
 * System.out.println("SamsungTV.... volume up"); } public void volumeDown() {
 * System.out.println("SamsungTV.... volume down"); } }
 */


public class SamsungTV implements TV{
	
	
	
	/* ~ 70 */ 
	  public void initMethod() { System.out.println("객체 초기화 작업 처리...."); }
	  
	  public void destroyMethod() { System.out.println("객체 삭제 전에 처리할 로직 처리...."); }
	  
	  public SamsungTV() { System.out.println("===> SamsungTV 객체 생성"); }
	  
	  @Override public void powerOn() {
	  System.out.println("SamsungTV.... power on");
	  
	  }
	  
	  @Override public void powerOff() {
	  System.out.println("SamsungTV.... power off");
	  
	  }
	  
	  @Override public void volumeUp() {
	  System.out.println("SamsungTV.... volume up");
	  
	  }
	  
	  @Override public void volumeDown() {
	  System.out.println("SamsungTV.... volume down");
	  
	  }
	 
	 
	
}