package learn.singleton;

public class TestMain {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                TestSingletonEnum.getInstance();
            }).start();
        }
    }
}
