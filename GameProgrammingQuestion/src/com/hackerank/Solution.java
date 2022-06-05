package com.hackerank;

import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        if(isSolvable(leap,game,0))
        {
        	return true;
        }
        return false;
    }

    private static boolean isSolvable(int leap, int[] game, int i) {
    	if(i+leap>=game.length ||i>=game.length-1) 
    		return true;
    	    game[i]=1;
    	if(isValid(game,i+1))
    	{
    		int a=i+1;
    		 if(isSolvable(leap,game,a))
    			 return true;
    	}
    	else if(isValid(game,i+leap))
    	{
    		int a=i+leap;
    		if(isSolvable(leap,game,a))
    			return true;
    	}
    	else if(isValid(game,i-1))
    	{
    		int a=i-1;
    		if(isSolvable(leap,game,a))
    		{
    			return true;
    		}
    	}
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean isValid(int[] game, int i) {
		// TODO Auto-generated method stub
		if(i<0||game[i]==1)
			return false;
		return true;
	}

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}



