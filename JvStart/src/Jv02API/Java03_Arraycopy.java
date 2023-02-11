package Jv02API;

public class Java03_Arraycopy {

	public static void main(String[] args) {
		/* 배열의 복사
		 * 배열은 생성이 되면 크기를 변경할 수 없다.
		 * 새로 배열을 생성하여 기존 배열의 정보를 복사하기. 
		*/
		
		//System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		
		int data[] = {503, 2384, 28, 22, 5993, 182, 18};
		int targetData[] = new int [20];
		//				 원본배열명 , 원본복사시작위치index,사본배열명, 사본배열시작위치index, 갯수
		System.arraycopy(data,2,targetData,3,4 );
		for (int i=0;i<targetData.length;i++) {
			System.out.print("targetData["+i+"] = "+targetData[i]+"\t");
			if ((i+1)%3 == 0) System.out.println();
		}
		
	}

}
