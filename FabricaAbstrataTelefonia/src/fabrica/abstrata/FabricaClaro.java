package fabrica.abstrata;

import fabrica.abstrata.modelo.EnvioSMSClaro;
import fabrica.abstrata.modelo.EnvioSMS;
import fabrica.abstrata.modelo.CobrancaClaro;
import fabrica.abstrata.modelo.Cobranca;

public class FabricaClaro extends FabricaAbstrataEnvios{ 

    @Override
    public  Cobranca criaCobranca() {
        return new CobrancaClaro();
    }
    @Override
    public EnvioSMS criaEnvioSMS() {
        return new EnvioSMSClaro(); 
    }
}

