public class Pluralize {
    public static void main(String[] args) {
        pluralize(3, "turtle");
        pluralize(1, "dog");
    }

    public static void pluralize(int animalCount, String animalType) {

        if (animalCount == 0 || animalCount >= 2) {
            System.out.println("I own " + animalCount + " " + animalType + "'s");
        } else {
            System.out.println("I own " + animalCount + " " + animalType);
        }
    }
}