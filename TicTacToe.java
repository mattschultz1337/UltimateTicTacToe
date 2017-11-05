
public class TicTacToe
{
    //INSTANCE FIELD
    private String[][] board0;
    private String[][] board1;
    private String[][] board2;
    private String[][] board3;
    private String[][] board4;
    private String[][] board5;
    private String[][] board6;
    private String[][] board7;
    private String[][] board8;
    //Constructor
    public TicTacToe(String[][] b, 
    String[][]b1, 
    String[][] b2,
    String[][] b3, 
    String[][]b4, 
    String[][] b5,
    String[][] b6, 
    String[][]b7, 
    String[][] b8)
    {
        board0 = b;
        board1 = b1;
        board2 = b2;
        board3=b3;
        board4=b4;
        board5=b5;
        board6=b6;
        board7=b7;
        board8=b8;
    }

    //Prints out the board
    public void printBoard()
    {

        System.out.print(board0[0][0] + " ");
        System.out.print(board0[0][1] + " ");
        System.out.print(board0[0][2] + "   ");
        System.out.print(board1[0][0] + " ");
        System.out.print(board1[0][1] + " ");
        System.out.print(board1[0][2] + "   ");
        System.out.print(board2[0][0] + " ");
        System.out.print(board2[0][1] + " ");
        System.out.print(board2[0][2] + "   ");
        System.out.println();
        System.out.print(board0[1][0] + " ");
        System.out.print(board0[1][1] + " ");
        System.out.print(board0[1][2] + "   ");
        System.out.print(board1[1][0] + " ");
        System.out.print(board1[1][1] + " ");
        System.out.print(board1[1][2] + "   ");
        System.out.print(board2[1][0] + " ");
        System.out.print(board2[1][1] + " ");
        System.out.print(board2[1][2] + "   ");
        System.out.println();
        System.out.print(board0[2][0] + " ");
        System.out.print(board0[2][1] + " ");
        System.out.print(board0[2][2] + "   ");
        System.out.print(board1[2][0] + " ");
        System.out.print(board1[2][1] + " ");
        System.out.print(board1[2][2] + "   ");
        System.out.print(board2[2][0] + " ");
        System.out.print(board2[2][1] + " ");
        System.out.print(board2[2][2] + "   ");
        System.out.println();
        System.out.println();
        System.out.print(board0[0][0] + " ");
        System.out.print(board3[0][1] + " ");
        System.out.print(board3[0][2] + "   ");
        System.out.print(board4[0][0] + " ");
        System.out.print(board4[0][1] + " ");
        System.out.print(board4[0][2] + "   ");
        System.out.print(board5[0][0] + " ");
        System.out.print(board5[0][1] + " ");
        System.out.print(board5[0][2] + "   ");
        System.out.println();
        System.out.print(board3[1][0] + " ");
        System.out.print(board3[1][1] + " ");
        System.out.print(board3[1][2] + "   ");
        System.out.print(board4[1][0] + " ");
        System.out.print(board4[1][1] + " ");
        System.out.print(board4[1][2] + "   ");
        System.out.print(board5[1][0] + " ");
        System.out.print(board5[1][1] + " ");
        System.out.print(board5[1][2] + "   ");
        System.out.println();
        System.out.print(board3[2][0] + " ");
        System.out.print(board3[2][1] + " ");
        System.out.print(board3[2][2] + "   ");
        System.out.print(board4[2][0] + " ");
        System.out.print(board4[2][1] + " ");
        System.out.print(board4[2][2] + "   ");
        System.out.print(board5[2][0] + " ");
        System.out.print(board5[2][1] + " ");
        System.out.print(board5[2][2] + "   ");
        System.out.println();
        System.out.println();
        System.out.print(board0[0][0] + " ");
        System.out.print(board6[0][1] + " ");
        System.out.print(board6[0][2] + "   ");
        System.out.print(board7[0][0] + " ");
        System.out.print(board7[0][1] + " ");
        System.out.print(board7[0][2] + "   ");
        System.out.print(board8[0][0] + " ");
        System.out.print(board8[0][1] + " ");
        System.out.print(board8[0][2] + "   ");
        System.out.println();
        System.out.print(board6[1][0] + " ");
        System.out.print(board6[1][1] + " ");
        System.out.print(board6[1][2] + "   ");
        System.out.print(board7[1][0] + " ");
        System.out.print(board7[1][1] + " ");
        System.out.print(board7[1][2] + "   ");
        System.out.print(board8[1][0] + " ");
        System.out.print(board8[1][1] + " ");
        System.out.print(board8[1][2] + "   ");
        System.out.println();
        System.out.print(board6[2][0] + " ");
        System.out.print(board6[2][1] + " ");
        System.out.print(board6[2][2] + "   ");
        System.out.print(board7[2][0] + " ");
        System.out.print(board7[2][1] + " ");
        System.out.print(board7[2][2] + "   ");
        System.out.print(board8[2][0] + " ");
        System.out.print(board8[2][1] + " ");
        System.out.print(board8[2][2] + "   ");
        System.out.println();
        System.out.println();
    }

    // Put down the player's number in specific spot
    // Return false if spot is taken, true otherwise
    // Example:  makeMove(2,1,0) puts a Player 2 in the coordinate(1,0)
    public boolean makeMove(int player, int r, int c, String[][] board)
    {
        if(r > 3 || c>3 || r<1 || c<1)
        {
            return false;
        }
        else 
        if(board[(r-1)][(c-1)].contains("-"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
	public boolean checkWonBoard(int r, int c)
	{
	    String[][] board = board0;
	    boolean ret = false;
		if(r==1 && c==1)
		{
			board=board0;  
		}
		else if(r==1 && c==2)
		{
			board=board1;  
		}
		else if(r==1 && c==3)
		{
			board=board2;  
		}
		else if(r==2 && c==1)
		{
			board=board3;  
		}
		else if(r==2 && c==2)
		{
			board=board4;  
		}
		else if(r==2 && c==3)
		{
			board=board5;  
		}
		else if(r==3 && c==1)
		{
			board=board6;  
		}
		else if(r==3 && c==2)
		{
			board=board7;  
		}
		else if(r==3 && c==3)
		{
			board=board8;  
		}
		if(checkWinner(board)!=0)
		{
			ret=false;	  
		}
		else 
		{
		  ret=true;
		}
		return ret;
	}
    public int changePlayer(int player)
    {
        if(player==1)
        {
            player=2;
        }
        else if(player==2)
        {
            player=1;
        }
        return player;
    }
    // Returns:     0 = no winner yet
    //              1 = player 1 wins
    //              2 = player 2 wins
    //              3 = Draw (no spaces left, no winner)
    public int checkWinner(String[][] board)
    {
        //USE checkRow, checkCol, and checkDiagonals here!
        int win=0;
        for(int i=0;i<board.length;i++)
        {
            if(checkRow(i,board)!=0)
            {
                win=checkRow(i,board); 
            }
            else if(checkCol(i,board)!=0)
            {
                win=checkCol(i,board);   

            }
            else if(checkDiagonals(board)!=0)
            {
                win=checkDiagonals(board);
            }
        }

        return win;
    }

    public int checkGameWinner()
    {
        int pl=0;
        for(int i=1;i<4;i++)
        {
            if(checkGameRow(i)!=0)
            {
                pl=checkGameRow(i);
            }
            else if(checkGameCol(i)!=0)
            {
                pl=checkGameCol(i);
            }
        }
		if(checkGameDiagonals()!=0)
		{
			pl=checkGameDiagonals();  
		}
        return pl; 
    }
	private int checkGameDiagonals()
	{
		int pl=0;
		if(checkWinner(board0)!=0 && checkWinner(board4)!=0 && checkWinner(board8)!=0)
		{
			if(checkWinner(board0)==checkWinner(board4) && checkWinner(board0)==checkWinner(board8))
			{
				pl=checkWinner(board0); 
			}
		}
		if(checkWinner(board2)!=0 && checkWinner(board4)!=0 && checkWinner(board6)!=0)
		{
			if(checkWinner(board2)==checkWinner(board4) && checkWinner(board2)==checkWinner(board6))
			{
				pl=checkWinner(board2); 
			}
		}
		return pl;
	}
    private int checkGameRow(int r)
    {
        int pl=0;
        if(r==1)
        {
            if(checkWinner(board0)!=0 && checkWinner(board1)!=0 && checkWinner(board2)!=0)
            {
                if(checkWinner(board0)==checkWinner(board1)&& checkWinner(board0)==checkWinner(board2))
                {
                    pl=checkWinner(board0);  
                }
            }	  
        } 
        if(r==2)
        {
            if(checkWinner(board3)!=0 && checkWinner(board4)!=0 && checkWinner(board5)!=0)
            {
                if(checkWinner(board3)==checkWinner(board4)&& checkWinner(board3)==checkWinner(board5))
                {
                    pl=checkWinner(board3);  
                }
            }
        }
        if(r==3)
        {	
            if(checkWinner(board6)!=0 && checkWinner(board7)!=0 && checkWinner(board8)!=0)
            {
                if(checkWinner(board6)==checkWinner(board7)&& checkWinner(board6)==checkWinner(board8))
                {
                    pl=checkWinner(board6);  
                }
            }
        }
        return pl;
    }

    private int checkGameCol(int c)
    {
        int pl=0;
        if(c==1)
        {
            if(checkWinner(board0)!=0 && checkWinner(board3)!=0 && checkWinner(board6)!=0)
            {
                if(checkWinner(board0)==checkWinner(board3)&& checkWinner(board0)==checkWinner(board6))
                {
                    pl=checkWinner(board0);  
                }
            }   
        }
        if(c==2)
        {
            if(checkWinner(board1)!=0 && checkWinner(board4)!=0 && checkWinner(board7)!=0)
            {
                if(checkWinner(board1)==checkWinner(board4)&& checkWinner(board1)==checkWinner(board7))
                {
                    pl=checkWinner(board1);  
                }
            }
        }
        if(c==3)
        {
            if(checkWinner(board2)!=0 && checkWinner(board5)!=0 && checkWinner(board8)!=0)
            {
                if(checkWinner(board2)==checkWinner(board5)&& checkWinner(board2)==checkWinner(board8))
                {
                    pl=checkWinner(board2);  
                }
            }
        }
        return pl;   
    }

    public static void clearScreen()
    {
        System.out.print('\u000c');
    }

    public static void timeWait(int x)
    {
        try
        {
            Thread.sleep(x) ;  
        }
        catch(Exception e)
        {}
    }
    // Returns:     0 = no winner yet
    //              1 = player 1 wins
    //              2 = player 2 wins
    // Input parameter r represents which # row to check
    private int checkRow(int r,String[][] board)
    {
        int x = 0;
        int pl=0;
        for(int i =0;i<board.length;i++)
        {
            if(board[r][i].contains(board[r][0]))
            {
                x++;   
            }
        }
        if(x==board.length)
        {
            if(board[r][0].contains("x"))
            {
                pl=1;
            }
            if(board[r][0].contains("o"))
            {
                pl=2;
            }
        }
        return pl;
    }

    // Returns:     0 = no winner yet
    //              1 = player 1 wins
    //              2 = player 2 wins
    // Input parameter c represents which # col to check
    private int checkCol(int c, String[][] board)
    {
        int x = 0;
        int pl=0;
        for(int i =0;i<board.length;i++)
        {
            if(board[i][c].contains(board[0][c]))
            {
                x++;   
            }
        }
        if(x==board.length)
        {
            if(board[0][c].contains("x"))
            {
                pl=1;
            }
            if(board[0][c].contains("o"))
            {
                pl=2;
            }
        }
        else
        {
            pl=0;
        }
        return pl;
    }

    // Returns:     0 = no winner yet
    //              1 = player 1 wins
    //              2 = player 2 wins
    // Will check both diagonals for a winner
    private int checkDiagonals(String[][] board)
    {
        int pl=0;

        if(board[0][0].contains(board[1][1]))
        {
            if(board[0][0].contains(board[board.length-1][board.length-1]))
            {

                if(board[0][0].contains("x"))
                {
                    pl=1;
                }
                if(board[0][0].contains("o"))
                {
                    pl=2;
                }
            }
            else
            {
                pl=0;
            }
        }
        else if(board[0][2].contains(board[1][1]))
        {
            if(board[0][2].contains(board[2][0]))
            {
                if(board[0][2].contains("x"))
                {
                    pl=1;
                }
                if(board[0][2].contains("o"))
                {
                    pl=2;
                } 
            }
        }
        return pl;

    }
	public String getBoard(String[][] b)
	{
	    String board="Middle";
	    if(b==board0)
	    {
	    	board="Top Left"; 
	    }
	    else if(b==board1)
	    {
	    	board="Top Middle";
	    }
	    else if(b==board2)
	    {
	    	board="Top Right";
	    }
	    else if(b==board3)
	    {
	    	board="Middle Left";
	    }
	    else if(b==board5)
	    {
	    	board="Middle Right";
	    }
	    else if(b==board6)
	    {
	    	board="Bottom Left";
	    }
	    else if(b==board7)
	    {
	    	board="Bottom Middle";
	    }
	    else if(b==board8)
	    {
	    	board="Bottom Right";
	    }
		return board;   
	}
    public String[][] changeBoard(int r, int c)
    {
        String[][]pl=board1;
        if(r==1&&c==1)
        {
            pl=board0;
        }
        else if(r==1&&c==2)
        {
            pl=board1;
        }
        else if(r==1&&c==3)
        {
            pl=board2;
        }
        else if(r==2&&c==1)
        {
            pl=board3;
        }
        else if(r==2&&c==2)
        {
            pl=board4;
        }
        else if(r==2&&c==3)
        {
            pl=board5;
        }
        else if(r==3&&c==1)
        {
            pl=board6;
        }
        else if(r==3&&c==2)
        {
            pl=board7;
        }
        else if(r==3&&c==3)
        {
            pl=board8;
        }
        else
        {
            System.err.println("Matt");
        }
        return pl;
    }
}//END CLASS