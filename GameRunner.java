import cs1.*;
public class GameRunner
{
    public static void main(String[] args)
    {
        System.out.print("(1/2) Player Game? : ");
        int choice=Keyboard.readInt();
        String[][] board0 =     
                {{"-","-","-"},
                {"-","-","-"},
                {"-","-","-"} };
        String[][] board1 =
                {{"-","-","-"},
                {"-","-","-"},
                {"-","-","-"} };
        String[][] board2 =  
                {{"-","-","-"},
                {"-","-","-"},
                {"-","-","-"} };
        String[][] board3 =     
                {{"-","-","-"},
                {"-","-","-"},
                {"-","-","-"} };
        String[][] board4 =     
                {{"-","-","-"},
                {"-","-","-"},
                {"-","-","-"} };        				
        String[][] board5 =    
                {{"-","-","-"},
                {"-","-","-"},
                {"-","-","-"} };
        String[][] board6 =     
                {{"-","-","-"},
                {"-","-","-"},
                {"-","-","-"} };
        String[][] board7 =    
                {{"-","-","-"},
                {"-","-","-"},
                {"-","-","-"} };
        String[][] board8 =     
                {{"-","-","-"},
                {"-","-","-"},
                {"-","-","-"} };
        String[][] currentboard=board4;
        int player = 1;
        String[][]lastboard=board4;
        int newboard=0;
        int row=2;
        int col=2;
        String playersym = "";
        TicTacToe ttt = new TicTacToe(board0, board1, board2,board3,board4,board5,board6,board7,board8);
        if(choice==2)
        {
            while(ttt.checkGameWinner()==0)
            {
                if(player==1)
                {
                    playersym="x";
                }
                else if(player==2)
                {
                    playersym="o";
                }
                TicTacToe.clearScreen();
                ttt.printBoard();
                if(ttt.checkWinner(currentboard)!=0)
                {
                    System.out.println(ttt.getBoard(currentboard) + "is currently won, player " + player + " may choose any free board (same number system as board)");
                    System.out.println();
                    System.out.print("Input board row : ");
                    int boardrow = Keyboard.readInt();
                    System.out.print("Input board column : ");
                    int boardcol = Keyboard.readInt();
                    boolean boardornah = ttt.checkWonBoard(boardrow,boardcol);
                    if(boardornah==true)
                    {
                        currentboard=ttt.changeBoard(boardrow,boardcol);
                    }
                    else
                    {
                        System.err.print("Invalid Board");
                    }
                }
                else
                {
                    System.out.println("Current board : " +  ttt.getBoard(currentboard));
                    System.out.println();
                    System.out.println("Last move : Player" + ttt.changePlayer(player) + " : " +  ttt.getBoard(lastboard) + " : " + row + " : " + col);
                    System.out.println();
                    System.out.print("Player " + player + ", enter row : ");
                    row = Keyboard.readInt();
                    System.out.print("Player " + player + ", enter column : ");
                    col = Keyboard.readInt();
                    if(ttt.makeMove(player,row,col,currentboard)==false)
                    {
                        System.err.print("Unavailible Spot, try again!");
                        TicTacToe.timeWait(1000);
                    }
                    else if(ttt.makeMove(player,row,col,currentboard)==true)
                    {
                        currentboard[(row-1)][(col-1)] = playersym;
                        lastboard=currentboard;
                        currentboard=ttt.changeBoard(row,col);
                        player = ttt.changePlayer(player);

                    }
                    else
                    {
                        System.err.print("Unavailible Spot, try again!");
                        TicTacToe.timeWait(1000);
                    }
                }
            }
        }
        else if(choice==1)
        {
        	while(ttt.checkGameWinner()==0)
            {
                if(player==1)
                {
                    playersym="x";
                }
                else if(player==2)
                {
                    playersym="o";
                }
                TicTacToe.clearScreen();
                ttt.printBoard();
                if(ttt.checkWinner(currentboard)!=0 && player==1)
                {
                    System.out.println(ttt.getBoard(currentboard) + "is currently won, player " + player + " may choose any free board (same number system as board)");
                    System.out.println();
                    System.out.print("Input board row : ");
                    int boardrow = Keyboard.readInt();
                    System.out.print("Input board column : ");
                    int boardcol = Keyboard.readInt();
                    boolean boardornah = ttt.checkWonBoard(boardrow,boardcol);
                    if(boardornah==true)
                    {
                        currentboard=ttt.changeBoard(boardrow,boardcol);
                    }
                    else
                    {
                        System.err.print("Invalid Board");
                    }
                }
                else if(ttt.checkWinner(currentboard)==0 && player==1)
                {
                    System.out.println("Current board : " +  ttt.getBoard(currentboard));
                    System.out.println();
                    System.out.println("Last move : Player" + ttt.changePlayer(player) + " : " +  ttt.getBoard(lastboard) + " : " + row + " : " + col);
                    System.out.println();
                    System.out.print("Player " + player + ", enter row : ");
                    row = Keyboard.readInt();
                    System.out.print("Player " + player + ", enter column : ");
                    col = Keyboard.readInt();
                    if(ttt.makeMove(player,row,col,currentboard)==false)
                    {
                        System.err.print("Unavailible Spot, try again!");
                        TicTacToe.timeWait(1000);
                    }
                    else if(ttt.makeMove(player,row,col,currentboard)==true)
                    {
                        currentboard[(row-1)][(col-1)] = playersym;
                        lastboard=currentboard;
                        currentboard=ttt.changeBoard(row,col);
                        player = ttt.changePlayer(player);

                    }
                    else
                    {
                        System.err.print("Unavailible Spot, try again!");
                        TicTacToe.timeWait(1000);
                    }
                }
                else if(player==2)
                {
                    row = Keyboard.readInt();
                    col = Keyboard.readInt();
                }
            }
        }
        TicTacToe.clearScreen();
        ttt.printBoard();

        System.out.println("Player " + ttt.changePlayer(player) + " has won!");
    }//END MAIN

}//END CLASS
