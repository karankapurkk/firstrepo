import java.util.ArrayList;
import java.util.Scanner;

public class ListArray100{
	private static Scanner s;

public static void main(String args[]){
	s = new Scanner(System.in);
	System.out.println("Number of elements in this ArrayList");
	int n = s.nextInt();
	long startTime = System.currentTimeMillis();
	ArrayList<Integer> al = new ArrayList<Integer>(n+1);
	for (int i = 0; i <= n; i++){
		   al.add(i);
		   System.out.print(al.get(i)+" ");
		}
		long endTime=System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println();
		System.out.println(totalTime);
//		al.remove(100);
//		System.out.println();
//		for (int i = 0; i < n; i++)
//		{
//		   System.out.print(al.get(i)+ " ");
//		}

	}
}

