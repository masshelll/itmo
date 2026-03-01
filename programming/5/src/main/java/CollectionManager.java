import java.time.LocalDateTime;
import java.util.TreeSet;

public class CollectionManager {
    private TreeSet<Route> collection;
    private LocalDateTime initializationDate;

    public CollectionManager() {
        this.collection = new TreeSet<>();
        this.initializationDate = LocalDateTime.now();
    }

    public LocalDateTime getInitializationDate() {
        return initializationDate;
    }

    public void addToCollection(Route route){
        long maxId = 0;
        for (Route r : collection) {
            if (r.getId() > maxId) {
                maxId = r.getId();
            }
        }
        long newId = maxId + 1;
        route.setId(newId);
        collection.add(route);
    }

    public boolean removeById(long id){
        boolean removed = collection.removeIf(route -> route.getId() == id);
        return removed;
    }

    public void clearCollection(){
        collection.clear();
    }

    public void infoCollection(){
        System.out.println("Тип коллекции: " + collection.getClass().getName());
        System.out.println("Дата инициализации: " + initializationDate);
        System.out.println("Количество элементов в коллекции: " + collection.size());
    }
}
