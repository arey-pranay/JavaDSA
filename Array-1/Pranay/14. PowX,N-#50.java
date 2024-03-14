class Solution {
    public double myPow(double x, int n) {
        //for negetive powers, turn x ro 1/x and make n positive.
        if(n < 0){
            n = -n;
            x = 1 / x;
        }
        
        double pow = 1;
        //Binary Exponentiation
        while(n != 0){
            //check if the last digit (lsb) is 1, if it is then you multiply your answer with the current val of x.And the right shift to update the last digit of n.
            if((n & 1) != 0){
                //include that x^something in your answer
                pow *= x;
            } 
            //x becomes x2 then x4 then x8 then x16...    
            x *= x;
            //right shift n, to eliminate the old last digit and update it with the second last digit
            n=n>>2;
            
        }
        
        return pow;
    }
}
