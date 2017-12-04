package driver_proj0.java;

public class StockMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReadFiles r = new ReadFiles();
		r.convertToArray();
		Formulas f = new Formulas();
		f.createDataArray(r.getArray());
		r.printArray();
	}
}

