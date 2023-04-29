public class Pessoa {

        public String nome;
        private String endereco;
        public int telefone;
        
        public Pessoa (String nome, int telefone){
            this.nome = nome;
            this.telefone = telefone;
        }
        public String getEndereco(){
            return endereco;
        }
        public void setEndereco(String endereco){
            this.endereco = endereco;
        }

        public Pessoa(String arg){} //teste

}



// public class Pessoa {
//     public String nome;
//     private String cpf;
//     public int idade;

//     private double credito;
//     private double divida;
//     private double saldo;


//     public String getCpf(){
//         return cpf;
//     }
//     public void setCpf(String cpf){
//         this.cpf = cpf;
//     }

//     public double getCredito(){
//         return credito;
//     }
//     public void setCredito(double credito){
//         this.credito = credito;
//     }

//     public double getDivida(){
//         return divida;
//     }
//     public void setDivida(double divida){
//         this.divida = divida;
//     }

//     public double getSaldo(){
//         return saldo;
//     }
//     public void setSaldo(double saldo){
//         saldo = credito - divida;
//     }
// }