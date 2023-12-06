package Condition;

public class SeasonDeterminer {
	
	public void tellTheSeason(int monthNumber){
		String season;
		
		switch(monthNumber)
		{
		case 12:
		case 1:
		case 2:
			season = "Winter";
			break;
		case 3:
		case 4:
		case 5:
			season = "Spring";
			break;
		case 6:
		case 7:
		case 8:
			season = "Summer";
			break;
		case 9:
		case 10:
		case 11:
			season = "Autumn";
			break;
		default :
			season = "Wrong month number";
		}
		System.out.println(season);
	}
	
	public static void main(String []args) {
		SeasonDeterminer mySeason = new SeasonDeterminer();
		mySeason.tellTheSeason(2);
		mySeason.tellTheSeason(9);
		mySeason.tellTheSeason(6);
		mySeason.tellTheSeason(0);
	}
}
