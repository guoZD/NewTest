package test;

public class TestThreadId {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread1:"+ThreadId.get(1));
                try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
                System.out.println("thread1:"+ThreadId.get(2));
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread2:"+ThreadId.get(3));
                try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
                System.out.println("thread2:"+ThreadId.get(4));
            }
        });
        thread1.start();
        thread2.start();
        try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread3:"+ThreadId.get(5));
                try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
                System.out.println("thread3:"+ThreadId.get(6));
            }
        });
        thread3.start();
	}

}
