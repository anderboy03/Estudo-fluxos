import java.util.concurrent.ThreadLocalRandom;

public class Exemplowhile {
    public static void main(String[] args) {
        double mesada= 50.0;
        while(mesada>0){
            Double valorDoce = valorAleatorio();
            if(valorDoce>mesada)
            valorDoce = mesada;

            System.out.println("doce do valor:" + valorDoce "adicionando no carrinho mesada:" . mesada=mesada - valorDoce);
            System.out.println("joao gastou todo sua mesada em doces");
        }
        private static double valorAleatorio(){
            return ThreadLocalRandom.current().nextDouble(2,8);
        }
    }
    
}
