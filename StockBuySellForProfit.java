package coreJavaPrograms;

public class StockBuySellForProfit {

	public static void main(String[] args) {
//The cost of a stock on each day is given in an array, find the max profit that you can make by buying and selling in those days. For example, 
//if the given array is {100, 180, 260, 310, 40, 535, 695}, the maximum profit can earned by buying on day 0, selling on day 3. Again buy on day 4 and sell on day 6. If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.
//maxProfit  = 310 - 100 = 210 and 695 - 40 = 655 ==> 210+655 = 865.
				
int stocks[] = {100, 180, 260, 310, 
                     40, 535, 695};

int maxProfit=0; String buy="", sell="";boolean flag = false;
for(int i=1;i<stocks.length;i++) {
	if(stocks[i] > stocks[i-1] && i!=stocks.length-1) {
		if(!flag) {
			buy = buy + (i-1);
			flag = true;
		}
	}else {
		if(i==stocks.length-1)
		     sell = sell+ i;
		else
			sell = sell+ (i-1);
		flag = false;
	}
}

for(int i=0;i<buy.length();i++) {
	maxProfit = maxProfit + stocks[Integer.parseInt(String.valueOf(sell.charAt(i)))] - stocks[Integer.parseInt(String.valueOf(buy.charAt(i)))];
}

System.out.println("To Record Profit Booking: ");
for(int i=0;i<buy.length();i++)
	System.out.println("Buying on: " +buy.charAt(i) + " \t Selling on: "+ sell.charAt(i));
   
	System.out.println("Maximum Profit Booked is : " + maxProfit);
	
	}
}