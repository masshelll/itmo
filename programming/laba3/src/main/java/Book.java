public class Book {
    private StringBuilder content;

    public Book() {
        this.content = new StringBuilder();
    }

    public void addContent(String text) {
        content.append(text).append("\n");
        System.out.println("Записал в дневнике: " + text);
    }
}
