import java.util.List;

public class ISO31661 {
    private String codigoISO;
    private String nome;
    private double populacao;
    private double dimensao;
    private List<String> fronteira;

    //Constructor:

    public ISO31661(String codigoISO, String nome, double populacao, double dimensao, List<String> fronteira) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
        this.fronteira = fronteira;
    }

    //métodos:
    public void status() {
        System.out.println("--------------------------------");
        System.out.println("Informações referente ao país: ");
        System.out.println("--------------------------------");
        System.out.println("Código ISO: " + getCodigoISO() + "\nNome do pais: " + getNome() +
                "\nNúmero populacional: " + getPopulacao() + " milhões de habitantes " + "\nDimensão: "
                + getDimensao() + " km²" );
        System.out.printf("O país tem uma densidade populacional de: %.2f km²\n", this.densidadePop());

    }
    public double densidadePop(){
        return this.populacao / this.dimensao;

    }
    public boolean verificarFront(String nomepais){
        if (fronteira.contains(nomepais)){
            return true;
        }else {
            return false;
        }
    }

    //métodos especiais:

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public List<String> getFronteira() {
        return fronteira;
    }

    public void setFronteira(List<String> fronteira) {
        this.fronteira = fronteira;
    }
}


