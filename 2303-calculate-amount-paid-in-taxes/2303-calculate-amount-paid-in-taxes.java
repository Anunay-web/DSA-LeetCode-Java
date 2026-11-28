class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double totalTax = 0;
        int prev = 0;
        for (int i = 0; i < brackets.length; i++) {
            int upper = brackets[i][0];
            int tax = brackets[i][1];
            int taxableIncome = Math.min(income, upper) - prev;
            if (taxableIncome > 0) {
                totalTax += taxableIncome * (tax / 100.0);
            }
            prev = upper;
            if (income <= upper) {
                break;
            }
        }
        return totalTax;
    }
}