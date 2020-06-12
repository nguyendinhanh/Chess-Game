
public class Chess 
{
	public static void main(String[] args) 
	{
		int pawnRow = (int)(Math.random()*8);
		int pawnColumn = (int)(Math.random()*8);
		
		int queenRow = (int)(Math.random()*8);
		int queenColumn = (int)(Math.random()*8);
		
		while ( pawnRow == queenRow && pawnColumn == queenColumn)
		{
			queenRow = (int)(Math.random()*8);
		    queenColumn = (int)(Math.random()*8);
		}
		
		char [][] board = new char [8][8];
		
		for (int i = 0; i < 8 ; ++i)
			for (int j = 0; j < 8; ++j)
				board[i][j] = ' ';
		
		board[pawnRow][pawnColumn] = 'p';
		board[queenRow][queenColumn] = 'Q';
		
		for ( int row = 0; row < 8; ++row){
			for( int column = 0; column <8; ++column)
		
			System.out.print("----");
			System.out.println("-");
		System.out.println();
			for ( int column = 0; column <8; ++column)
				System.out.print("| " + board[row][column]+" ");
		System.out.println("|");
		
		}
			for(int column = 0; column<8 ; ++ column)
				System.out.print("----");
		
	
	if ( pawnRow == queenRow || pawnColumn == queenColumn)
		Math.abs(pawnRow - queenRow) == Math.abs(pawnColumn - queenColumn);
		System.out.println( "Danger");
	else 
		System.out.println(" Safe");
	}
}
