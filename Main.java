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
		Record R1 = new Record(0, "", "Diana Nervis", 3.22, 6);
		Record R2 = new Record(1, "You've Got a Friend in Me", "Elpidio Pena", 4.07, 5);
		Record R3 = new Record(2, "It's Beginning to Get to Me", "Snow Patrol", 10.01, 6);
		Record R4 = new Record(3, "Yellow", "Rose Quevedo", 7.09, 5);
		Record R5 = new Record(4, "Great Big White World", "Karen Seguel", 9.12, 4);
		Record R6 = new Record(5, "Sailing", "", 6.65, 3);
		Record R7 = new Record(6, "Pirate oh Pirate", "Tears for Fears", 9.11, 6);
		

		//GETTING INTO THE ARRAY
		
		recordArray[0] = R1;
		recordArray[1] = R2;
		recordArray[2] = R3;
		recordArray[3] = R4;
		recordArray[4] = R5;
		recordArray[5] = R6;
		recordArray[6] = R7;
		
		//EXECUTING METHODS
		System.out.println("Enter a title to search:");
		String title = input.nextLine();
		System.out.println("Index: " + findIndex(recordArray, title));
		
		printRecord(recordArray, title);
		
		System.out.println("The average length of all titles is: " + getAverageLength(recordArray));
		System.out.println("The average ranking of all titles is: " + getAverageRanking(recordArray));
	}
	//PRINT RECORD
	public static void printRecord(Record[] RECS, String RECtitle) {
		for(Record m: RECS) {
			if(m.getRecordTitle().equalsIgnoreCase(RECtitle)) {
				System.out.println("ID: " + m.getID() + ". Title " + m.getRecordTitle() + 
									"\nInterpreter: " + m.getSingerName() + ".\nLength: " +
									m.getRecordLength() +  ". Ranking: " + m.getRecordRank() + " of 6.");
			}
		}
	}
	//FIND INDEX
	public static int findIndex(Record[] RECS, String RECtitle) {
		int s = 0;
		
		for(Record m: RECS) {
			if(m.getRecordTitle().equalsIgnoreCase(RECtitle)) {
				return s;
			}
			s++;
		}
		return -1;
	}
	//AVERAGE LENGTH METHOD
	public static double getAverageLength(Record[] RECS) {
		double avg = 0.0;
		
		for(Record m: RECS) {
			avg += m.getRecordLength();
		}
		return avg / RECS.length;
	}
	
	//AVERAGE RANKING METHOD
	public static double getAverageRanking(Record[] RECS) {
		double avg = 0.0;
		
		for(Record m: RECS) {
			avg += m.getRecordRank();
		}
		return avg / (double)RECS.length;
	}
}







