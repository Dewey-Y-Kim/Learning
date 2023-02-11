package Jv03Oop;
import java.util.Arrays;
import java.util.Scanner;

import Jv02API.String;

public class sorting {

	public static void main(String[] args) {
		//sorting 프로젝트
		sorting s = new sorting();
		s.start();
	}
	public int[] Ran() { //100이하 랜덤 4자
		int Arr[]=Ran(6);
		System.out.println("Ran()="+Arrays.toString(Arr));
		return Arr;
	}
	
	public int[] Ran(int num) { //100이하 중복 없는 랜덤 4자
		int[] arr = new int[num];
		for (int i=0; i<num; i++) {
			arr[i]= (int) (Math.random()*99+1);
			for (int j=0; j<i; j++) {
				if(arr[i]== arr[j]) { i--; break;}
			}
		}
		return (arr);
	}
	
	/* public int Rren() { //랜덤 재생
		int num= (int) (Math.random()*99+1);
		return num;
	} 
	*/

	public boolean SameNum(int arr[]) { //중복검사 중복 true
		for (int i = 0; i < arr.length; i++) {
			for( int j = 0 ; j< i ; j++) {
						if (arr[i] == arr[j]) {
						return true;
					}
				}
			}
		return false;
	}
	
	public int[] MaxMin(int arr[]) { // 최대 최소
		int ret[]=new int[2];
		int max=0;
		int min=200;
		for(int i=j; i<arr.length-j;i++) {
			if(arr[i] > max) {
				max=arr[i]; 
				ret[0] = i;
			}
			if(arr[i] < min) {
				min=arr[i];
				ret[1] = i;
			}
			System.out.println("Maxmin arr="+Arrays.toString(arr)+"  max="+max+"  min="+min+"  ret0="+ret[0]+"   ret[1]="+ret[1]);
		}
		return ret;
	}
	public int InputNum() { //난수 자리수 입
		Scanner sc= new Scanner(System.in);
		System.out.print("몇자리의 난수를 생성해 정렬할까요?");
		int arrLength= sc.nextInt();
		return arrLength;
	}
	public void start() {
		// int arrLength= InputNum();
		
		// int[] arr=Ran(arrLength);
		int[] arr=Ran();
		arr = alignArr(arr);
		System.out.println(Arrays.toString(arr));
	}
	public int[] arrayCopy(int[] arr,int p,int q) {
		int[] ret= new int[arr.length-2];
		
		if (p>q) {int temp=p;p=q;q=temp;}
		for(int i=0;i<p;i++) {
			ret[i]=arr[i];			
		}
		for(int i=p+1;i<q;i++) {
			ret[i]=arr[i];
		}
		for(int i=q+1;i<arr.length;i++) {
			ret[i]=arr[i];
		}
		return ret;
	}
	
	public int[] alignArr(int arr[]) { //배열 재 배치
	    int[] arrResult = new int[arr.length];
	    int[] maxmin=MaxMin(arr,0);
	    arrResult[0]= maxmin[0];
	    arrResult[arr.length-1]=maxmin[1];
	    for(int i=1;i<arr.length/2;i++) {
	      int[] arrayCopied= new int[arr.length-2*i];
	      arrayCopy(arrayCopied,maxmin[0],maxmin[1]);
	      
	      MaxMin(arrayCopied,i);
		  
		  
		  
	  	
	  }
	  return arrResult;
	}
}