public abstract class ChargableRoom extends Room {
    private Double rate;

    public ChargableRoom(RoomType roomType, Double rateInput){
        super(roomType);
        this.rate = rateInput;
    }

    public void admitGuest(Guest guest){
        this.admitGuest(guest);
        guest.payRoomRate(this.getRate());
    }

    public void removeGuest(Guest guest){
        this.removeGuest(guest);
    }

    public Double getRate(){
        return this.rate;
    }
}
