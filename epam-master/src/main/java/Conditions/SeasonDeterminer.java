package Conditions;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        if(monthNumber <= 0 || monthNumber > 12){
            System.out.println("Wrong number!");
        }
        if(monthNumber == 12 || monthNumber == 1 || monthNumber == 2){
            System.out.println("Winter");
        }
        if(monthNumber == 3 || monthNumber == 4 || monthNumber == 5){
            System.out.println("Spring");
        }
        if(monthNumber >= 6 && monthNumber <=8){
            System.out.println("Summer");
        }
        if(monthNumber >= 9 && monthNumber <=11){
            System.out.println("Autumn");
        }
    }
}
