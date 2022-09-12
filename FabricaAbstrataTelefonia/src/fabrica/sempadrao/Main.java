/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.sempadrao;

import javax.swing.JOptionPane;

import fabrica.abstrata.modelo.Cobranca;
import fabrica.abstrata.modelo.CobrancaClaro;
import fabrica.abstrata.modelo.CobrancaTim;
import fabrica.abstrata.modelo.EnvioSMS;
import fabrica.abstrata.modelo.EnvioSMSClaro;
import fabrica.abstrata.modelo.EnvioSMSTim;
import fabrica.abstrata.modelo.EnvioSMSVivo;
import fabrica.abstrata.modelo.Mensagem;

/**
 *
 * @author felipe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String escolha = JOptionPane.showInputDialog("Tim, Claro ou Vivo?");
        int telefone = Integer.parseInt(JOptionPane.showInputDialog("Telefone?"));
        String texto = JOptionPane.showInputDialog("Mensagem");
        Mensagem msg = new Mensagem(texto);
        EnvioSMS envio = null;
        Cobranca cobranca = null;
        if (escolha.equalsIgnoreCase("tim")) {
            envio = new EnvioSMSTim("assincrono");
            if (envio.enviar(msg, telefone)) {
                cobranca = new CobrancaTim();
                cobranca.cobrar(telefone);
            } else if (escolha.equalsIgnoreCase("vivo")) {
                envio = new EnvioSMSVivo();
                if (envio.enviar(msg, telefone)) {
                    cobranca = new CobrancaTim();
                    cobranca.cobrar(telefone);
                }
            }else if (escolha.equalsIgnoreCase("claro")) {
                envio = new EnvioSMSClaro();
                if (envio.enviar(msg, telefone)) {
                    cobranca = new CobrancaClaro();
                    cobranca.cobrar(telefone);
                }
            }
        }
    }
}
