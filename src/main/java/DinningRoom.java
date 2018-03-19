public class DinningRoom extends Room {
    private String name;

    public DinningRoom(RoomType roomType, String nameInput){
        super(roomType);
        this.name = nameInput;
    }
}
