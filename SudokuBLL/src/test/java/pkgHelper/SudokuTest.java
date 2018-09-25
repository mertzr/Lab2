package pkgHelper;

import pkgHelper.LatinSquare;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import pkgGame.Sudoku;

public class SudokuTest {
	
	{
	private int testArr[][]= {{1,2,3,4},{2,3,4,1},{3,4,2,1},{4,1,2,3}};
	private int expectedArr[]= {2,3,4,1};
	public getRegionTest1() {
		
		Sudoku s= new Sudoku(testArr);
		
		assertTrue(Arrays.equals(expectedArr,s.getRegion(1)));
		
	}
	public getRegionTest2() {
		
		Sudoku s= new Sudoku(testArr);
		
		assertFalse(Arrays.equals(expectedArr,s.getRegion(2)));
		
	} 
	}
	
	@Test
	public void isSudoku_Test1() {
		
		int[][] mySudoku = {{1, 2, 3, 4}, {3, 4, 2, 1}, {2, 1, 4, 3}, {4, 3, 1, 2}};
		
		Sudoku testSudoku = new Sudoku(mySudoku);
		
		assertTrue(Sudoku.isSudoku());
	}
	
	@Test
	public void isSudoku_Test2() {
		
		int[][] mySudoku = {{1, 2, 3, 4}, {4, 1, 2, 3}, {3, 4, 1, 2}, {2, 3, 4, 1}};
		
		Sudoku testSudoku = new Sudoku(4);
		
		LatinSquare(mySudoku);
		
		assertTrue((Sudoku.isSudoku());
			
	}
	
	@Test
	public void isSudoku_Test3() {
		
		int[][] mySudoku = {{1, 2, 3, 4}, {4, 1, 2, 3}, {3, 4, 1, 2}, {2, 3, 4, 1}};
		
		Sudoku testSudoku = new Sudoku(4);
		
		assertFalse(Sudoku.isSudoku());
		
	}
	
	
	
}
