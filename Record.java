
public class Record {
	//id --> random number from 100 to 10000
		//recordTitle ---> Null or empty
		//singerName ----> Null or empty
		//recordLength ---> more than zero
		//recordRanking ---> more than zero less than 6
	
	int id, recordRank;
	String recordTitle, singerName;
	double recordLength;
	
	//constructor
	
	public Record(int id, String recordTitle, String singerName, double recordLength, int recordRank) {
		setID (id);
		setRecordTitle(recordTitle);
		setSingerName(singerName);
		setRecordLength(recordLength);
		setRecordRank(recordRank);
	}
	
	//GETTERS 
	public int getID() {
		return this.id;
	}
	
	public String getRecordTitle() {
		return this.recordTitle;
	}
	
	public String getSingerName() {
		return this.singerName;
	}
	
	public double getRecordLength() {
		return this.recordLength;
	}
	
	public int getRecordRank() {
		return this.recordRank;
	}


	//SETTERS
	
	
	public void setID(int id) {
		
		
		int randID = (int) ((Math.random()* 9901)+100);//formula (maximo - min +1) + min)
		this.id = randID;
	}
	
	public void setRecordTitle(String recordTitle) {
		if(recordTitle.isEmpty() || recordTitle.equalsIgnoreCase(null)) {
		this.recordTitle = "Unknown Title";
		} else {
			this.recordTitle = recordTitle;
		}
	}
	
	public void setSingerName(String singerName) {
		if(singerName.isEmpty() || singerName.equalsIgnoreCase(null)) {
			this.singerName = "Unknown Singer";
		} else {
			this.singerName = singerName;
		}
	}
	
	public void setRecordLength(double recordLength) {
		if(recordLength <= 0) {
			System.err.println("Record length cannot be less than 0.");
		} else {
			this.recordLength = recordLength;
		}
	}
	
	public void  setRecordRank(int recordRank) {
		if(recordRank >= 1 && recordRank <= 6) {
			this.recordRank = recordRank;

		} else {
			System.err.println("Enter a valir ranking 1 - 6 for " + recordTitle + "\n");
		}
	}
}





