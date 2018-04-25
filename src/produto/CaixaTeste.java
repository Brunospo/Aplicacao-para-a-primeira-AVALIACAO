package produto;

import java.util.Scanner;

public class CaixaTeste {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        int i=0;
        String n;
        
        while(i != 99){
            
        
        System.out.printf("<<<<<Menu>>>>>>\n");
        System.out.printf("Digite 1 para cadastrar produto.\n");
        System.out.printf("Digite 2 para visualizar produtos.\n");
        System.out.printf("Digite 3 para cadastrar clientes.\n");
        System.out.printf("Digite 4 para visualizar clientes.\n");
        System.out.printf("Digite 5 para vender.\n");
        System.out.printf("Digite 99 para sair.\n");
        System.out.printf("Opção: ");
        i = input.nextInt();
       
        
        switch(i){
            
            case 1: {
                Produto p1 = new Produto();
                Crud.cadastrarProduto(p1);  
            }break;
            
            case 2: {
                Crud.mostrarProduto();
            }break;
            
            case 3: {
                Cliente c = new Cliente();
                Crud.cadastrarCliente(c);  
            }break;
            
            case 4: {
                Crud.mostrarCliente();
            }break;
            
            case 5:  {
                System.out.println("Digite o nome do cliente: ");
                n = input.next();
                Vender.realizarVenda(n);
                
            }break;
            
        }
        
        } 
        
    }
    
}
