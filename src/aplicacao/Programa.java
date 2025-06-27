package aplicacao;

import entidades.Funcionario;
import entidades.ServidorPublico;

import java.util.ArrayList;
import entidades.Curso;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
//        ServidorPublico isabela = new ServidorPublico();
//        isabela.setNome("Isabela");
//        isabela.setCargo("Auditor");
//        isabela.setOrgao("ANVISA");
//        isabela.setLotacao("Brasilia");
//        isabela.setEmail("isabela@gmail.");
//
//        isabela.calcularSalarioHorasExtras(10, 5.6);
//        System.out.println("Servidor: " + isabela.getNome());
//        System.out.printf("Valor hora extra: R$ %.2f",  isabela.getHorasExtras());
//        System.out.printf("\nSalário R$ %.2f", isabela.calcularSalario(1000));
//        double soma = isabela.calcularNumero(4,6,8);
//
//        ServidorPublico joao = new ServidorPublico();
//        ServidorPublico maria = new ServidorPublico(123, "Maria");
//        System.out.println(maria.getNome());
//        ServidorPublico jose = new ServidorPublico(1234, "José", "Auditor");
//        System.out.println(jose.getNome());
//        System.out.println(jose.getCargo());
        // String nome;
        // int qntd;
        // double preco;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Dados do produto");
        // System.out.println("Digite o nome do produto: ");
        // nome = sc.nextLine();
        // System.out.println("Digite o preço do produto");
        // preco = sc.nextDouble();
        // System.out.println("Digite a quantidade disponível do produto");
        // qntd = sc.nextInt();
        // Produto produto = new Produto(nome, preco, qntd);
        // produto.toString();
        // System.out.println("Digite a quantidade de produtos que serão adicionaos ao estoque: ");
        // qntd = sc.nextInt();
        // produto.adicionarProdutos(qntd);
        // System.out.println("Digite a quantidade de produtos que serão removidos ao estoque: ");
        // qntd = sc.nextInt();
        // produto.removerProdutos(qntd);

        // System.out.println("Relatório final: " + produto);

//        Funcionario funcionario = new Funcionario();
//
//        System.out.print("Nome: ");
//        funcionario.setNome(sc.nextLine());
//        System.out.print("Salário bruto: ");
//        funcionario.setSalarioBruto(sc.nextDouble());
//        System.out.print("Taxa: ");
//        funcionario.setTaxa(sc.nextDouble());
//
//        System.out.println(funcionario);
//
//        System.out.println();
//        System.out.print("Porcentagem de aumento: ");
//        funcionario.aumentarSalario(sc.nextDouble());
//        System.out.println(funcionario);
        adicionarServidorPublic();

    }
    static List<ServidorPublico> servidores = new ArrayList<>();
    static List<Curso> cursos = new ArrayList<>();
    public static void adicionarServidorPublic(){
        int matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matrícula"));
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do servidor");
        String orgao = JOptionPane.showInputDialog(null, "informe o órgão do servidor");
        String cargo = JOptionPane.showInputDialog(null, "informe o cargo do servidor");
        String lotacao = JOptionPane.showInputDialog(null, "informe a lotação do servidor");
        String email = JOptionPane.showInputDialog(null, "informe o email do servidor");
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "informe o salário do servidor"));

        ServidorPublico servido = new ServidorPublico(matricula, nome, orgao, salario, cargo, lotacao, email);
    }
    public static void listarServidoresPublicos(){

    }
    public static void  mostrarServidorPublic(int matricula){

    }
    public static void alterarServidorPublico(ServidorPublico servidor){

    }
    public static void excluirServidorPublico(int matricula){

    }
}
