class ProductOfNumbers {
    ArrayList<Integer> ls;
    public ProductOfNumbers() {
        ls = new ArrayList<>();
    }
    
    public void add(int num) {
        ls.add(num);
    }
    
    public int getProduct(int k) {
        int product = 1;
        for(int i = ls.size() - 1; i >= 0; i--){
            if(k == 0) break;
            product *= ls.get(i);
            k--;
        }
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */