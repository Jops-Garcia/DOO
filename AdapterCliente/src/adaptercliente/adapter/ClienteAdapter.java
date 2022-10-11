package adaptercliente.adapter;
import adaptercliente.model.ICliente;
import lib.ClienteExterno;

public class ClienteAdapter implements ICliente {
    private ClienteExterno cliente;

    public ClienteAdapter(ClienteExterno cliente) {
        this.cliente = cliente;
    }

    public String getNomeCompleto() {
        return cliente.getNome()+" "+cliente.getSobreNome();
    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        //this.cliente.nomeCompleto = nomeCompleto;
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public String getTelefone() {
        //return telefone;
        return cliente.getDddTelefone().substring(1)+" "+cliente.getTelefone();
    }

    @Override
    public void setTelefone(String telefone) {
        //this.telefone = telefone;
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public String getEmail() {
        //return email;
        return cliente.getEmail();
    }

    @Override
    public void setEmail(String email) {
        //this.email = email;
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public String getCelular() {
        //return celular;
        return cliente.getDddCelular().substring(1)+" "+cliente.getCelular();
    }

    @Override
    public void setCelular(String celular) {
        //this.celular = celular;
        throw new UnsupportedOperationException("Not supported yet");
    }
}
