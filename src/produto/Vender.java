package produto;

import java.util.Date;
import java.util.Scanner;

public class Vender {
    
    public static void vender(Cliente cliente){ 
   
        Scanner input = new Scanner(System.in);
        
        int k=1;
        double valorTotal = 0;
        String nomeOperador,formaDePagamento;
        String valorPago;
        
        System.out.println("Digite o nome do Operador do caixa: ");
        nomeOperador = input.next();
            
       
        while(k!=0){
            
            Carrinho carrinho = new Carrinho();
            
            System.out.println("Digite o nome do produto: ");
            carrinho.setNome(input.next());
            
            if(verificandoProduto(carrinho.getNome())== true){
               
                System.out.println("Digite a quantidade de produtos: ");
                carrinho.setQtd(input.nextInt());
                
                carrinho.setValor((Crud.inserirProduto.get(comparandoProdutos(carrinho.getNome())).getValor()));
                carrinho.setValorQuantidade((Crud.inserirProduto.get(comparandoProdutos(carrinho.getNome())).getValor()) * carrinho.getQtd());
                carrinho.setCodigo(Crud.inserirProduto.get(comparandoProdutos(carrinho.getNome())).getCodigo());
                
                valorTotal = valorTotal + carrinho.getValorQuantidade();
               Crud.inserirCarrinho.add(carrinho);
            }
                else{
                    System.out.println("Erro, produto não existe!!");
                }
            
            System.out.println("\nVender outro produto?");
            System.out.println("<<<Digite '1' para vender mais e '0' para encerrar venda>>>");
            k=input.nextInt();
        }
        
        System.out.println("Digite a forma de pagamento: ");
        formaDePagamento = input.next();
        
        if(formaDePagamento.equals("dinheiro")){
            
            System.out.println("Digite o valor pago: ");
            valorPago = input.next();
        }
        else{
            valorPago = formaDePagamento;
        }
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Operador do caixa: " + nomeOperador);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("\nNome do produto | Código do produto | Quantidade de produtos | Valor Unitário | Valor por Quantidade\n");
        Crud.mostrarcarrinho();
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Valor total: " + valorTotal);
        System.out.println("Forma de pagamento: " + formaDePagamento);
        System.out.println("Valor pago R$: " + valorPago);
        Date date = new Date();
        System.out.println(date);
        System.out.println("------------------------------------------------------------------------------------------------------");
      
        Crud.inserirCarrinho.clear();
        
    }
    
    static public boolean verificandoNome(String nome){
        
        int k;
        boolean y = false;
        
        for (k = 0; k < Crud.inserirCliente.size(); k++){
            
            if(nome.equals(Crud.inserirCliente.get(k).getNome())){
                
                y=true;
            } 
        }
        return y;
    }
    
    static public boolean verificandoProduto(String nome){
        
        int k;
        boolean y = false;
        
        for (k = 0; k < Crud.inserirProduto.size(); k++){
            
            if(nome.equals(Crud.inserirProduto.get(k).getNome())){
                
                y=true;
            } 
        }
        return y;
    }
    
    static public int comparandoNome(String nome){
        
        int k,r;
        
        for (k = 0; k < Crud.inserirCliente.size(); k++){
            
            if(nome.equals(Crud.inserirCliente.get(k).getNome())){
                
                return k;
            } 
        }
        r=k;
        return r;
    }
    static public int comparandoProdutos(String nome){
        
        int k,r;
        
        for (k = 0; k < Crud.inserirProduto.size(); k++){
            
            if(nome.equals(Crud.inserirProduto.get(k).getNome())){
                
                return k;
            }
        }
        r=k;
        return r;
    }
    
    static public void realizarVenda(String n){
        
        if(verificandoNome(n)== true){
            
                    vender(Crud.inserirCliente.get(comparandoNome(n)) );
                    
            }
                else{
                    System.out.println("Cliente não cadastrado, cadastre o cliente!!");
                    Cliente c = new Cliente();
                    Crud.cadastrarCliente(c);
                    vender(Crud.inserirCliente.get(comparandoNome(n)));
                }
    
}
    
    
}
