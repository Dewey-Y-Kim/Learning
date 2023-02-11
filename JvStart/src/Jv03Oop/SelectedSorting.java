package Jv03Oop;
import java.util.Scanner;

public class SelectedSorting {

	public SelectedSorting(){
		
	}
	int arrlength;
	// 난수 생성
	public int ran() {
		return (int)(Math.random()*99+1);
		
	}
	public int[] play(int[] num) {
		
		for(int i=0;i<=num.length/2-1;i++) {
		int max=i;
		int min=i;
		int temp;
		for(int j =i;j<=num.length-i-1;j++) {
			if(num[j]>num[max]) {
				 max = j;
				}
			if(num[j]<num[min]) {
				min = j;
				}
		}
		//index max를 i번째와, index min을 끝에서 i번째와 교체 겹치면 교체 안하도
		if(min!=i) { // max = length-i-1 min =i 인경우 한번만 교체하도록 
		temp=num[i];
		num[i]=num[max];
		num[max]=temp;
		}
		temp=num[num.length-1-i];
		
		num[num.length-1-i]=num[min];
		num[min]=temp;

		}
		return num;
	}
	 
	// 실행부
	public void start(){
	Scanner sc = new Scanner(System.in);
	System.out.print("몇 자리의 난수 배열을 만들까요?");
	String firstq= sc.next();
	int arrlength= Integer.parseInt(firstq);
	int[] arr = new int[arrlength];
	for(int i=0;i<arrlength;i++) {
		arr[i]=ran();
	}
	System.out.println("정렬전 배열");
	printnum(arr);
	arr=play(arr);
	System.out.println("정렬 후 난수");
	printnum(arr);
	
	}
	
	// 출력부
	public void printnum(int[] number) {
		for(int i = 0 ; i <number.length;i++) {
			System.out.printf("%4d\t", number[i]);
			if((i+1)%10 == 0) {System.out.println();}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		//sorting 프로젝트
		SelectedSorting sorting = new SelectedSorting();
		sorting.start();
		
		
	}

}