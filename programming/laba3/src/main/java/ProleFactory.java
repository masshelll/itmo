import Enum.ProleType;
public class ProleFactory implements PersonFactory {
    @Override
    public Prole createPerson(ProleType type) {
        switch (type) {
            case GIRL:
                return new Prole("Девушка", 19, " с грубо накрашенными губами");
            case FAT_WOMAN:
                return new Prole("Баба", 45, " толстая, с красными руками");
            case OLD_MAN:
                return new Prole("Старик", 70, " шаркающий на неуклюжих ногах");
            case CHILD:
                return new Prole("Ребенок", 8, " оборванный, босой");

            default:
                return new Prole("Прохожий", 30, " в синем комбинезоне");
        }
    }

}
