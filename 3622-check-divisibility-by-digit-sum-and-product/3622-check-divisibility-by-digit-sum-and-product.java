class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum  = 0;
        int product = 1;
        while(temp > 0){
            int x = temp % 10;
            temp = temp / 10;
            sum += x;
            product *= x;
        }
        return (n % (sum + product)) == 0;        
    }
}