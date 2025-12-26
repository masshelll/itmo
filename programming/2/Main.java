import ru.ifmo.se.pokemon.*;
import Pokemons.*;
import customJar.*;

public class Main {
public static void main(String[] args) {
	Battle b = new Battle();
	Pokemon p1 = new Alomomola("Чужой", 1);
	Pokemon p2 = new Noibat("Хищник", 1);
	Pokemon p3 = new Noivern("Супер Хищник", 1);

	Pokemon p4 = new Tynamo("Опарыш", 1);
	Pokemon p5 = new Eelektrik("Змейка", 1);
	Pokemon p6 = new Eelektross("Электрический крутыш", 1);
	b.addAlly(p1);
	b.addAlly(p2);
	b.addAlly(p3);
	b.addFoe(p4);
	b.addFoe(p5);
	b.addFoe(p6);
	b.go();
	}
}