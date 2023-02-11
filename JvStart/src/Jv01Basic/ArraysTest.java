package Jv01Basic;
import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {

	public static void main(String[] args) {
		// Arrays클래스를 이용한 배열처리
		//             0  1  2 3  4   5  6
		int data[]  = {23,86,7,47,862,90,2};
		
		// copyOf(배열명, 갯수) : index 0부터 원하는 수만큼 복사
		int copy1[] = Arrays.copyOf(data, 4);
		java.lang.String copy1Str = Arrays.toString(copy1); // copy1배열의 값을 [43,54,32,4]
		System.out.println("copy1->"+ copy1Str);
		
		// copyOfRange(배열명,시작index,끝index+1) : 원하는 위치의 배열값을 복사
		int copy2[] = Arrays.copyOfRange(data, 2, 6);
		System.out.println("copy2->"+ Arrays.toString(copy2));
		
		
		//sort() : 배열의 값을 오름차순으로 전체 정렬을하고 원래 배열의 값 순서를 변경하므로 이전 상태로 되돌리수 없다.
		System.out.println("정렬전->"+ Arrays.toString(data));
		Arrays.sort(data);		
		System.out.println("정렬후->"+ Arrays.toString(data));
		
		java.lang.String color[] = {"orange","red","blue","yellow","green","pink"};
		Arrays.sort(color);
		System.out.println("color_sort->"+ Arrays.toString(color));
		
		// 문자배열의 값을 Descending으로 정렬
		Arrays.sort(color, Collections.reverseOrder());
		System.out.println("color(Descending)->"+ Arrays.toString(color));
		
		System.out.println(data);
	}

}
