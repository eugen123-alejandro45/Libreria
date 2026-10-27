public class TestAuthor {
    public static void main(String[] argv) {
        Author anAuthor = new Author("Manuel Encayo", "example@gmail.com", 'm');

        System.out.println(anAuthor);
        anAuthor.setEmail("maripila@gmail.com");
        System.out.println(anAuthor);

    }
}
