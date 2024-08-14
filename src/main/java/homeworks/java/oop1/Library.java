package homeworks.java.oop1;

public class Library {
    public static void main(String[] args) {

        Author StephenKing = new Author("Stephen King", "stephen.king@horror.com");
        Book UndertheDome = new Book("Under the Dome", 2009, StephenKing, 50);
        System.out.println(UndertheDome.getInfo());

        Author HGWells = new Author("H.G. Wells", "hgwells@sf.com");
        Book WaroftheWorlds = new Book("War of the Worlds", 1898, HGWells, 76);
        System.out.println(WaroftheWorlds.getInfo());

        Author GeorgeRRMartin = new Author("George R.R. Martin", "georgerrmartin@dragons.com");
        Book GameofThrones = new Book("Game of Thrones", 1996, GeorgeRRMartin, 99);
        System.out.println(GameofThrones.getInfo());
    }
}