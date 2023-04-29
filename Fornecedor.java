public class Fornecedor extends Pessoa {

    public Fornecedor(String arg) {
        super(arg); //teste pra isso
    }

    private double valorCredito;
    private double valorDivida;
    public double saldo;


    public double getValorCredito(){
        return valorCredito;
    }

    public void setValorCredito(double valorCredito){
        this.valorCredito = valorCredito;
    }

    public double getValorDivida(){
        return valorDivida;
    }

    public void setValorDivida(double valorDivida){
        this.valorDivida = valorDivida;
    }


    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double valorCredito, double valorDivida){

        if (valorCredito != 0 & valorDivida != 0 ){

            saldo = valorCredito - valorDivida;

        }
        else{

            System.out.println("Não existe valores");
        }

    }
    

}

// public class Fornecedor {
//     public String nome;
//     public String cnpj;

//     Pessoa geovane = new Pessoa();

// }


