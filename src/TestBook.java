public class TestBook {
    public static void main(String[] argv) {
        Author anAuthor = new Author("Lucas Mazalda", "example2@gmail.com", 'm');
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 10000);

        Book anotherBook = new Book("more Java for dummy", anAuthor, 29.95, 888);

        Book[] books = new Book[5];
        books[0] = aBook;
        books[1] = anotherBook;
        books[2] = new Book("Berserk", new Author("Kentaro Miura", "mi.kentaro@gmail.com", 'm'), 16.25, 888);
        books[3] = new Book("El lobo de Wall Street", new Author("Jordan Belfort", "bel.jordan@gmail.com", 'm'), 15.25, 555);
        books[4] = new Book("El principito", new Author("Antoine de Saint-Exupéry", "example@gmail.com", 'm'), 13.22, 2);
        System.out.println("---------------------------------------------------");
        System.out.println(aBook);
        System.out.println(aBook.getPrice());
        System.out.println(aBook.getQtyInStock());
        System.out.println(aBook.getAuthor().getName());
        System.out.println(aBook.getAuthor().getEmail());
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }







    }
}
