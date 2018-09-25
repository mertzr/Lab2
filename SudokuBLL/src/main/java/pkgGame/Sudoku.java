package pkgGame;

import java.util.Arrays;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare {
	private int iSize;
	private int iSqrtSize;

	public Sudoku(int iSize) throws Exception {

	}

	public int[][] getPuzzle() {
		return LatinSquare;
	}

	public boolean isPartialSudoku() {
		
		boolean isInEach = true;
		boolean noDuplicates = true;
		boolean hasZero = false;
				
		int [][] regions;
		for (int i=0; i<iSqrtSize; i++)
			regions[i] = getRegion(i);
		
		for (region : regions) {
			
			// Each 1st row is in each region
			int[] firstRow = {region[0], region[1], region[2]};
			
			for (region : regions) {
				if (!Array.asList(region).contains(firstRow[0])) isInEach = false;
				if (!Array.asList(region).contains(firstRow[1])) isInEach = false;
				if (!Array.asList(region).contains(firstRow[2])) isInEach = false;
			}
			
			// Each has no duplicates:
			for (int i=0; i<iSqrtSize; i++)
				if (!hasDubplicates(regions(i)))
					noDuplicates = false;
			
			// There's one zero at least:
			if (Array.asList(region).contains(0))
				hasZero = true;
		}
		
		return noDuplicates && isInEach && hasZero;
		
	}
	
	public int[] getRegion(int iCol, int iRow) {
		int r=(iCol/iSqrtSize)+((iRow/iSize)*iSqrtSize);
		return getRegion(r);
	}
	

	public int[] getRegion(int r) {
		int[] reg = new int[super.getLatinSquare().length];

		int i = (r % iSqrtSize) * iSqrtSize;
		int j = (r / iSqrtSize) * iSqrtSize;
		int iMax = i + iSqrtSize;
		int jMax = j + iSqrtSize;
		int iCnt = 0;

		for (; j < jMax; j++) {
			for (i = (r % iSqrtSize) * iSqrtSize; i < iMax; i++) {
				reg[iCnt++] = super.getLatinSquare()[i][j];
			}

		}
		return reg;
	}

	public boolean isSudoku() {

		boolean isSudoku = true;

		isSudoku = super.isLatinSquare();

		int[] firstReg = getRegion(0);

		for (int regNum = 0; regNum < iSqrtSize; regNum++) {

			if (super.ContainsZero()) {
				isSudoku = false;
				break;
			}
			
			if (super.hasDuplicates(getRegion(regNum))) {
				isSudoku = false;
				break;
			}
			
			if (!(hasAllValues(firstReg, getRegion(regNum)))) {
				isSudoku = false;
				break;
			}
		}
		return isSudoku;
	}

	public boolean isValueValid(int iCol, int iRow, int iValue) {
		boolean validCol = !(doesElementExist(getColumn(iCol), iValue));
		boolean validRow = !(doesElementExist(getRow(iRow), iValue));
		boolean validReg = !(doesElementExist(getRegion(iCol, iRow), iValue));
		
		if (validCol && validRow && validReg == true)
			return true;
		else
			return false;
	}

}
