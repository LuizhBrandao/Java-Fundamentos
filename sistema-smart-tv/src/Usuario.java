public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        smartTv.ligar();

        System.out.println("Novo Status => TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);
        
        smartTv.mudarCanal(11);
        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
    
        System.out.println("Volume Atual : " + smartTv.volume);
    
        
    }   

}
