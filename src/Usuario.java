public class Usuario {
    public static void main(String[] args) throws  Exception {
        SmartTv smartv = new SmartTv();

        smartv.diminuirVolume();
        smartv.diminuirVolume();
        smartv.diminuirVolume();
        smartv.aumentarVolume();

        System.out.println("A TV ligou no canal: " + smartv.canal);
        System.out.println("Volume atual: " + smartv.volume);

        smartv.mudarCanal(15);

        System.out.println("Canal atual: " + smartv.canal);

        System.out.println("TV ligada? " + smartv.ligada);
        System.out.println("canal atual: " + smartv.canal);
        System.out.println("Volume atual: " + smartv.volume);

        smartv.ligar();
        System.out.println("Novo status: " + smartv.ligada);
    }
}
