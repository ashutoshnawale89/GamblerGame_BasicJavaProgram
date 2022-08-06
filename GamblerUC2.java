package com.GamblerProgram_7thDay;

public class GamblerUC2 {
	public void gamble() {
		int gambleAmt=100;
		double bet=Math.random();
		if (bet >= 0.50) {           //  for above 50% it will get the bet is Win
			gambleAmt=gambleAmt+1;
			System.out.println("The Bet is Win & Total Amount is  "+gambleAmt);
		}
		else  {                    //  for below 50% it will get the bet is loose
			gambleAmt=gambleAmt-1;
			System.out.println("The Bet is loose & Total Amount is  "+gambleAmt);	
		}		
		}
	public static void main(String [] args) {
		GamblerUC2 bet_Obj=new GamblerUC2();
		bet_Obj.gamble();		
	}
}
