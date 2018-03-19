import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Data {

    public ArrayList<String> firstNames;
    public ArrayList<String> nickNames;
    public ArrayList<String> lastNames;
    public ArrayList<String> guestActions;

    public Data(){

        String[] actions = {
                "Says hello in the %3$s",
                "Says bye in the %3$s",
                "Jumps around in the %3$s",
        };
        guestActions.addAll(Arrays.asList(actions) );


        String[] firsts = {
                "Alan",
                "Bob",
                "Chris",
        };
        firstNames.addAll(Arrays.asList(firsts) );

        String[] nicks = {
                "Says hello in the ",
                "Says bye in the",
                "Jumps around in the",
        };
        nickNames.addAll(Arrays.asList(nicks) );

        String[] lasts = {
                "Says hello in the",
                "Says bye in the",
                "Jumps around in the ",
        };
        lastNames.addAll(Arrays.asList(lasts) );
    }

    public String getRandom(ArrayList<String> list){
        Collections.shuffle(list);
        return list.get(0);
    }

}
