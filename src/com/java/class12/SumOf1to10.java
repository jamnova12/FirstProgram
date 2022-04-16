package com.java.class12;

public class SumOf1to10 {
    public static void main(String[] args) {

      /*  int result=0;
        for(int i=1; i<=10; i++){
                result = result + i;


            }

        System.out.println(result);
    }
}

 1*2*3*4*5
factorial
n!
fact(4) = 4*3*2*1
 */


        System.out.println(factorial(5));
    }
        public static int factorial(int n){
            if (n == 1) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }


        }

}