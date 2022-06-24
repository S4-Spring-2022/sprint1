package com.keyin.member;

import java.time.LocalDate;
import java.util.ArrayList;

public class TournamentsDatabase extends Tournaments{

    public ArrayList<Tournaments> tournaments;

    public ArrayList<Tournaments> allTournaments() {

        tournaments = new ArrayList<Tournaments>();

        Tournaments t1 = new Tournaments("Dave's Cash", "Piper's Hole", 1500.00,
                "05/26/2022", "05/29/2022", 30000.00);
        tournaments.add(t1);
        Tournaments t2 = new Tournaments("Summer Smash", "Lucky's Green", 200.00,
                "06/09/2022", "06/12/2022", 5000.00);
        tournaments.add(t2);
        Tournaments t3 = new Tournaments("Swing Into Canada", "Confederation Hill", 500.00,
                "07/14/2022", "07/17/2022", 12500.00);
        tournaments.add(t3);
        Tournaments t4 = new Tournaments("Dog Days", "Rolling Flats", 200.00,
                "07/28/2022", "07/31/2022", 5000.00);
        tournaments.add(t4);
        Tournaments t5 = new Tournaments("August Affair", "Big River", 750.00,
                "08/11/2022", "08/14/2022", 18000.00);
        tournaments.add(t5);
        Tournaments t6 = new Tournaments("Provincials", "Capital Downs", 2000.00,
                "08/25/2022", "08/28/2022", 50000.00);
        tournaments.add(t6);
        Tournaments t7 = new Tournaments("Slide Quietly By September", "By The Bay Resort", 500.00,
                "09/15/2022", "09/18/2022", 12500.00);
        tournaments.add(t7);
        Tournaments t8 = new Tournaments("October Harvest", "Irish Loop", 1000.00,
                "10/13/2022", "10/16/2022", 25000.00);
        tournaments.add(t8);

        return tournaments;
    }

    public void setTournaments(ArrayList tournaments){
        this.tournaments = tournaments;
    }
    public ArrayList getTournaments(){
        return tournaments;
    }
}