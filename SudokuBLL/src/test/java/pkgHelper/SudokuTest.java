package pkgHelper;

import pkgHelper.LatinSquare;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Test;

import pkgGame.Sudoku;

public class SudokuTest {

	private int testArr[][] = { { 1, 2, 3, 4 }, { 2, 3, 4, 1 }, { 3, 4, 2, 1 }, { 4, 1, 2, 3 } };
	private int expectedArr[] = { 2, 3, 4, 1 };

	@Test 
	public void getRegionTest1() {

		Sudoku s = new Sudoku(testArr);

		assertTrue(Arrays.equals(expectedArr, s.getRegion(1)));

	}
	@Test
	public void getRegionTest2() {

		Sudoku s = new Sudoku(testArr);

		assertFalse(Arrays.equals(expectedArr, s.getRegion(2)));

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
	
	@Test
	public void isSudoku_Test2() {

		try {
			int[][] mySudoku = {{0, 2, 3, 4}, {3, 4, 2, 1}, {2, 1, 4, 3}, {4, 3, 1, 2}};
			Sudoku testSudoku = new Sudoku(mySudoku);
			assertFalse(testSudoku.isSudoku());
		}

		catch (Exception e) {
			fail("Has Zero; should fail");
		}
	}
	
	@Test
	public void isSudoku_Test3() {

		try {
			int[][] mySudoku = {{1, 2, 3, 4}, {1, 4, 2, 1}, {2, 1, 4, 3}, {4, 3, 1, 2}};
			Sudoku testSudoku = new Sudoku(mySudoku);
			assertFalse(testSudoku.isSudoku());
		}

		catch (Exception e) {
			fail("Has another 1 in region/column 1");
		}
	}
	
	@Test
	public void isSudoku_Test4() {

		try {
			int[][] mySudoku = {{1, 2, 3, 1}, {3, 4, 2, 1}, {2, 1, 4, 3}, {4, 3, 1, 2}};
			Sudoku testSudoku = new Sudoku(mySudoku);
			assertFalse(testSudoku.isSudoku());
		}

		catch (Exception e) {
			fail("Has another 1 in column/row");
		}
	}
	
	@Test
	public void isValidValue_Test1() {
		try {
			int [][] mySudoku = {{0, 2, 3, 4}, {4, 1, 2, 3}, {3, 4, 1, 2}, {2, 3, 4, 1}};
			Sudoku testSudoku = new Sudoku(mySudoku);
			assertTrue(testSudoku.isValueValid(0, 0, 1));}
		catch (Exception e) {
			fail("Has Zero");
		}
		
	}
	@Test
	public void isValidValue_Test2() {
		try {
			int [][] mySudoku = {{0, 2, 3, 4}, {4, 1, 2, 3}, {3, 4, 1, 2}, {2, 3, 4, 1}};
			Sudoku testSudoku = new Sudoku(mySudoku);
			assertFalse(testSudoku.isValueValid(0, 0, 2));}
		catch (Exception e) {
			fail("");
		}
	}
	
	@Test
	public void isPartialSudoku_Test() {
		
		int[][] MySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 4, 5, 6 } };
		
		LatinSquare LS = new LatinSquare(MySquare);
		
		assertFalse(LS.isPartialSquare());
	}
	
	@Test
	public void isPartialSudoku_Test2() {
		
		int[][] MySquare = { { 1, 2, 9 }, { 6, 4, 2 }, { 4, 2, 7 } };
		
		LatinSquare LS = new LatinSquare(MySquare);
		
		assertFalse(LS.isPartialSquare());
	}
}
