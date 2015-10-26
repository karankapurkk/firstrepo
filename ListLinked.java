import java.util.LinkedList;

public class ListLinked {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for (int i = 0; i < 1000; i++)
		{
		   ll.add(i);
		   System.out.print(ll.get(i) +" ");
		}
		long endTime=System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println();
		System.out.println(totalTime);
	}

}