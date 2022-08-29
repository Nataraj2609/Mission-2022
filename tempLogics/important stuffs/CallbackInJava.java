package important_stuffs;

interface CallbackInterface {
    void callbackCalled();
}
public class CallbackInJava {
    public void callMethod(CallbackInterface callbackInterface){
        System.out.print("Hello ");
        callbackInterface.callbackCalled();
    }

    public static void main(String[] args) {
        CallbackInJava c = new CallbackInJava();
        CallbackInterface callbackInterface = () -> System.out.println("World!");
        c.callMethod(callbackInterface);
    }
}
