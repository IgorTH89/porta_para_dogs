public class Remote {
    private DogDoor door;

    public Remote(DogDoor door) {
        this.door = door;
    }
    
    public void pressButton(){
        System.out.println("O botão do controle foi pressionado.");
        if(door.isOpen()){
            door.close();
        }
        else{
            door.open();
        }
    }
}
