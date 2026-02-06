public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println("O cachorro esta latindo para sair...");
        remote.pressButton();
        System.out.println("O cachorro saiu...");
        remote.pressButton();
        System.out.println("O cachorro já terminou...");
        remote.pressButton();
        System.out.println("O cachorro voltou para dentro de casa...");
        remote.pressButton();
    }
}
