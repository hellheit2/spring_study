package polymorphism4;

public class TestSpeaker implements Speaker{

	public TestSpeaker() {
		System.out.println("TestSpeaker 객체 생성....");
	}
	
	public void volumeUp() {
		System.out.println("TestSpeaker.... volume up");
		
	}

	public void volumeDown() {
		System.out.println("TestSpeaker.... volume down");
		
	}

}
