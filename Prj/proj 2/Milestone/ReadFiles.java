package driver_proj0.java;
import java.io.*;
import java.util.StringTokenizer;

public class ReadFiles {

	File file = new File("C:\\stocks\\newge.csv");
	int row = 0;
	String [] [] items;
	
	public boolean checkIsFile() {
		return file.isFile();
		
		public int findRowNumber() {
			row=0;
			if(checkIsFile()) {
				
				try {
					BufferedReader reader = new BufferedReader(new FilerReader(file));
					while((reader.readLine()) !=null) {
						row++;
					}
				} catch(Exception e) {
					System.out.println(e);
				}
				}
			else {
				System.out.println("This is not a file" );
			}
			return row;
		}
		
		publiv void convertToArray() {
			int r = 0;
			items = new String [findRowNumber()] [7] ;
			try {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line = null;
				while((line=reader.readLine()) !=null) {
					StringTokenizer z = new StringTokenizer(line,",");
					while(z.hasMoreTokens()) {
						for(int c = 0;c<7;c++) {
							items [r] [c] = z.nextToken();
						}
						r++;
					}
				}
			}
			Catch(Exception e){
				System.out.println(e);
			}
		}
		public void printArray() {
			for(int x=0;x<items.length;x++) {
				System.out.printf("%s - ", x);
				for(int y=o;y<items[x].length;y++) {
					System.printf("%s", items[x] [y]);
				}
				
			}
		}
	}
}

