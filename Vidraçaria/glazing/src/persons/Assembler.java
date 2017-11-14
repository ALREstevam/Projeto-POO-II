package persons;

import java.io.Serializable;
import visit.Visit;
import agenda.neow.agenda.Agenda;

public class Assembler extends Driver implements Serializable, Cloneable{

    public Assembler(int driverLicenseType, int personalNumber, int registration, String name, String email, String contact, Agenda agd) {
        super(driverLicenseType, personalNumber, registration, name, email, contact, agd);
    }
}
