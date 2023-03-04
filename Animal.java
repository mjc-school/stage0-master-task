public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String sFur = hasFur ? "a" : "no";
        String nPaws = numberOfPaws == 1 ? "paw" : "paws"; // Optional
        String ans = String.format("This animal is mostly %s. It has %d %s and %s fur.",
                color, numberOfPaws, nPaws, sFur);
        return ans;
    }
}
