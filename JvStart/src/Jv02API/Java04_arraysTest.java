package Jv02API;
import java.util.Arrays;
import java.util.Collections;
import java.lang.*;

public class Java04_arraysTest {

	public static void main(String[] args) {
		// Arrays를 이용한 배열 처리
		//      	   0  1 2    3   4    5      6      7    8 
		int data[] = { 1, 3,41, 12, 242, 12414, 12412, 1231,12};
		int result1[] = Arrays.copyOf(data, 5);
		java.lang.String result1str = Arrays.toString(result1);
		System.out.println("result1= "+result1str);
		
		// copyOfRange() : 원하는위치의 배열값을 복사
		int result2[] = Arrays.copyOfRange(data, 2, 8);
		System.out.println("result2= "+Arrays.toString(result2));
		int dataCopied[]= Arrays.copyOf(data, data.length);
		System.out.println(Arrays.toString(dataCopied));
		//sort 배열 값을 오름차순으로 정렬, 원래 값이 변경되므로 되돌릴 수 없다.
		Arrays.sort(dataCopied);
		System.out.println(Arrays.toString(dataCopied));
		java.lang.String[] color = {"orange", "blue", "skyblue", "yellow", "Zelda","zard"};
		System.out.println("! sort : "+Arrays.toString(color));
		Arrays.sort(color);
		System.out.println("sorted : "+Arrays.toString(color));
		
		//배열의 값을 decending으로 정렬
		Arrays.sort(color, Collections.reverseOrder());
		
		System.out.println("Decending : "+Arrays.toString(color));
		
		
	}
}
