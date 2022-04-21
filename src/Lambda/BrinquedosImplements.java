package Lambda;

public class BrinquedosImplements implements  Brinquedo{
    @Override
    public boolean requisitosBrinquedos(int idade, double altura) {
        if(idade > 16 && altura > 1.55){
            System.out.println("Liberado para todos os brinquedos");
            return true;
        }else{
            System.out.println("Não atende aos requisitos minimos de segurança para utilizar a Montanha Russa");
            return false;
        }

    }
}
