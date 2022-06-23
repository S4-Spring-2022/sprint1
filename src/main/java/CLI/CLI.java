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
                    System.out.print("  Enter member first name: ");
                    String memberFirstName = scanner.next();
                    System.out.print("  Enter member last name: ");
                    String memberLastName = scanner.next();
                    String memberName = memberFirstName + " " + memberLastName;
                    System.out.println("Show member by name"); // enter search for member by name when array is made
                    MainArray mainArray = new MainArray();
                    MemberArray members = new MemberArray();
                    Optional<Member> array = members.selectMemberByName(memberName);
                    Member member = array.get();
                    System.out.println(member.getMemberName());
                    System.out.println(member.getMemberAddress());
                    System.out.println(member.getMemberEmail());
                    System.out.println(member.getMemberPhone());
                    System.out.println(member.getMembershipStartDate());
                    System.out.println(member.getMembershipDuration());
                    System.out.println(member.getMembershipType());
                    System.out.println(member.getMembershipFamilyMembers());
                    System.out.println(member.getPastTournaments());
                    System.out.println(member.getCurrentTournaments());
                    System.out.println(member.getUpcomingTournaments());


                }
                if (memberSearchChoice == 2){
                    System.out.println("show all members"); // enter search for all members when array is made
                MainArray mainArray = new MainArray();
                    MemberArray members = new MemberArray();
                    for (int i = 0; i < members.selectAllMembers().size(); i++){
                        Member memberlist = members.selectAllMembers().get(i);
                        System.out.println(memberlist.getMemberName());
                    }




                }

                }
            if (choiceInt == 2) {
                System.out.println("------------------");
                System.out.println("1. Search Tournaments by Location");
                System.out.println("2. Display all Tournaments");
                int tournamentSearchChoice;
                tournamentSearchChoice = scanner.nextInt();
                if (tournamentSearchChoice == 1) {
                    System.out.println(" Enter Location of tournament");
                    String TournyLocation = scanner.next();
                    System.out.println("show tourny details"); // enter search for exact tourny when array is made
                    MainArray mainArray = new MainArray();
                    TournamentArray tournys = new TournamentArray();
                    System.out.println(tournys);
                    Optional<Tournament> array = tournys.selectTournamentByLocation(TournyLocation);
                    System.out.println(array);
                    Tournament tournament = array.get();
                    System.out.println(tournament.getLocation());
                    System.out.println(tournament.getEntryFee());
                    System.out.println(tournament.getCashPrizeAmount());
                    System.out.println(tournament.getStartDate());
                    System.out.println(tournament.getEndDate());
                    System.out.println(tournament.getParticipatingMembers());
                    System.out.println(tournament.getFinalStandings());



                }
                if (tournamentSearchChoice == 2) {
                    System.out.println("display all tournaments"); // enter search for all tournys when array is made
                    MainArray mainArray = new MainArray();
                    TournamentArray tournys = new TournamentArray();
                    for (int i = 0; i < tournys.selectAllTournaments().size(); i++){
                        Tournament tournamentlist = tournys.selectAllTournaments().get(i);
                        System.out.println(tournamentlist.getLocation());
                    }
                }


            }

            if (choiceInt == 3){
                exit = true;
            }
            }
}
