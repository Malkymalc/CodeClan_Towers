import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DinningRoom> dinningRooms;
    private ArrayList<Room> otherRooms;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms,
                 ArrayList<DinningRoom> dinningRooms, ArrayList<Room> otherRooms) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.dinningRooms = dinningRooms;
        this.otherRooms = otherRooms;
    }

    public int getRoomFreeCapacity(Room room) {
        return room.getFreeCapacity();
    }

    public void checkGuestIn(Guest guest, Room room){
        if (getRoomFreeCapacity(room) != 0) room.admitGuest(guest);
    }

    public void checkGuestOut(Guest guest, Room room){
        room.getOccupants().remove(guest);
    }

    public ArrayList<Bedroom> getVacantBedrooms(){
        ArrayList<Bedroom> emptyRoomList = new ArrayList<>();
        for (Bedroom bedroom : bedrooms){
            if (bedroom.getNumberOfOccupants() == 0) emptyRoomList.add(bedroom);
        }
        return emptyRoomList;
    }

}

//Possible Extensions:
//Add functionality to check in guests to bedrooms for a number of nights.
//Any other extensions you may wish to add.