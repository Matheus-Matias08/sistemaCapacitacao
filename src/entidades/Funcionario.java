package entidades;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double taxa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
        }
        
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    
    public double getTaxa() {
        return taxa;
    }
    
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    public double calcularSalarioLiquido(){
        double salarioLiquido = getSalarioBruto() - getTaxa();
        return salarioLiquido;
    }
    public void aumentarSalario(double porcentagem){
        setSalarioBruto(getSalarioBruto() + (getSalarioBruto() * (porcentagem/100)));
    } 
    public String toString(){
        return "Funcionário: "
            + getNome()
            + String.format(", R$ %.2f.", calcularSalarioLiquido());
    }
    public static void felizAniversario(Funcionario func){
        System.out.println("Feliz aniversário "+func);
    }
}
