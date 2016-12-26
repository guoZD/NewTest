package test;
public class TestJin {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TestJin testObj = new TestJin();
        testObj.work();
    }
    public void work() {
        CallJni.doSomeThing();
    }
}