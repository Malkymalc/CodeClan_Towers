import java.util.ArrayList;

abstract public class Room {
    private RoomType roomType;
    private Integer capacity;
    private ArrayList<Guest> guests;

    public Room(RoomType roomType){
        this.roomType = roomType;
        this.capacity = roomType.getCapacity();
        this.guests = new ArrayList<>();
    }

    public RoomType getRoomType(){
        return this.roomType;
    }
    public ArrayList<Guest> getOccupants(){
        return this.guests;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public int getNumberOfOccupants(){
        return this.guests.size();
    }
    public int getFreeCapacity(){
        return this.getCapacity() - this.getNumberOfOccupants();
    }

    public void admitGuest(Guest guest){
        guests.add(guest);
    }
    public void removeGuest(Guest guest){
        guests.remove(guest);
    }
}


//
// You are being asked to model a hotel. This hotel will contain a collection of rooms,
// of different types (e.g. bedrooms, conference rooms, dining rooms).
 //Some rooms will also have a daily/nightly rate.
// The hotel will also be able to check guests in/out of rooms. Bedrooms will have a type (Single/Double).
//
//(HINT your instincts may lean you towards putting different types of rooms into one ArrayList
// - this isn't a bad instinct at all, but for the purposes of this weekend's homework it's going to
// be easier if you make ArrayLists contain only one subclass of Room at a time -
// we will learn more about how you can get around this next week.)
//
// You will need to:
//
// Create an abstract Room superclass which contains the properties/methods common to all Rooms.
//
// Create different types of rooms which inherit from the Room superclass and have properties/methods
// of their own, e.g. bedroom which have a room number, a type e.g. Single/Double (HINT you may wish to
// use an enum for this with each entry having a value for the room capacity), conference rooms
// which have a name etc. Some rooms e.g. bedrooms, conference rooms, will be chargeable while others
// (e.g. dining rooms) may not.
//
//Create a Guest class so that guests can be checked in/out of rooms.
//
//Create a Hotel class, which has a collection of rooms, of different types.
// The hotel should be able check guests in/out of rooms, and be able to check which guest(s), if any,
// are checked into a particular room.
//
