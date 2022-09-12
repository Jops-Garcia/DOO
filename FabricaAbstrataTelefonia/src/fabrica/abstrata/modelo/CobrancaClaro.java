package fabrica.abstrata.modelo;

import fabrica.abstrata.modelo.Cobranca;


public class CobrancaClaro implements Cobranca {

    @Override
    public void cobrar(int telefone) {
        System.out.println("Cobrar via Claro");
    }
}
