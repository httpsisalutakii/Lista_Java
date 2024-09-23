package maquinavendas;

import java.util.HashMap;
import java.util.Map;

public class MaquinadeVendas {
	private Map<String, Double> estoque;

    public MaquinadeVendas() {
        this.estoque = new HashMap<>();
    }

    public Map<String, Double> getEstoque() {
        return estoque;
    }
}
