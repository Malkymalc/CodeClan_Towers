import java.io.Console;
import java.util.ArrayList;

public class Runner {
    private Data data = new Data();
    private Console console = System.console();
    String hotelName = console.readLine("Please enter your hotel's name : ");

    int numberOfSingleBedrooms = getNumberOfBedrooms(true);
    Double singleRate = getRate(true);
    ArrayList<Bedroom> bedrooms = makeBedrooms(numberOfSingleBedrooms, true, singleRate);
    int numberOfDoubleBedrooms = getNumberOfBedrooms(false);
    Double doubleRate = getRate(false);
    ArrayList<Bedroom> doubleBedrooms = makeBedrooms(numberOfDoubleBedrooms, false, doubleRate);
    boolean test = bedrooms.addAll(doubleBedrooms);


    // Make hotel
    Hotel hotel = new Hotel(hotelName, bedrooms, conferenceRooms, dinningRooms, otherRooms);

    // Make guests
    ArrayList<Guest> guests = makeGuests();

    // Populate Rooms

    // Guest Actions
    int go =  guestActions();




    // Make Guests
    public ArrayList<Guest> makeGuests(){
        ArrayList<Guest> guests = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            guests.add( new Guest(this.makeName(),this.makeAge(), this.makeWallet()) );
        }
        return guests;
    }

    public String makeName(){
        String firstName = "a";
        String nickName = "b";
        String lastName = "c";
        return firstName + nickName + lastName;
    }
    public int makeAge(){
        int age = (int) (Math.random() * 100 + 1);
        return age;
    }
    public Double makeWallet(){
        Double wallet = Math.random() * 100 + 1;
        return wallet;
    }


    // Make Room Methods
    public int getNumberOfBedrooms(boolean single) {
        String singleOrDouble = single ? "single" : "double";
        String numberOfBedrooms = console.readLine("Please enter the number of %s rooms : ", singleOrDouble);
        int numberOfBedroomsInt = 0;
        try { 
            numberOfBedroomsInt = Integer.parseInt(numberOfBedrooms);
        } catch (NumberFormatException e) {
            System.out.println("That's not a number!");
            getNumberOfBedrooms(single);
        }
        return numberOfBedroomsInt;
    }

    public Double getRate(boolean single) {
        String singleOrDouble = single ? "single" : "double";
        String rateString = console.readLine("What is the rate for your  %s rooms : ", singleOrDouble);
        Double rateInt = 0.0;
        try {
            rateInt = Double.parseDouble(rateString);
        } catch (NumberFormatException e) {
            System.out.println("That's not a number!");
            getRate(true);
        }
        return rateInt;
    }

    public ArrayList<Bedroom> makeBedrooms(int numberOfRooms, boolean single, Double rate){
        RoomType roomType = single ? RoomType.BEDROOMSINGLE : RoomType.BEDROOMDOUBLE;
        ArrayList<Bedroom> roomsArray = new ArrayList<>();
        for (int i = 1; i <= numberOfRooms; i++) {
            roomsArray.add(new Bedroom(roomType, rate, i));
        }
        return roomsArray;
    }

    // Populate Rooms Method


    // Guest Actions Method
    public int guestActions(){
        for (Guest guest: guests) {
            String name = guest.getName();
            String action = data.getRandom(data.guestActions);
            String location = guest.getLocation();
            System.out.println( String.format("%1$s has %2$s", name, action, location) );
        }
        String goAgain = console.readLine("Hit any key to continue, or 'q' to quit: ");
        if(goAgain != "q") {
            guestActions();
        }
        System.out.println("Bye - come by again some time soon!");
        return 5;
    }

}




//YET TODO: ArrayList<ConferenceRoom> conferenceRooms, ArrayList<DinningRoom> dinningRooms, ArrayList<Room> otherRooms)
//YET TODO: Finish making rooms
//YET TODO: Finish making guests
//YET TODO: Populate rooms
//YET TODO: Guest Actions