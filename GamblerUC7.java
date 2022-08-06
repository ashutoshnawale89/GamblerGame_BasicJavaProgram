package com.GamblerProgram_7thDay;

import java.util.Arrays;

public class GamblerUC7 {
	public void gamble(int num) {
		while (num >= 1)  {   //  This Loop is For continue to next month or not
        int array[]=new int[20];  //  Store the value of the current month
        int i=0;
		int days=20;
		while(days >= 1) {      //    this loop is to try 20 days gambling
			days--; 
			int gambleAmt=100;
			int winingAmt=0;  int looseAmt=0;
			while(winingAmt <= 50 && looseAmt >= -50)  {   //  for 50% amount will loose or win
				double bet=Math.random();
				if (bet >= 0.50) {                  //  for above 50% it will get the bet is Win
					gambleAmt=gambleAmt+1;
					winingAmt=winingAmt+1;
				}
				else  {                     //  for below 50% it will get the bet is loose
					gambleAmt=gambleAmt-1;
					looseAmt=looseAmt-1;
				}
			}
			array[i]=gambleAmt;
			i++;
//			System.out.println("The Bet is loose & win in the Days is "+looseAmt+" & "+winingAmt+" Respectively");
//			System.out.println("The Bet of day the & Total Amount is  "+gambleAmt);
		}
		Arrays. sort(array);
		System.out.println("The Highest Bet Loose in The Month  & Unlucku day loose Amount is  " +array[0]);
				System.out.println("The Highest Bet Win in The Month & lucku day profit Amount is   is  "+array[19]);
				num--;
		}
		}
	public static void main(String [] args) {
		GamblerUC7 bet_Obj=new GamblerUC7();
	//  pass the  for argument to continue how many months in person
	//  put the value in month how many month it will played the BET
		bet_Obj.gamble(2);  
		
		
	}
}



