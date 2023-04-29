public class Registrar{

    public static void main(String[]arg){

        Pessoa user = new Pessoa("Rafael Neves", 66919999);
        user.setEndereco("UniFasipe");

        Fornecedor user2 = new Fornecedor("Texto ainda estou entendendo");
        user2.setValorCredito(50);
        user2.setValorDivida(20);
        user2.setSaldo(user2.getValorCredito(), user2.getValorDivida());

        Empregado user3 = new Empregado("Não entendi completamente");
        user3.codigoSetor = 5;
        user3.salarioBase = 1000;
        user3.imposto = 10;
        user3.setCalcularSalario(user3.getSalarioBase(), user3.getImposto());


        System.out.println("O seu nome é: " + user.nome);
        System.out.println("O seu telefone é: " + user.telefone);
        System.out.println("O seu endereço é: " + user.getEndereco()); 
        System.out.println("O seu Credito é de: " + user2.getValorCredito() + 
        " - A sua Divida é de: " + user2.getValorDivida() + 
        " - O seu saldo é de: " + user2.getSaldo());
        System.out.println("O código do setor é: " + user3.getCodigoSetor() + 
        " - O seu salário é de: " + user3.getSalarioBase() + 
        " - O seu imposto é de: " + user3.getImposto() + "% " + 
        " - Você recebe: " + user3.getCalcularSalario());



    }
}



// public class Registrar{
//     public static void main(String[]arg){

//         Fornecedor papelaria = new Fornecedor();

//         papelaria.nome="Sua Arte";
//         papelaria.cnpj = "0 0.000.000/0000-00";
//         papelaria.geovane.setCredito(50);
//         papelaria.geovane.setDivida(35);

//         papelaria.geovane.nome="geovane fiirst";
//         papelaria.geovane.idade = 20;
//         papelaria.geovane.setCpf("111.111.111-11");

//         System.out.println(papelaria.nome);
//         System.out.println(papelaria.cnpj);
//         System.out.println(papelaria.geovane.nome);
//         System.out.println(papelaria.geovane.getCpf());
//         System.out.println(papelaria.geovane.idade);
//         System.out.println(papelaria.geovane.getCredito());
//         System.out.println(papelaria.geovane.getDivida());
//         System.out.println(papelaria.geovane.getSaldo());
//     }
// }