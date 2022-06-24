package Tournament;
import java.util.ArrayList;

public class Tournament {
    private String tourneyName;
    private String startDate;
    private String endDate;
    private String location;
    private double entryFee;
    private double cashPrizeAmount;
    private ArrayList<String> participatingMembers;
    private ArrayList<String> finalStandings; //if tournament is over


    public Tournament(String tourneyName,
                      String startDate,
                      String endDate,
                      String location,
                      double entryFee,
                      double cashPrizeAmount,
                      ArrayList<String> participatingMembers,
                      ArrayList<String> finalStandings
    ){
        this.tourneyName = tourneyName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.entryFee = entryFee;
        this.cashPrizeAmount = cashPrizeAmount;
        this.participatingMembers = participatingMembers;
        this.finalStandings = finalStandings;

    }
    public String getTourneyName(){return tourneyName;}
    public String getStartDate(){return startDate;}
    public String getEndDate(){return endDate;}
    public String getLocation(){return location;}
    public double getEntryFee(){return entryFee;}
    public double getCashPrizeAmount(){return cashPrizeAmount;}
    public ArrayList<String> getParticipatingMembers(){return participatingMembers;}
    public ArrayList<String> getFinalStandings(){return finalStandings;}

}
