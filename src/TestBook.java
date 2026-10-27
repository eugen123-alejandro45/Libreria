public class TestBook {
    public static void main(String[] argv) {
        Author anAuthor = new Author("Lucas Mazalda", "example2@gmail.com", 'm');
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 10000);

        Book anotherBook = new Book("more Java for dummy", anAuthor, 29.95, 888);

        System.out.println(aBook.getAuthor().getName());
        System.out.println(aBook.getAuthor().getEmail());


    }
}
