package interviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by pourush.sinha on 27/08/19.
 */
public class StackInterviewQuestions {


    public  static void  nearestMaxNumber(int[] arr){

      Map<Character,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);

        for(int i=1 ;i<arr.length ;i++){
            if(stack.peek() > arr[i]){
                stack.push(arr[i]);
            }else{
                while(!stack.isEmpty()){
                    System.out.print(arr[i]+" ");
                    stack.pop();
                    if(stack.peek()> arr[i] ) {
                        stack.push(arr[i]);
                        break;
                    }



                }
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }

    }

    public static void main(String[] args) {
        int[] arr ={4, 5, 2, 25};
        nearestMaxNumber(arr);
    }
}
