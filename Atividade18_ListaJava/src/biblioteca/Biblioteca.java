package biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
	private Map<String, Boolean> livros;

    public Biblioteca() {
        this.livros = new HashMap<>();
    }

    public Map<String, Boolean> getLivros() {
        return livros;
    }
}
