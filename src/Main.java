import domain.FileService;
import domain.Shop;
import domain.Toy;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addToy(new Toy("1", "Car", 2));
        shop.addToy(new Toy("2", "Doll", 2));
        shop.addToy(new Toy("3", "Ball", 6));
        FileService fileService = new FileService("toys.txt");

        Toy toy;
        while ((toy = shop.getToy()) != null) {
            fileService.save(toy.getName() + "\n");
        }
    }
}
