import java.util.ArrayList;

import Dominio.Cliente;
import Dominio.Colaborador;
import FakeBD.ClienteFakeDB;
import FakeBD.ColaboradorFakeDB;

public class App {
    public static void main(String[] args) throws Exception {

        ClienteFakeDB db = new ClienteFakeDB();
        ArrayList<Cliente> clientes = db.getInstancia();

        for (Cliente cliente : clientes){
            System.out.println("Codigo: " + cliente.getCodigo());
            System.out.println("nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
        }
        

        ColaboradorFakeDB db2 = new ColaboradorFakeDB();
        ArrayList<Colaborador> colaboradors = db2.getInstancia();

        for (Colaborador colaborador : colaboradors){
            System.out.println("Nome: " + colaborador.getNome());
            System.out.println("Salario: " + colaborador.getSalario());
            System.out.println("Matricula: " + colaborador.getMatricula());
        }
    }
}