import java.util.ArrayList;
import java.util.List;

public class Party {
    private static Party instance;
    private static final int MAX_SUSPICION = 100;
    private List<Ministry> ministries;
    private OwnLive crimeOwnLive;

    private Party() {
        this.ministries = new ArrayList<>();
        this.crimeOwnLive = new OwnLive();
    }

    public static Party getInstance() {
        if (instance == null) {
            instance = new Party();
        }
        return instance;
    }

    public int considerSuspicion(Person person, String action, int baseSuspicion) {
        if (person instanceof Prole) {
            return 0;
        }
        if (person.isInParty()) {
            if (crimeOwnLive.isCrime(person)) {
                baseSuspicion += 10;
//                System.out.println("Делать что-нибудь в одиночку почти всегда считалось подозрительным");
            }
            person.addSuspicion(baseSuspicion);
            // persons score for crime
            int currentScore = person.getSuspicion();

            if (currentScore >= MAX_SUSPICION) {
                kill(person);
            }
            return currentScore;
        }
        return 0;
    }

    public void addMinistry(Ministry ministry) {
        ministries.add(ministry);
    }

    private void kill(Person person) {
        person = null;
        System.out.println("испарился....");
    }

}
