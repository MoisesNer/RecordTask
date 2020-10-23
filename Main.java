import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//create 7 objects
		//create array an add these objects
		//ask user enter title of record
		//read the input
		Scanner input = new Scanner(System.in);
		Record[]recordArray = new Record[7];
		
		// (int id, String recordTitle, String singerName, double recordLength, int recordRank
		Record R1 =  new Record(7, "", "Diana Nervis", 3.22, 6);
		Record R2 = new Record(1, "You've Got a Friend in Me", "Elpidio Pena", 4.07, 5);
		Record R3 =  new Record(2, "It's Beginning to Get to Me", "Snow Patrol", 10.01, 6);
		Record R4 =  new Record(3, "Yellow", "Rose Quevedo", 7.09, 5);
		Record R5 = new Record(4, "Great Big White World", "Karen Seguel", 9.12, 4);
		Record R6 = new Record(5, "Sailing", "", 6.65, 3);
		Record R7 = new Record(6, "Pirate oh Pirate", "Tears for Fears", 9.11, 9);
		
		//find record
		//print record
		printRecord(R2);
		
		//System.out.println("\nPrinting RECORDS\n");
		//printRecordArray(recordArray);
		
//		int index = findIndexRecords(id, recordTitle);
//		
//			if (index == -1) {
//				System.err.println("Record does not exist");
//			} else {
//				System.out.println("To get the average of length record press R, for the average of ranking pres K");
//				String n = input.nextLine().toLowerCase();
//					switch (n) {
//					case "r":
//						//code
//						break;
//					case "k":
//						//code
//						break;
//					default:
//						System.err.println("Wrong input");
//						//code
//						break;
//					}
//			}
		//print averages
	}
	//method to print one pass as an argument
		public static void PrintRecord(Record[] recordArray) {
			System.out.println();
			
			
		}
	
	
		
		//PRINTING ARRAY METHOD
		public static void printRecordArray(Record[] recordArray) {
			for(int m = 0; m < recordArray.length; m++) {
				System.out.println(recordArray[m].getID() + " NAME OF THE RECORD: " + recordArray[m].getRecordTitle() + " NAME OF THE INTERPRETER: " + recordArray[m].getSingerName() +
						"\nLENGTH OF RECORD: " + recordArray[m].getRecordLength() + " WITH RANKING " + recordArray[m].getRecordRank() + " of 6.\n");
			}
		}
		
		//PRINT ONE OBJECT
		
		public static void printRecord(Record tempRecord) {
			System.out.println("Name of the record: " + tempRecord.getRecordTitle() +
								"\nInterpreter Name : " + tempRecord.getSingerName() + 
								"\nLenth of Record" + tempRecord.getRecordLength() + 
								"\nRanking: " + tempRecord.getRecordRank());		
		}
		//FIND INDEXT METHOD
		public static int findIndextRecords(Record[] numb, String singer) {
			for(int n = 0; n < Record.length; n++) {
				if(numb[n].getSingerName().equalsIgnoreCase(singer)) {
					return n;
				}
			}
			return -1;
		}
		

	//getAverage of length record --> return average
		public void getAverageLengthRecord() {
			
		}
	//getAverage of ranking --> return average
		public void getAverageRanking() {
			
		}

}







