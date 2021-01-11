import java.util.Arrays;

public class Calculator {
    public int sum(int a, int b){
        return a+b;
    }
    public int divide(int a, int b) throws IllegalArgumentException{
        if(b==0){
            throw new IllegalArgumentException("b cannot be 0");
        }
        return a/b;
    }

    public double divideDouble(int a, int b){
        return a/b;
    }

    public int[] sortAnArray(int [] arr){
        if(arr== null){
            throw new IllegalArgumentException("cant sort non initialized array");
        }
        if(arr.length==0 || arr.length==1){
            return arr;
        }
        Arrays.sort(arr);
        return arr;
    }
}
