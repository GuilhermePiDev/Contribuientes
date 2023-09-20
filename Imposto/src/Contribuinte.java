public abstract class Contribuinte{
    private String nome;
    protected double rendaAnual;

    public Contribuinte(){

    }

    public String getNome() {
        return nome;
    }

    public Contribuinte(String nome, double rendaAnual){
        this.rendaAnual = rendaAnual;
        this.nome = nome;
    }
    


    public abstract double CalculoImposto();
}