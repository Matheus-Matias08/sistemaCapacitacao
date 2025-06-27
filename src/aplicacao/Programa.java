package aplicacao;

import entidades.Funcionario;
import entidades.ServidorPublico;

import java.util.ArrayList;
import entidades.Curso;

import javax.swing.*;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        Programa programa = new Programa();
        programa.adicionarServidorPublic();
        programa.adicionarServidorPublic();
        programa.listarServidores();
        programa.listarServidores(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual matrícula deseja procurar?")));
        programa.listarServidores(JOptionPane.showInputDialog(null, "Qual matrícula deseja procurar?"));
    }

    List<ServidorPublico> servidores = new ArrayList<>();
    List<Curso> cursos = new ArrayList<>();
    public void adicionarServidorPublic(){
        int matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matrícula"));
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do servidor");
        String orgao = JOptionPane.showInputDialog(null, "informe o órgão do servidor");
        String cargo = JOptionPane.showInputDialog(null, "informe o cargo do servidor");
        String lotacao = JOptionPane.showInputDialog(null, "informe a lotação do servidor");
        String email = JOptionPane.showInputDialog(null, "informe o email do servidor");
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "informe o salário do servidor"));

        ServidorPublico servidor = new ServidorPublico(matricula, nome, orgao, salario, cargo, lotacao, email);
        servidores.add(servidor);
    }
    public void listarServidores(){
        for(ServidorPublico servidor:servidores){
            System.out.println(servidor);
        }
    }
    public void listarServidores(int matricula){
        boolean encontrou = false;
        for(ServidorPublico servidor:servidores){
            if (servidor.getMatricula() == matricula) {
                System.out.println(servidor);
                encontrou = true;
                break;
            }
        }
        if (!encontrou){
            JOptionPane.showMessageDialog(null,"Servidor não encontrado");
        }
    }
    public void listarServidores(String nome){
        boolean encontrou = false;
        for(ServidorPublico servidor:servidores){
            if (servidor.getNome().equals(nome)) {
                System.out.println(servidor);
                encontrou = true;
                break;
            }
        }
        if (!encontrou){
            JOptionPane.showMessageDialog(null,"Servidor não encontrado");
        }
    }
    public void alterarServidorPublico(ServidorPublico servidor){

    }
    public void excluirServidorPublico(int matricula){

    }
}
