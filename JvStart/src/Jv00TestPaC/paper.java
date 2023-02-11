package Jv00TestPaC;
import java.util.Arrays;
import java.util.Scanner;

public class paper {

	public paper() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//  로또 번호 생성기 1~45 , 6+1 게임수 입력받기 반복확인
        Scanner sc = new Scanner(System.in);
        int ans=1;      
        while (ans==1) {
            System.out.print("게임수 = ");
            int many = sc.nextInt();
                for(int game=1; game<=many; game++) {
                int arr[] = new int[7];
                
                for (int i=0; i<arr.length; i++){
                    boolean diff;
                    do {
                        diff=false;
                        arr[i]=(int)(Math.random()*45+1);
                        for(int j=0;j<i;j++) {
                            if(arr[j]==arr[i]) diff=true;
                        }
                    } while (diff);     //중복 검사 및 제거
                } // 번호생성
                Arrays.sort(arr,0,6); //정렬
                
                System.out.print(game+"게임  [ "+arr[0]);
                for(int j=1;j<arr.length-1;j++) System.out.print("], ["+arr[j]);
                System.out.println("],  bonus="+arr[6]); //출
            }
            System.out.print("계속 할까요? (1: 예  2: 아니요");
            ans=sc.nextInt();
            while(ans !=1 && ans !=2) {
                System.out.print("다시 입력해 주세요");
                ans=sc.nextInt();
            } //재
        }
    System.out.println("이용해 주셔서 감사합니다.");
    }
	

}
