class StockSpanner {
    int N = 10000;
    int cur, tt;
    int[] stk, stock;

    public StockSpanner() {
        cur = 0;
        tt = -1;
        stk = new int[N];
        stock = new int[N];
    }
    
    public int next(int price) {
        while(tt >= 0 && price >= stock[stk[tt]]) {
            tt--;
        }
        int res = tt < 0 ? cur + 1 : cur - stk[tt];
        stk[++tt] = cur;
        stock[cur++] = price;
        return res;
    }
}
