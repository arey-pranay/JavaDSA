class Solution {
    public int maxProfit(int[] prices) {
        //pehle price pe hi khareed liya
        int bp = prices[0];
        //abhi tk profit 0 hai
        int currentP =0;
        for(int i=0;i<prices.length;i++){
            //agr mehnga hai, to dekho bechne pe puraane se zyada profit mil rha hai kya
            if(prices[i]>=bp){
                currentP = Math.max(currentP, prices[i]-bp);
            } else {
                //agr km price me mila, to khareed lo
                bp = prices[i];
            }
        }
        return currentP;
    }
}
