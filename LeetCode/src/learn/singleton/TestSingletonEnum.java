package learn.singleton;

public class TestSingletonEnum {

    private enum Instance {
        SINGLETON(new TestSingletonEnum());

        private TestSingletonEnum testSingletonEnum;

        Instance(TestSingletonEnum testSingletonEnum) {
            this.testSingletonEnum = testSingletonEnum;
        }

        public TestSingletonEnum getTestSingletonEnum() {
            return testSingletonEnum;
        }
    }

    public static TestSingletonEnum getInstance() {
        return Instance.SINGLETON.getTestSingletonEnum();
    }


    private TestSingletonEnum() {
        System.out.println("实例化了。。。");
    }
}
