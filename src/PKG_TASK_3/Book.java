package PKG_TASK_3;

public class Book {

    public static void main(String[] args) {

        Author author = new Author();
        Title title = new Title();
        Content content = new Content();

        author.setName("William Shakespeare");
        title.setName("Romeo and Juliet");
        content.setName("Two households, both alike in dignity (In fair Verona, where we lay our scene)");

        title.show();
        author.show();
        content.show();

    }

}
