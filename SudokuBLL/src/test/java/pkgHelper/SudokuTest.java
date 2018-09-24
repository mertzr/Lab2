package pkgHelper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import pkgGame.Sudoku;

public class SudokuTest {
	
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
