public void Array_2() {
	String[][] arr = new String[3][3];
	
	for (int row = 0; row < arr.length; row++) {
		for (int col = 0; col < arr[row].length; col++)
			System.out.print("(" + row + ", " + col + ")");
		System.out.println();
	}
}