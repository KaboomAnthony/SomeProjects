
public class Loader
{
    public static void main(String[] args)
    {
        Cat murkaCat = new Cat();
        System.out.println("Weight your cat murka: " + murkaCat.getWeight());
        while (!(murkaCat.getStatus().equals("Dead"))) {
            murkaCat.meow();
        }
        System.out.println("Your cat murka: " + murkaCat.getStatus());

        Cat vasyaCat = new Cat();

        double servingSize = 10;
        double drinkSize = 5;

        int foodCounter = 0;

        while (!(vasyaCat.getStatus().equals("Exploded"))) {
            vasyaCat.feed(servingSize);
            System.out.println("Your cat Vasya ate food and its weight: " + vasyaCat.getWeight());

            foodCounter++;
            if (foodCounter == 10) {
                vasyaCat.drink(drinkSize);
                System.out.println("Your cat Vasya drank water and its weight: " + vasyaCat.getWeight());

                foodCounter = 0;
            }
        }
        System.out.println("Your cat vasya: " + vasyaCat.getStatus());
    }
}