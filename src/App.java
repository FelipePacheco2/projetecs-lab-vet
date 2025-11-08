import java.util.ArrayList;

import Dominio.Animal;
import Dominio.Cliente;
import Dominio.Colaborador;
import Dominio.Fornecedor;
import Dominio.Veterinario;
import Repositorio.AnimalRepositorio;
import Repositorio.ClienteRepositorio;
import Repositorio.ColaboradorRepositorio;
import Repositorio.FornecedorRepositorio;
import Repositorio.VeterinarioRepositorio;

public class App {
    public static void main(String[] args) throws Exception {
        ClienteRepositorio RepClient = new ClienteRepositorio();
        ArrayList<Cliente> cliente = RepClient.readAll();
        System.out.println("Clientes");
        for(Cliente clientes : cliente){
            System.out.println("Codigo: " + clientes.getCodigo());
            System.out.println("Nome: " + clientes.getNome());
            System.out.println("CPF: " + clientes.getCpf());
        }

        System.out.println("");

        ColaboradorRepositorio RepColab = new ColaboradorRepositorio();
        ArrayList<Colaborador> colaborador = RepColab.readAll();
        System.out.println("Colaboradores");
        for(Colaborador colaboradors : colaborador){
            System.out.println("Matricula: " + colaboradors.getMatricula());
            System.out.println("Nome: " + colaboradors.getNome());
            System.out.println("Salario: " + colaboradors.getSalario());
        }
        
        System.out.println("");

        AnimalRepositorio RepAnimal = new AnimalRepositorio();
        ArrayList<Animal> animal = RepAnimal.readAll();
        for(Animal animals : animal){
            System.out.println("Codigo: " + animals.getCodigo());
            System.out.println("Nome: " + animals.getNome());
            System.out.println("Raça: " + animals.getRaca());
            System.out.println("Especie: " + animals.getEspecie());
            System.out.println("DataNascimento: " + animals.getDtNascimento());
        }

        System.out.println("");

        FornecedorRepositorio RepForn = new FornecedorRepositorio();
        ArrayList<Fornecedor> fornecedor = RepForn.readAll();
        System.out.println("Fornecedores");
        for(Fornecedor fornecedors : fornecedor){
            System.out.println("Codigo: " + fornecedors.getCodigo());
            System.out.println("RazaoSocial: "+ fornecedors.getRazaoSocial());
            System.out.println("CNPJ: "+ fornecedors.getCnpj());
        }

        System.out.println("");

        VeterinarioRepositorio RepVet = new VeterinarioRepositorio();
        ArrayList<Veterinario> veterinario = RepVet.readAll();
        for(Veterinario veterinarios : veterinario){
            System.out.println("Codigo: " + veterinarios.getCodigo());
            System.out.println("Nome:" + veterinarios.getNome());
            System.out.println("CPF: " + veterinarios.getCpf());
            System.out.println("RG: " + veterinarios.getRg());
            System.out.println("CRMV " + veterinarios.getRegCRMV());
        }
    }
}
