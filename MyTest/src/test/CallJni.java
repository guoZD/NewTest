package test;
public class CallJni {
    static
    {
    System.loadLibrary("CallJni");
    System.out.println("Dll Loaded");
    }
    public native static void doSomeThing();
}