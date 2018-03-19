public class ConferenceRoom extends ChargableRoom {

    private String name;

    public ConferenceRoom(RoomType roomType, Double rateInput, String nameInput){
        super(roomType, rateInput);
        this.name = nameInput;
    }

    public String getName(){
        return this.name;
    }
}
