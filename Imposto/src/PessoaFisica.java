public class PessoaFisica extends Contribuinte{

    private double gastoSaude;

    public PessoaFisica(String nome, double rendaAnual, double gastoSaude){
        super(nome, rendaAnual);
        
        this.gastoSaude = gastoSaude;

    }
    @Override
    public double CalculoImposto( ){

        double rendaAnualComImposto;
        if (rendaAnual < 20000){
       
         rendaAnualComImposto = rendaAnual * 0.15;
            
            
        }
        else{
            rendaAnualComImposto = rendaAnual * 0.25;

        }

        
        if(gastoSaude>0){
            return rendaAnualComImposto + gastoSaude * 0.50;
        }else{
            return rendaAnualComImposto;
        }



    }

}