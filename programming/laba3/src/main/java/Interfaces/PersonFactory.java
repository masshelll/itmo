package Interfaces;

import Enum.ProleType;
import Entities.*;
public interface PersonFactory {
    Prole createPerson(ProleType type);
}
