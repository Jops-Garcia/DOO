package fabrica.abstrata.botoes;
import javax.swing.JButton;

public class FabricaBotoesIcones extends FabricaAbstrataBotoes {

    @Override
    public JButton criaBotaoOK() {

        return new ButtonOK();
    }

    @Override
    public JButton criaBotaoCancel() {

        return new ButtonCancel();
    }

}
