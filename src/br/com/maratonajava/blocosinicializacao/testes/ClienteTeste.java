package br.com.maratonajava.blocosinicializacao.testes;

import br.com.maratonajava.blocosinicializacao.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args){
        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();


//        for(int parcela :c.getParcelas())
//        {
//            System.out.println("Parcela: "+parcela);
//        };

        System.out.println(Cliente.getParcelas().length);
    }
}
