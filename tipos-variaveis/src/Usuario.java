/**
 * <h1>Smart Tv</h1>
 *  Este é um exercício com a intenção de simular o programa
 * que roda em uma smart tv.
 * <p>
 * <b>Nota:</b> Leia os documentos sobre Métodos para entender o programa abaixo.
 * 
 * @author Marcos Yudi
 * @version 1.0
 * @since 05/06/2024
 */

public class Usuario {
    /**
     *  O metodo abaixo simula o usuario apertando os comandos
     * de ligar e desligar a tv, aumentar e diminuir o volume e
     * aumentar e diminuir o canal, tendo tambem a possibilidade
     * de definir o canal desejado.
     *
     * @param args este parametro é a ...
     * @throws Exception parametro que diz que o programa a seguir tem uma excessão.
     * que não é este caso.
     */
    
    public static void main(String[] args) throws Exception{
        ExercicioSmartTv smartTv = new ExercicioSmartTv();

        System.out.println("Tv esta ligada? " + smartTv.ligada);
        System.out.println("Canal atual " + smartTv.canal);
        System.out.println("Volume " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status - Tv esta ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status - Tv esta ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo status - Volume " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo status - Volume " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Novo status - canal " + smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Novo status - canal " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Novo status - canal " + smartTv.canal);
        smartTv.mudarCanal(52);
        System.out.println("Novo status - canal " + smartTv.canal);

    }
    
}
