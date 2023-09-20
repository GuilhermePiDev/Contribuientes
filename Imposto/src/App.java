import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sca = new Scanner(System.in);
        List<Contribuinte> lista = new ArrayList<>();
        
       

        System.out.println("Quantos contribuientes você quer calcular?");
         int numeroContri = sca.nextInt();

        for( int i = 1; i<=numeroContri; i++){
            System.out.println("Contribuinte numero "+i+" :");
            System.out.println("Qual o nome do Contribuiente ?");
            String nome = sca.next();
            System.out.println("Qual a renda anual do Contribuiente ?");
            double rendaAnual = sca.nextDouble();
            System.out.println("O Contribuiente é pessoa fisica ou juridica (f/j)?");
            char escolha = sca.next().charAt(0);
            if(escolha == 'f'){
                System.out.println("Quanto de gastos com saúde ele teve ?");
                double gastoSaude = sca.nextDouble();
                lista.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
            }else{
                System.out.println("Quantos funcionarios a pessoa juridica tem ?");
                int numeroFuncionarios = sca.nextInt();
                lista.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
            }
        }
        System.out.println("\nContribuintes :");
        for(Contribuinte contribuinte : lista){
            System.out.println("Nome: "+contribuinte.getNome()+" Impostos a pagar R$"+contribuinte.CalculoImposto());
        }
    }
}
