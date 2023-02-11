package Jv08Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Jv08_ObjectCompareMain {
	List<Jv08_ProductDTO> list=new ArrayList<Jv08_ProductDTO>();
	public Jv08_ObjectCompareMain() {
		// TODO Auto-generated constructor stub
	
		list.add(new Jv08_ProductDTO(1211103 , "마크제이콥스" , 400000, 3));
		list.add(new Jv08_ProductDTO(1120321 , "레이벤" , 120000, 4));
		list.add(new Jv08_ProductDTO(1110423 , "폴포츠" , 60000, 21));
		list.add(new Jv08_ProductDTO(1020613 , "샤인" , 120000, 5));
		list.add(new Jv08_ProductDTO(1090812 , "수메르" , 80000, 19));
		list.add(new Jv08_ProductDTO(1230102 , "선디스" , 200000, 30));
		list.add(new Jv08_ProductDTO(1040623 , "샤넬" , 59999, 12));
		printProduct("정렬전");
		
	
	
	//문자기준(상품명) 오름차순 정렬
	// 				정렬 대상, 정렬 기준
	//오름차순
		Collections.sort(list, new CompareProductNameA());
	printProduct("문자기준오름차순");
	
	//내림차순
	Collections.sort(list, new CompareProductNameDE());
	printProduct("문자기준 내림차순");
	
	
	//숫자 -가격
	Collections.sort(list, new ComparePriceA());
	printProduct("숫자기준 오름차순");
	
	
	Collections.sort(list, new ComparePricede());
	printProduct("숫자기준 내림차순");
	
	
	
	
	}
	public void printProduct(String textline) {
		System.out.println("==================="+textline+"===================");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jv08_ObjectCompareMain();
	}
	
	
	class CompareProductNameA implements Comparator<Jv08_ProductDTO> {
		
		@Override
		public int compare(Jv08_ProductDTO dto1, Jv08_ProductDTO dto2) {
			// 반환값이 - 인경우에는 교환 x, +인 경우 dto1의 상품명이 크므로 교환
			return dto1.getProductname().compareTo(dto2.getProductname());
		}
		
	}
	class CompareProductNameDE implements Comparator<Jv08_ProductDTO> {
		
		@Override
		public int compare(Jv08_ProductDTO dto1, Jv08_ProductDTO dto2) {
			// 반환값이 - 인경우에는 교환 x, +인 경우 dto1의 상품명이 크므로 교환
			return dto2.getProductname().compareTo(dto1.getProductname());
		}
		
	}
	
	class ComparePriceA implements Comparator<Jv08_ProductDTO>{
		public int compare(Jv08_ProductDTO dto1, Jv08_ProductDTO dto2) {
			// 반환값이 - 인경우에는 교환 x, +인 경우 dto1의 상품명이 크므로 교환
			// return dto1.getPrice()-dto2.getPrice();
			return ((dto1.getPrice()<dto2.getPrice())? -1: (dto1.getPrice()==dto2.getPrice())? 0 : 1);
		}
	}
	
	class ComparePricede implements Comparator<Jv08_ProductDTO>{
		public int compare(Jv08_ProductDTO dto2, Jv08_ProductDTO dto1) {
			// 반환값이 - 인경우에는 교환 x, +인 경우 dto1의 상품명이 크므로 교환
			// return dto1.getPrice()-dto2.getPrice();
			return ((dto1.getPrice()<dto2.getPrice())? -1: (dto1.getPrice()==dto2.getPrice())? 0 : 1);
		}
	}
}


	

