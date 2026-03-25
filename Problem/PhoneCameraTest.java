//Ashwani Chauhan (2400320100318)//
interface Phone {
    void makeCall();
    void sendSMS();
}
interface Camera {
    void takePhoto();
    void recordVideo();
}
class SmartPhone implements Phone, Camera {
    @Override
    public void makeCall() {
        System.out.println("SmartPhone: Making a voice call...");
    }
    @Override
    public void sendSMS() {
        System.out.println("SmartPhone: Sending a text message...");
    }
    @Override
    public void takePhoto() {
        System.out.println("SmartPhone: Capturing a high-res photo...");
    }
    @Override
    public void recordVideo() {
        System.out.println("SmartPhone: Recording 4K video...");
    }
}
public class PhoneCameraTest {
    public static void main(String[] args) {
        SmartPhone myPixel = new SmartPhone();
        System.out.println("--- Phone Features ---");
        myPixel.makeCall();
        myPixel.sendSMS();
        System.out.println("\n--- Camera Features ---");
        myPixel.takePhoto();
        myPixel.recordVideo();
    }
}