package important_stuffs;

public class AsyncCallbackInJava {
    public void downloadSong() {

        CallBack callBackInterface = new ListenerClass();

        new Thread(new Runnable() {
            public void run() {
                for (int i = 10; i < 101; i = i + 10) {
                    System.out.println("File Downloaded " + i + "%");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (i == 100)
                        callBackInterface.CallBackMethod();
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        AsyncCallbackInJava asyncCallbackInJava = new AsyncCallbackInJava();
        asyncCallbackInJava.downloadSong();
    }
}

interface CallBack {
    void CallBackMethod();
}

class ListenerClass implements CallBack {
    @Override
    public void CallBackMethod() {
        System.out.println("File Downloaded Successfully!");
    }
}