package java8.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Streams1 
{
public static void main(String[] args) 
{
	int[] array= {1,2,3,4,5};
	long[] intst=LongStream.range(0,5).toArray();
	for (long i : intst) {
//		System.out.println(i);
	}
	System.out.println(Arrays.stream(intst).sum()/Arrays.stream(intst).count());
}
}
