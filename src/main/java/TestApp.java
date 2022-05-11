public class TestApp {
    public static void main(String[] args) {
        TestMethods test = new TestMethods();
        TestHandler.start(test.getClass());
    }
}
