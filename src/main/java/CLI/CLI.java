package CLI;




import DataInsertion.MainArray;
import Tournament.Tournament;
import Tournament.TournamentArray;
import com.keyin.member.Member;
import com.keyin.member.MemberArray;

import java.util.*;


public class CLI {

    public CLI() {}


    public static void main(String[] args) {

        Boolean exit = false;
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");


            System.out.println("1. Search Members");
            System.out.println("2. Search Tournaments");
            System.out.println("3. Enter new members");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice 1, 2 ,3 or 4: ");
            int choiceInt = scanner.nextInt();
            if (choiceInt == 1) {
                    System.out.println("------------------");
                    System.out.println("1. Search Member by Name");
                    System.out.println("2. Display all Members");
                    System.out.print("Please enter your choice 1 or 2: ");
                int memberSearchChoice;
                memberSearchChoice = scanner.nextInt();
                if (memberSearchChoice == 1) {
                    System.out.print("  Enter Member First Name: ");
                    String memberFirstName = scanner.next();
                    System.out.print("  Enter Member Last Name: ");
                    String memberLastName = scanner.next();
                    String memberName = memberFirstName + " " + memberLastName;
                    MainArray mainArray = new MainArray();
                    MemberArray members = new MemberArray();
                    Optional<Member> array = members.selectMemberByName(memberName);
                    if (array.isEmpty()) {
                        while (array.isEmpty()){

                            System.out.println("No users found");
                            System.out.println("------------------");
                            System.out.println("1. Search Member by Name");
                            System.out.println("2. Exit");
                            System.out.print("Please enter your choice, 1 or 2: ");
                            int memberCatch = scanner.nextInt();
                            if(memberCatch == 1) {
                                System.out.print("  Enter Member First Name: ");
                                String catchMemberFirstName = scanner.next();
                                System.out.print("  Enter Member Last Name: ");
                                String catchMemberLastName = scanner.next();
                                String catchMemberName = catchMemberFirstName + " " + catchMemberLastName;
                                MainArray catchMainArray = new MainArray();
                                MemberArray catchMembers = new MemberArray();
                                Optional<Member> catchArray = catchMembers.selectMemberByName(catchMemberName);
                                if (catchArray.isPresent()){
                                    array = catchArray;
                                }
                            }
                            if(memberCatch == 2) {
                                exit = true;
                            }
                        };

                    }
                    Member member = array.get();
                    System.out.println("Details of Member");
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
                System.out.print("Please enter your choice 1 or 2: ");
                int tournamentSearchChoice;
                tournamentSearchChoice = scanner.nextInt();
                if (tournamentSearchChoice == 1) {
                    System.out.println(" Enter Name Of Tournament");
                    String TournyName = scanner.next();
                    MainArray mainArray = new MainArray();
                    TournamentArray tournys = new TournamentArray();
                    Optional<Tournament> array = tournys.selectTournamentByName(TournyName);
                    if (array.isEmpty()) {
                        while (array.isEmpty()){

                            System.out.println("No Tournaments by that name found");
                            System.out.println("------------------");
                            System.out.println("1. Search Tournament by Name");
                            System.out.println("2. Exit");
                            System.out.print("Please enter your choice, 1 or 2: ");
                            int memberCatch = scanner.nextInt();
                            if(memberCatch == 1) {
                                System.out.print("  Enter Tournament Name: ");
                                String catchTournamentName = scanner.next();
                                MainArray catchMainArray = new MainArray();
                                TournamentArray catchTournys = new TournamentArray();
                                Optional<Tournament> catchArray = catchTournys.selectTournamentByName(catchTournamentName);
                                if (catchArray.isPresent()){
                                    array = catchArray;
                                }
                            }
                            if(memberCatch == 2) {
                                exit = true;
                            }
                        };

                    }
                    Tournament tournament = array.get();
                    System.out.println("Details of Tournament");
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
                System.out.print("  Enter member first name: ");
                String memberFirstName = scanner.next();
                System.out.print("  Enter member last name: ");
                String memberLastName = scanner.next();
                System.out.print("  Enter member address: ");
                String memberAddress = scanner.next();
                System.out.print("  Enter member phone number: ");
                String memberPhone = scanner.next();
                System.out.print("  Enter member email: ");
                String memberEmail = scanner.next();
                System.out.print("  Enter Membership membership type: ");
                String membershipType = scanner.next();

                System.out.print("  Enter membership family members: ");
                ArrayList<String>  membershipFamilyMembers= new ArrayList<String>();
                String line = scanner.next();
                String pieces = (Arrays.toString(line.split(",")).replace("[", "").replace("]", ""));
                membershipFamilyMembers.add(pieces);


                System.out.print("  Enter membership duration: ");
                int membershipDuration = scanner.nextInt();
                System.out.print("  Enter membership start date: ");
                String membershipStartDate = scanner.next();

                System.out.print("  Enter current tournaments: ");
                ArrayList<String>  currentTournaments= new ArrayList<String>();
                String line1 = scanner.next();
                String pieces1 = (Arrays.toString(line1.split(",")).replace("[", "").replace("]", ""));
                currentTournaments.add(pieces1);

                System.out.print("  Enter past tournaments: ");
                ArrayList<String>  pastTournaments= new ArrayList<String>();
                String line3 = scanner.next();
                String pieces3 = (Arrays.toString(line3.split(",")).replace("[", "").replace("]", ""));
                pastTournaments.add(pieces3);

                System.out.print("  Enter upcoming tournaments: ");
                ArrayList<String>  upcomingTournaments= new ArrayList<String>();
                String line4 = scanner.next();
                String pieces4 = (Arrays.toString(line4.split(",")).replace("[", "").replace("]", ""));
                upcomingTournaments.add(pieces4);
                String memberName = memberFirstName + " " + memberLastName;



                Member newMem = new Member( memberName, memberAddress, memberEmail, memberPhone, membershipStartDate,
                        (int) membershipDuration, membershipType,  membershipFamilyMembers,  currentTournaments,
                        pastTournaments, upcomingTournaments);

                MemberArray membArray = new MemberArray();
                membArray.insertMember(newMem);
                Optional<Member> array = membArray.selectMemberByName(memberName);
                Member newMember = array.get();
                System.out.print("-----------New Member Added------------------");
                System.out.print("\nMember Name: " + (newMember.getMemberName()));
                System.out.print("\nMember Email: " + newMember.getMemberEmail());
                System.out.print("\nMember Phone Number: " + newMember.getMemberPhone());
                System.out.print("\nMember Address: " + newMember.getMemberAddress());
                System.out.print("\nFamily Members: " + newMember.getMembershipFamilyMembers()) ;
                System.out.print("\nMembership Duration: " + newMember.getMembershipDuration());
                System.out.print("\nMembership Type: " + newMember.getMembershipType());
                System.out.print("\nMembership Start Date: " + newMember.getMembershipStartDate());
                System.out.print("\nPast Tournaments: " + newMember.getPastTournaments());
                System.out.print("\nCurrent Tournament: " + newMember.getCurrentTournaments());
                System.out.print("\nUpcoming Tournaments: " +newMember.getUpcomingTournaments());

            }


            if (choiceInt == 4){
                exit = true;
            }
            }
}
