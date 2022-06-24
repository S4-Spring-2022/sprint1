package CLI;




import DataInsertion.MainArray;
import Tournament.Tournament;
import Tournament.TournamentArray;
import com.keyin.member.Member;
import com.keyin.member.MemberArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;



public class CLI {

    public CLI() {}


    public static void main(String[] args) {

        Boolean exit = false;
        Scanner scanner = new Scanner(System.in);


            System.out.println("1. Search Members");
            System.out.println("2. Search Tournaments");
            System.out.println("3. Exit");
            int choiceInt = scanner.nextInt();
            if (choiceInt == 1) {
                    System.out.println("------------------");
                    System.out.println("1. Search Member by Name");
                    System.out.println("2. Display all Members");
                int memberSearchChoice;
                memberSearchChoice = scanner.nextInt();
                if (memberSearchChoice == 1) {
                    System.out.print("  Enter Member First Name: ");
                    String memberFirstName = scanner.next();
                    System.out.print("  Enter Member Last Name: ");
                    String memberLastName = scanner.next();
                    String memberName = memberFirstName + " " + memberLastName;
                    System.out.println("Show Member By Name"); // enter search for member by name when array is made
                    MainArray mainArray = new MainArray();
                    MemberArray members = new MemberArray();
                    Optional<Member> array = members.selectMemberByName(memberName);
                    Member member = array.get();
                    System.out.println(("Member Name: " + member.getMemberName()));
                    System.out.println(("Member Address: " + member.getMemberAddress()));
                    System.out.println(("Member Email: " + member.getMemberEmail()));
                    System.out.println(("Member Phone: " + member.getMemberPhone()));
                    System.out.println(("Membership Start Date: " + member.getMembershipStartDate()));
                    System.out.println(("Membership Duration: " + member.getMembershipDuration()));
                    System.out.println(("Membership Type: " + member.getMembershipType()));
                    System.out.println(("Membership Family Members: " + member.getMembershipFamilyMembers()));
                    System.out.println(("Past Tournaments: " + member.getPastTournaments()));
                    System.out.println(("Current Tournaments: " + member.getCurrentTournaments()));
                    System.out.println(("Upcoming tournaments: " + member.getUpcomingTournaments()));


                }
                if (memberSearchChoice == 2){
                    System.out.println("Show All Members"); // enter search for all members when array is made
                MainArray mainArray = new MainArray();
                    MemberArray members = new MemberArray();
                    for (int i = 0; i < members.selectAllMembers().size(); i++){
                        Member memberlist = members.selectAllMembers().get(i);
                        System.out.println("Member List: " + memberlist.getMemberName());
                    }




                }

                }
            if (choiceInt == 2) {
                System.out.println("------------------");
                System.out.println("1. Search Tournaments By Name");
                System.out.println("2. Display All Tournaments");
                int tournamentSearchChoice;
                tournamentSearchChoice = scanner.nextInt();
                if (tournamentSearchChoice == 1) {
                    System.out.println(" Enter Name Of Tournament");
                    String TournyName = scanner.next();
                    System.out.println("Show Tournament Details"); // enter search for exact tourny when array is made
                    MainArray mainArray = new MainArray();
                    TournamentArray tournys = new TournamentArray();
                    System.out.println(tournys);
                    Optional<Tournament> array = tournys.selectTournamentByName(TournyName);
                    System.out.println(array);
                    Tournament tournament = array.get();
                    System.out.println(("Tournament Name: " + tournament.getTourneyName()));
                    System.out.println(("Location: " + tournament.getLocation()));
                    System.out.println(("Entry Fee: " + tournament.getEntryFee()));
                    System.out.println(("Cash Prize Amount: " + tournament.getCashPrizeAmount()));
                    System.out.println(("Start Date: " + tournament.getStartDate()));
                    System.out.println(("End Date: " + tournament.getEndDate()));
                    System.out.println(("Participating Members: " + tournament.getParticipatingMembers()));
                    System.out.println(("Final Standings: " + tournament.getFinalStandings()));



                }
                if (tournamentSearchChoice == 2) {
                    System.out.println("Display All Tournaments"); // enter search for all tournys when array is made
                    MainArray mainArray = new MainArray();
                    TournamentArray tournys = new TournamentArray();
                    for (int i = 0; i < tournys.selectAllTournaments().size(); i++){
                        Tournament tournamentlist = tournys.selectAllTournaments().get(i);
                        System.out.println(("Tournament List: " + tournamentlist.getTourneyName()));
                    }
                }


            }

            if (choiceInt == 3){
                exit = true;
            }
            }
}
