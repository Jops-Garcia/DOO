package fabrica.abstrata.modelo;

import fabrica.abstrata.modelo.EnvioSMS;
import fabrica.abstrata.modelo.Mensagem;


public class EnvioSMSClaro implements EnvioSMS{

    @Override
    public boolean enviar(Mensagem msg, int telefone) {
        System.out.println("Enviando mensagem:" +  msg.texto + 
                " para o telefone Claro:" + telefone );
        return true;
    }    
}

