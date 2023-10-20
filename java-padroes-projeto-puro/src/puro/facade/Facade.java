package puro.facade;

import subsistma1.CrmService;
import subsistma2.cep.CepAPI;

public class Facade {

    public void migrarCliente(String nome, String cep){

        String cidade = CepAPI.getInstancia().recuperarCidade(cep);
        String estado = CepAPI.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
    
}
