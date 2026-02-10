public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println("O cachorro esta latindo para sair...");
        remote.pressButton();
        System.out.println("O cachorro saiu...");
        System.out.println("O cachorro já terminou...");
        
        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {}

        System.out.println("O cachorro está preso lá fora!...");
        System.out.println("O cachorro começou a latir...");
        System.out.println("Todd pega o controle remoto...");
        remote.pressButton();
        System.out.println("O cachorro voltou para dentro de casa...");
    }
}
