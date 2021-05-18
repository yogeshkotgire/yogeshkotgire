package arraydiscussion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayWithEqualKey {
	public static void main(String[] args) {
		int a[]= {10,12,24};
		int b[]= {14,25,36};
		int c[]= {10,12,24};
		boolean bb =Arrays.equals(a, b);
		System.out.println("bb is :"+bb);
		boolean bbc =Arrays.equals(a, c);
		System.out.println("bb is :"+bbc);
	}

}
