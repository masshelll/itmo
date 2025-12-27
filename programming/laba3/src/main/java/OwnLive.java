public class OwnLive {
    private String word;
    private String meaning;

    public OwnLive() {
        this.word = "личножизнь";
        this.meaning = "индивидуализм и эксцентричность";
    }

    public String getDefinition() {
        return  "Было даже слово на новоязе — " + word + ", что означало " + meaning + ".";
    }

    public boolean isCrime(Person person) {
        return person.isAlone();
    }

}
