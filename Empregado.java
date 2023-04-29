public class Empregado extends Pessoa {

    public Empregado(String arg) {
        super(arg); //teste pra isso de novo
    }

    int codigoSetor;
    double salarioBase;
    double imposto; //100 pra ser %
    double calcularSalario;


    public double getCodigoSetor(){
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor){
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public double getImposto(){
        return imposto;
    }

    public void setImposto(int imposto){
        this.imposto = (salarioBase * imposto/100);
    }

    public double getCalcularSalario(){
        
        return calcularSalario;

    }

    public void setCalcularSalario(double salarioBase, double imposto){

        calcularSalario = salarioBase - (salarioBase * imposto / 100.0);

    }
    
    //colocar tanto o cnpj no fornecedor para parecer, quanto o nomes e tals do empregado para aparecer
}
