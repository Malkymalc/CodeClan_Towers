public class Bedroom extends ChargableRoom {
    private int roomNumber;
    private int lengthOfStay;

    public Bedroom(RoomType roomType, Double rate, int roomNumberInput){
        super(roomType, rate);
        this.roomNumber = roomNumberInput;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getLengthOfStay(){
        return this.lengthOfStay;
    }

    public int getFreeCapacity(){
        if (this.getOccupants().size() != 0){
            return 0;
        } else {
            return this.getCapacity();
        }
    }

    public void admitGuest(Guest guest, int lengthOfStay){
        this.admitGuest(guest);
        guest.payRoomRate(this.getRate());
        this.lengthOfStay = lengthOfStay;
    }

    public void removeGuest(Guest guest){
        this.removeGuest(guest);
        if (this.getNumberOfOccupants() == 0) this.lengthOfStay = 0;
    }

}
