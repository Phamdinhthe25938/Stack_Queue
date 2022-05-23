package DaoNguocPhanTu;

import java.lang.reflect.Array;
import java.util.*;

public abstract class reverseArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int array[] ={1,6,2,8,3,9,12,15};
        for(int i=array.length-1;i>=0;i--){
            stack.push(array[i]);
        }
        stack.add(1,4);
        System.out.print("Array stack :");
        for(Integer i:stack){
            System.out.print(i+" ");
        }
        //        StringTokenizer stringTokenizer = new StringTokenizer(string);
////        while (stringTokenizer.hasMoreTokens()){
//            System.out.println(stringTokenizer.nextToken());
//        }
        System.out.println("");
        Stack<String> stackStr = new Stack<>();
        String string = "hello cac ban";
        String [] result= string.split(" ");
        System.out.println("Mang :"+Arrays.toString(result));
        for(int i=result.length-1;i>=0;i--){
            stackStr.push(result[i]);
        }
        System.out.println("Array stackStr:");
        for(int i=0;i<stackStr.size();i++){
            System.out.println(stackStr.get(i));
        }
}
}
