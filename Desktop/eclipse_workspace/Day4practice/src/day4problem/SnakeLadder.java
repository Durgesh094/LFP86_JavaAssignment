package day4problem;

import java.util.LinkedList;
import java.util.Queue;

public class SnakeLadder {
		static class firsttry
		{
			int ver;
			int dist;
		}
		
		static int getMinDiceThrows(int move[], int n)
		{
			int visited[] = new int[n];
	        Queue<firsttry> q = new LinkedList<>();
	        firsttry sc = new firsttry();
	        sc.ver = 0;
	        sc.dist = 0;
			
	        visited[0] = 1;
	        q.add(sc);
		       
	        while (!q.isEmpty())
	        {
	            sc = q.remove();
	            int ver = sc.ver;
	 
	            if (ver == n - 1)
	                break;
	 
	            for (int j = ver + 1; j <= (ver + 6) && j < n; ++j)
	            {
	                
	                if (visited[j] == 0)
	                {
	                    
	                    
	                    firsttry a = new firsttry();
	                    a.dist = (sc.dist + 1);
	                    visited[j] = 1;
	 
	                    if (move[j] != -1)
	                        a.ver = move[j];
	                    else
	                        a.ver = j;
	                    q.add(a);
	                }
	            }
	        }
	 
	 	        return sc.dist;
	    }
	 
		public static void main(String[] args) 
		{
		
	        int N = 30;
	        int moves[] = new int[N];
	        for (int i = 0; i < N; i++)
	            moves[i] = -1;
	 
	        // Ladders
	        moves[2] = 21;
	        moves[4] = 7;
	        moves[10] = 25;
	        moves[19] = 28;
	 
	        // Snakes
	        moves[26] = 0;
	        moves[20] = 8;
	        moves[16] = 3;
	        moves[18] = 6;
	 
	        System.out.println("Min Dice throws required is: " + getMinDiceThrows(moves, N));
	}

}
