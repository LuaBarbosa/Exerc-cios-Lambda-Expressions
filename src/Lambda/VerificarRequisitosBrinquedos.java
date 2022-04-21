package Lambda;

public class VerificarRequisitosBrinquedos {

    public static void main(String args[]){

        //criar objeto da classe que implementa a interface
    BrinquedosImplements verificacao = new BrinquedosImplements();
    verificarPessoa(verificacao);

    //classe anônima Carrossel:
        verificarPessoa(new Brinquedo() {
            @Override
            public boolean requisitosBrinquedos(int idade, double altura) {
                if(idade > 6 && altura < 1.30){
                    System.out.println("Liberado para o brinquedo Carrossel e Roda Gigante");
                    return true;
                }else{
                    System.out.println("Não atende aos requisitos minimos de segurança para utilizar o Carrosel e Montanha Russa");
                    return false;
                }
            }
        });

        //usando Lambda para carrosel:

        verificarPessoa(((idade, altura) -> {
            if(idade > 6 && altura < 1.30){
                System.out.println("Liberado para o brinquedo Carrossel e Roda Gigante");
                return true;
            }else{
                System.out.println("Não atende aos requisitos minimos de segurança para utilizar o Carrosel e Montanha Russa");
                return false;
            }
        }));

    }

    static void verificarPessoa(Brinquedo brinquedo) {
        brinquedo.requisitosBrinquedos(15, 1.30);
    }

}
