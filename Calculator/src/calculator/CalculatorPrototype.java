package calculator;

import static java.lang.Math.abs;

public class CalculatorPrototype implements CalculatorIF {

    /* Performs n increments (+1) to the value of m and return the result
     * Both m and n can be positive or negative */
    @Override
    public int sum(int m, int n) {
        int result = m;
        int s= (n >= 0 ? 1 : -1);

        while (n != 0) {
            result += s;
            n -= s;
        }

        return result;
    }



    /* Performs n decrements (-1) to he value of m and return the result
     * Both m and n can be positive or negative */
    @Override
    public int subtract(int m, int n) {
        int result= m;
        int s= (n >=0 ? 1 : -1);

        while (n!=0) {
            result -= s;
            n -= s;
        }

        return result;
    }



    /* Sums the value of m for n times and then return the result */
    @Override
    public int multiply(int m, int n) {
        int result=0;
        int s= (n >= 0 ? 1 : -1);

        while (n!=0) {
            result += abs(m);
            n -= s;
        }

        return result;
    }



    /* Subtract n from m until it gets to 0 and return the result */
    @Override
    public int divide(int m, int n) {
        int result = 0;
        int m1= abs(m), n1= abs(n), sm= (m>=0 ? 1 : -1), sn= (n>=0 ? 1 : -1);

        if (n==0)
            throw new ArithmeticException();

        while(m1 > 0) {
            m1 -= n1;
            result++;
        }
        if (m1!=0){
            result-= 1;
        }

        if (sm != sn)
            result = -result;

        return result;
    }
}
