import Enum.*;
import Error.*;
public class Main {
    public static void main(String[] args) {
        //world settings
        Party party = Party.getInstance();
        Person winston = new Person("Уинстон", true);
        Ministry ministryOfTrue = new Ministry("Министерство", "Министерство правды", 2000, CardinalDirection.NORTH);
        CommunityCentre centre = new CommunityCentre("Общественный Центр", 500, "шумное место", CardinalDirection.SOUTH);
        //coffee and memory
        House house = new House("Дом", 100, "какой то", CardinalDirection.EAST, "", false, 3);
        Entrance entrance = house.getEntrance();
        Coffee realCoffe = new Coffee("Настоящий");
        Coffee victoryCoffe = new Coffee("Победа");
        Smell coffeeSmell = realCoffe.getSmell();
        Smell victoryCoffeeSmell = victoryCoffe.getSmell();
        coffeeSmell.setSecondDescription(victoryCoffeeSmell);
        entrance.setSmell(coffeeSmell);
        entrance.spreadSmell();
        winston.stay();
        Memory childMemory = new Memory(true, "мир своего детства");
        winston.remember(childMemory, Time.MOMENT);
        Door door = entrance.getDoor();
        entrance.slamDoor(10);
        Smell smellAfterClose = entrance.getSmell();
        //walking, pain in leg
        winston.go(centre, 5, true, TimeOfDay.EVENING);
        //politics, nature
        try {
            party.considerSuspicion(winston, "Второй раз пропускает вечер в Общественном центре", 15);
        } catch (SuspicionException e) {
            System.out.println("Пиф-паф");
            System.out.println("Симуляция закончена.");
            return;
        }
        Nature nature = new Nature(" воздух", "нежный апрельский");
        nature.impress(winston);
        Place street = new Place("Лабиринт улиц", 10000, "лондонский", CardinalDirection.NORTH);
        winston.go(street, 1, true, TimeOfDay.EVENING);
        //Book
        Book diary = new Book();
        try {
            winston.writeInBook(diary, "Если есть надежда, то она в пролах");
        } catch (DiaryException e) {
            System.out.println(e.getMessage());
            System.out.println("Уинстон не смог написать, но запомнил свои мысли");
        }
        Place slum = new Place("Трущобный район", 100, "с маловыразительными домами", CardinalDirection.NORTH);
        House destroyedStation = new House("Вокзал Сент-Паекрас", 800, "когда то находился", CardinalDirection.EAST, "серый", true, 1);
        destroyedStation.getDescription();
        //prols
        Prole girl = new Prole("Девушка ", 19, "грубо накрашенные губы");
        Prole fatWoman = new Prole("Женщина ", 45, "толстая, красные руки");
        Prole child = new Prole("Ребенок ", 8, "оборванные, босые");
        Puddle puddle = new Puddle(" грязная лужа");
        child.playInPuddle(puddle);
        fatWoman.speak();
        girl.react(winston);
        child.react(winston);


    }
}
