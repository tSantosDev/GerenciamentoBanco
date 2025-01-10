package domain;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;
    private List<Conta> contas;

    public Banco(){
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public Cliente bucarClientePorNome(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                return cliente;
            }
        }
        return null;
    }

    public void adicionarConta(Conta conta) {
        for (Conta conta1 : contas){
            if (conta.getNumero().equals(conta1.getNumero())){
                //lançar exceção que falta criar
                return;
            } else {
                this.contas.add(conta);
                break;
            }
        }
    }

    public Conta buscarContaPorNumero(String numero) {
        for(Conta conta : contas) {
            if(conta.getNumero().equalsIgnoreCase(numero)) {
                return conta;
            }
        }
        return null;
    }
}
