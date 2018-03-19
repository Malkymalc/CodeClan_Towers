public enum RoomType {
    BEDROOMSINGLE(1),
    BEDROOMDOUBLE(2),
    SMALLROOM(25),
    MMEDIUMROOM(50),
    LARGEROOM(100);


    private final Integer capacity;


    RoomType(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getCapacity(){
        return this.capacity;
    }
}
