package Interfaces;

import Entities.Prole;
import Enum.ProleType;
public interface PersonFactory {
    Prole createPerson(ProleType type);
}
