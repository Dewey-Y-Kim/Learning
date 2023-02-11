package Jv05Exception;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
       
        // 데이터 입력
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
       
        // 데이터 출력
        System.out.println("마지막에 넣은 데이터부터 출력..");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
       
        // 에러 발생
        //System.out.println(stack.pop());
       
        System.out.println("---------------");
       
        // 데이터 입력
        stack.push(5);
        stack.push(4);
        stack.push(3);
       
        System.out.println(stack.size());    // 사이즈 확인
        System.out.println(stack.peek());    // 데이터를 빼지 않고 현재 가장 위에 위치하는 데이터 확인
        System.out.println(stack.size());    // 사이즈 확인
       
    }
}

