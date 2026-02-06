public class DogDoor {
    private boolean open;

    public DogDoor() {
        this.open = false;
    }

    public void open(){
        System.out.println("A porta para cachorros abriu");
        open = true;
    }
    
    public void close(){
        System.out.println("A porta para cachorros fechou");
        open = false;
    }
    
    public boolean isOpen(){
        return open;
    }
}
