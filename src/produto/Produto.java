package produto;

public class Produto {
    
    private String codigo;
    private String nome;
    private double valor;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    

    public String ToString(){
        
        return String.format(" Nome: %s \n Valor: R$ %s\n Código: %s "
                             , nome,valor,codigo);
    }

    
}
