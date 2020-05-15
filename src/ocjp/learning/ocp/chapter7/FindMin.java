package ocjp.learning.ocp.chapter7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class FindMin extends MyTask {

	private Integer[] elements;

	private int a;

	private int b;

	public FindMin(Integer[] elements, int a, int b) {
		this.elements = elements;
		this.a = a;
		this.b = b;
	}

	protected Integer compute() {
		if ((b - a) < 2)
			return Math.min(elements[a], elements[b]);
		else {
			int m = a + ((b - a) / 2);
			System.out.println(a + "," + m + "," + b);
			MyTask t1 = new FindMin(elements, a, m);
			int result = t1.fork().join();
			return Math.min(new FindMin(elements, m, b).compute(), result);
		}
	}

	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		Integer[] elements = new Integer[] { 8, -3, 2, -54, -100, 70, 15 };
		MyTask task = new FindMin(elements, 0, elements.length - 1);
		ForkJoinPool pool = new ForkJoinPool(1);
		Integer sum = pool.invoke(task);
		System.out.println("Min: " + sum);
	}
}
