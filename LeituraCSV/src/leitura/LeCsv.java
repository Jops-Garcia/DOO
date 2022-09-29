
package leitura;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.io.BufferedReader;

public class LeCsv {
        
     public LinkedList<Cliente> leCsvClientes() throws IOException{         
      
         LinkedList<Cliente> clientes = new  LinkedList<Cliente>();             
        String current = new java.io.File( "." ).getCanonicalPath();        
        File inputFile = new File(current + "\\src\\arquivo.csv");                
        FileReader in = new FileReader(inputFile);
        BufferedReader arqv = new BufferedReader(in);
        String linha;
        linha = arqv.readLine();
        linha = arqv.readLine();
        while (linha != null) {    
            String[] linhaSplit = linha.split(";");
            Cliente cliente = new Cliente();
            cliente.setId(linhaSplit[0]);
            cliente.setNome(linhaSplit[1]);
            cliente.setTelefone(linhaSplit[4]);
            cliente.setEmail(linhaSplit[2]);
            cliente.setTotalCompras(Double.parseDouble(linhaSplit[5]));

            clientes.add(cliente);
            linha = arqv.readLine();
        }       
        in.close(); 
        
        //complete o codigo para ler o csv e criar as instancias de cliente.
        //rode o teste MainReadCsvTest.java para testar o seu código.
        
        return clientes;
     }
}
