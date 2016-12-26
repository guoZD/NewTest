package test;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadId {
	// Atomic integer containing the next thread ID to be assigned
//	private static final AtomicInteger nextId = new AtomicInteger(0);
	private static int s = 1;
	// Thread local variable containing each thread's ID
	private static ThreadLocal<Integer> threadId = new ThreadLocal<Integer>();
//	private static  int threadId  = -1;

	// Returns the current thread's unique ID, assigning it if necessary
	public static int get(int i) {
		/*int sd = threadId;
		threadId=i;
		return sd;*/
		int sd = threadId.get()==null?-1:threadId.get();
		threadId.set(i);
		return sd;
	}
}
