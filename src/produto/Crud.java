package produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Crud {
    
    static Scanner input = new Scanner(System.in);
    
    static ArrayList<Produto> inserirProduto = new ArrayList<>();
    static ArrayList<Cliente> inserirCliente = new ArrayList<>();
    static ArrayList<Carrinho> inserirCarrinho = new ArrayList<>();
  
    
    public static void mostrarcarrinho(){
        for(int i = 0; i < inserirCarrinho.size();i++){
            
            System.out.println(inserirCarrinho.get(i).ToString());
        }
    }
    public static void cadastrarProduto(Produto prod){
        
        System.out.println("Digite o nome do produto: ");
        prod.setNome(input.next());
        
        System.out.println("Digite o código do produto: ");
        prod.setCodigo(input.next());
        
        System.out.println("Digite o valor do produto em Reais: ");
        prod.setValor(input.nextDouble());
        
        
        inserirProduto.add(prod);
    }
    
    public static void mostrarProduto(){
        for(int i = 0; i < inserirProduto.size();i++){
            
            System.out.println(inserirProduto.get(i).ToString());
            System.out.println("");
        }
    }
    
    public static void cadastrarCliente(Cliente clien){
        
        System.out.println("Digite o nome do Cliente: ");
        clien.setNome(input.next());
        
        System.out.println("Digite o cpf do Cliente: ");
        clien.setCpf(input.next());
        
        System.out.println("Digite o endereço do Cliente: ");
        clien.setEndereco(input.next());
        
        System.out.println("Digite o telefone do Cliente: ");
        clien.setTelefone(input.next());
        
        inserirCliente.add(clien);
    }
    
    public static void mostrarCliente(){
        for(int i = 0; i < inserirCliente.size();i++){
            
            System.out.println(inserirCliente.get(i).ToString());
            System.out.println("");
        }
    }
    
    
    }
    


    

