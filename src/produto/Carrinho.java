package produto;

public class Carrinho extends Produto {
     
    private int qtd;
    private double valorQuantidade;

    public double getValorQuantidade() {
        return valorQuantidade;
    }

    public void setValorQuantidade(double valorQuantidade) {
        this.valorQuantidade = valorQuantidade;
    }
  
    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String ToString(){
        
        return String.format("%s %20s %24s %20s %20s\n "
                             , getNome(),getCodigo(),qtd,getValor(),valorQuantidade);
    }
    
    
}