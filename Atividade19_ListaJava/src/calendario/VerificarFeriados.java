package calendario;

import java.time.LocalDate;

public class VerificarFeriados {
	public boolean verificarFeriado(LocalDate data) {
        return data.equals(LocalDate.of(data.getYear(), 12, 25));
    }
}
