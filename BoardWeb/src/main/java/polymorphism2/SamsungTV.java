package polymorphism2;

/*
 * public class SamsungTV { public void powerOn() {
 * System.out.println("SamsungTV.... power on"); } public void powerOff() {
 * System.out.println("SamsungTV.... power off"); } public void volumeUp() {
 * System.out.println("SamsungTV.... volume up"); } public void volumeDown() {
 * System.out.println("SamsungTV.... volume down"); } }
 */


public class SamsungTV implements TV{
	
	
	private SonySpeaker speaker;
	public SamsungTV() { 
		System.out.println("===> SamsungTV(1) 객체 생성"); 
	}
	
	public SamsungTV(SonySpeaker speaker) { 
		System.out.println("===> SamsungTV(2) 객체 생성");
		this.speaker=speaker;
	}
	  
	  @Override public void powerOn() {
		  System.out.println("SamsungTV.... power on");
	  
	  }
	  
	  @Override public void powerOff() {
		  System.out.println("SamsungTV.... power off");
	  
	  }
	  
	  @Override public void volumeUp() {
		  //speaker = new SonySpeaker(); //SamsungTV(SonySpeaker speaker) 만들기 전
		  speaker.volumeUp();
	  
	  }
	  
	  @Override public void volumeDown() {
		  //speaker = new SonySpeaker();
		  speaker.volumeDown();
	  
	  }
	
}