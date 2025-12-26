public class OwnLive {
    private String word;
    private String meaning;

    public OwnLive() {
        this.word = "личножизнь";
        this.meaning = "индивидуализм и эксцентричность";
    }

    public String getDefinition() {
        return word + "означает" + meaning;
    }

    public boolean isCrime(Person person) {
        return person.isAlone();
    }

}
