package OOP;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    @Override
    public String toString() {
        return "OOP.Animal{" +
                "color='" + color + '\'' +
                ", numberOfPaws=" + numberOfPaws +
                ", hasFur=" + hasFur +
                '}';
    }
    public String amountOfPaws(){
        if (numberOfPaws <= 1 )
            return "paw";
        else return "paws";
    }
    public String getDescription(){


        return
                "This animal is mostly "+color+". It has " + numberOfPaws + " "+ amountOfPaws() +" and " + hasFurOrNo()  + " fur";
    }

    public String hasFurOrNo(){
        if( hasFur == true)
            return "a";
            else return "no";
    }
}
