package creational.singleton.BT4;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election election;

    private Election() {}

    public static Election getInstance(){
        if (election == null){
            election = new Election();
        }
        return election;
    }
    int trump = 0, biden = 0;
    public void binhChon(Cadidate binhChon){
            if (binhChon == Cadidate.TRUMP) trump++;
            else if (binhChon == Cadidate.BIDEN) biden++;
    }

    public void InKetQua(){
        System.out.println("Trump: " + trump + "\nBiden: " + biden);
    }
}
