package pkgHelper;

import pkgHelper.LatinSquare;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Test;

import pkgGame.Sudoku;

public class SudokuTest { 
	
	
	private int testArr[][]= {{1,2,3,4},{2,3,4,1},{3,4,2,1},{4,1,2,3}};
	private int expectedArr[]= {2,3,4,1};
	public void getRegionTest1() {
		
		Sudoku s= new Sudoku(testArr);
		
		assertTrue(Arrays.equals(expectedArr,s.getRegion(1)));
		
	}
	public void getRegionTest2() {
		
		Sudoku s= new Sudoku(testArr);
		
		assertFalse(Arrays.equals(expectedArr,s.getRegion(2)));
		
	}
	
	@Test
	public void isSudoku_Test1() {
		
		try {
			int[][] mySudoku = {{1, 2, 3, 4}, {3, 4, 2, 1}, {2, 1, 4, 3}, {4, 3, 1, 2}};
			Sudoku testSudoku = new Sudoku(mySudoku);
			assertTrue(testSudoku.isSudoku());
		}
		
		catch (Exception e) {
			fail("");
		}
		
	}
}
