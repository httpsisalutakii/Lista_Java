package agenda;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
	private Map<String, String> contatos;

    public Agenda() {
        this.contatos = new HashMap<>();
    }

    public Map<String, String> getContatos() {
        return contatos;
    }
}
