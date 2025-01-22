package domain;

import domain.excecoes.ClienteNaoEncontradoException;
import domain.excecoes.ContaExistenteException;
import domain.excecoes.ContaNaoEncontradaException;

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

    public void bucarClientePorNome(String nome) throws ClienteNaoEncontradoException {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
                break;
            } else {
                throw new ClienteNaoEncontradoException("Cliente não encontrado.");
            }
        }
    }

    public void adicionarConta(Conta conta)  {
        this.contas.add(conta);
    }

    public void buscarContaPorNumero(String numero) throws ContaNaoEncontradaException {
        for(Conta conta : contas) {
            if(conta.getNumero().equalsIgnoreCase(numero)) {
                System.out.println("Número: " + conta.getNumero());
                System.out.println("Saldo: " + conta.getSaldo());
                System.out.println("Titular: " + conta.getTitular().getNome());
                break;
            }else {
                throw new ContaNaoEncontradaException("Conta não encontrada");
            }
        }

    }
}
