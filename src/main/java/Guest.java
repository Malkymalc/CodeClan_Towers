public class Guest {
    private String name;
    private int age;
    private Double wallet;
    private String location;

    public Guest(String nameInput, int ageInput, Double walletInput){
        this.name = nameInput;
        this.age = ageInput;
        this.wallet = walletInput;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getLocation(){
        return this.location;
    }

    public void payRoomRate(Double charge){
        this.wallet -= charge;
    }
}
