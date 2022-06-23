package DataInsertion;

import Tournament.Tournament;
import Tournament.TournamentArray;
import com.keyin.member.Member;
import com.keyin.member.MemberArray;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainArray {
    public MainArray() {
        Member m1 = new Member("Nicholas Dobbin",
                "somewhereStreet Whitbourne",
                "dobbszerker@gmail.com",
                "7091231234",
                "2020-02-21",
                5,
                "family",
                new ArrayList(Arrays.asList("Nicholas Dobbin", "Da missus")),
                new ArrayList(Arrays.asList("Golf 2022")),
                new ArrayList(Arrays.asList("Golf 2021")),
                new ArrayList(Arrays.asList("Golf 2023")));


        Member m2 = new Member("Da missus",
                "somewhereStreet Whitbourne",
                "damissus@gmail.com",
                "7091231235",
                "2020-02-21",
                5,
                "family",
                new ArrayList(Arrays.asList("Da missus", "Nicholas Dobbin")),
                new ArrayList(Arrays.asList("Golf 2022")),
                new ArrayList(Arrays.asList("Golf 2021")),
                new ArrayList(Arrays.asList("Golf 2023")));


        Member m3 = new Member("Johnathon Dunne",
                "randomStreet st.johns",
                "John@gmail.com",
                "7091231236",
                "2019-02-21",
                6,
                "normal",
                new ArrayList(Arrays.asList("")),
                new ArrayList(Arrays.asList("Golf 2022")),
                new ArrayList(Arrays.asList("Golf 2021", "Golf 2019")),
                new ArrayList(Arrays.asList("Golf 2023")));


        Member m4 = new Member("Shane Dwyer",
                "someotherStreet st.johns",
                "Shane@gmail.com",
                "7091231237",
                "2022-02-21",
                1,
                "trial",
                new ArrayList(Arrays.asList("")),
                new ArrayList(Arrays.asList("Golf 2022")),
                new ArrayList(Arrays.asList("")),
                new ArrayList(Arrays.asList("Golf 2023")));



        MemberArray membArray = new MemberArray();
        membArray.insertMember(m1);
        membArray.insertMember(m2);
        membArray.insertMember(m3);
        membArray.insertMember(m4);

        Tournament t1 = new Tournament("2019", "2020", "St.johns NL",60.50,450.00, new ArrayList(Arrays.asList("Johnathon Dunne")),new ArrayList(Arrays.asList("Johnathon Dunne", "Random man from alberta", "random woman from Quebec", "random man from Toronto")));
        Tournament t2 = new Tournament("2020", "2021", "Quebec City, QC",70.00,500.00, new ArrayList(Arrays.asList("Johnathon Dunne")),new ArrayList(Arrays.asList("Johnathon Dunne", "Random man from alberta", "random woman from Quebec", "random man from Toronto")));
        Tournament t3 = new Tournament("2021", "2022", "Edmonton, AB ",50.00,300.00, new ArrayList(Arrays.asList("Johnathon Dunne", "Nicholas Dobbin", "Da missus")),new ArrayList(Arrays.asList("Johnathon Dunne", "Random man from alberta","Nicholas Dobbin", "random woman from Quebec","Da missus", "random man from Toronto")));
        Tournament t4 = new Tournament("2022", "2023", "Toronto, ON",150.00,2500.00, new ArrayList(Arrays.asList("Johnathon Dunne", "Nicholas Dobbin", "Da missus", "Shane Dwyer")),new ArrayList(Arrays.asList("Johnathon Dunne", "Random man from alberta","Nicholas Dobbin", "random woman from Quebec","Da Missus", "random man from Toronto", "Shane Dwyer")));
        Tournament t5 = new Tournament("2023", "", "St.Johns, NL",175.00,2700.00, new ArrayList(Arrays.asList("Johnathon Dunne", "Nicholas Dobbin", "Da missus", "Shane Dwyer")),new ArrayList(Arrays.asList("")));

        TournamentArray tournamentArray = new TournamentArray();
        tournamentArray.insertTournament(t1);
        tournamentArray.insertTournament(t2);
        tournamentArray.insertTournament(t3);
        tournamentArray.insertTournament(t4);
        tournamentArray.insertTournament(t5);


    }

//    public MemberArray MainMemberArray() {
//        Member m1 = new Member("Nicholas Dobbin",
//                "somewhereStreet Whitbourne",
//                "dobbszerker@gmail.com",
//                "7091231234",
//                "2020-02-21",
//                5,
//                "family",
//                new ArrayList(Arrays.asList("Nicholas Dobbin", "Da missus")),
//                new ArrayList(Arrays.asList("Golf 2022")),
//                new ArrayList(Arrays.asList("Golf 2021")),
//                new ArrayList(Arrays.asList("Golf 2023")));
//
//
//        Member m2 = new Member("Da missus",
//                "somewhereStreet Whitbourne",
//                "damissus@gmail.com",
//                "7091231235",
//                "2020-02-21",
//                5,
//                "family",
//                new ArrayList(Arrays.asList("Da missus", "Nicholas Dobbin")),
//                new ArrayList(Arrays.asList("Golf 2022")),
//                new ArrayList(Arrays.asList("Golf 2021")),
//                new ArrayList(Arrays.asList("Golf 2023")));
//
//
//        Member m3 = new Member("Johnathon Dunne",
//                "randomStreet st.johns",
//                "John@gmail.com",
//                "7091231236",
//                "2019-02-21",
//                6,
//                "normal",
//                new ArrayList(Arrays.asList("")),
//                new ArrayList(Arrays.asList("Golf 2022")),
//                new ArrayList(Arrays.asList("Golf 2021", "Golf 2019")),
//                new ArrayList(Arrays.asList("Golf 2023")));
//
//
//        Member m4 = new Member("Shane Dwyer",
//                "someotherStreet st.johns",
//                "Shane@gmail.com",
//                "7091231237",
//                "2022-02-21",
//                1,
//                "trial",
//                new ArrayList(Arrays.asList("")),
//                new ArrayList(Arrays.asList("Golf 2022")),
//                new ArrayList(Arrays.asList("")),
//                new ArrayList(Arrays.asList("Golf 2023")));
//
//
//
//        MemberArray membArray = new MemberArray();
//        membArray.insertMember(m1);
//        membArray.insertMember(m2);
//        membArray.insertMember(m3);
//        membArray.insertMember(m4);
//
//        return membArray;
//
//
//
//
//
//    }
//
//    public TournamentArray MainTournamentArray() {
//        Tournament t1 = new Tournament("2019", "2020", "St.johns NL",60.50,450.00, new ArrayList(Arrays.asList("Johnathon Dunne")),new ArrayList(Arrays.asList("Johnathon Dunne", "Random man from alberta", "random woman from Quebec", "random man from Toronto")));
//        Tournament t2 = new Tournament("2020", "2021", "Quebec City, QC",70.00,500.00, new ArrayList(Arrays.asList("Johnathon Dunne")),new ArrayList(Arrays.asList("Johnathon Dunne", "Random man from alberta", "random woman from Quebec", "random man from Toronto")));
//        Tournament t3 = new Tournament("2021", "2022", "Edmonton, AB ",50.00,300.00, new ArrayList(Arrays.asList("Johnathon Dunne", "Nicholas Dobbin", "Da missus")),new ArrayList(Arrays.asList("Johnathon Dunne", "Random man from alberta","Nicholas Dobbin", "random woman from Quebec","Da missus", "random man from Toronto")));
//        Tournament t4 = new Tournament("2022", "2023", "Toronto, ON",150.00,2500.00, new ArrayList(Arrays.asList("Johnathon Dunne", "Nicholas Dobbin", "Da missus", "Shane Dwyer")),new ArrayList(Arrays.asList("Johnathon Dunne", "Random man from alberta","Nicholas Dobbin", "random woman from Quebec","Da Missus", "random man from Toronto", "Shane Dwyer")));
//        Tournament t5 = new Tournament("2023", "", "St.Johns, NL",175.00,2700.00, new ArrayList(Arrays.asList("Johnathon Dunne", "Nicholas Dobbin", "Da missus", "Shane Dwyer")),new ArrayList(Arrays.asList("")));
//
//        TournamentArray tournamentArray = new TournamentArray();
//        tournamentArray.insertTournament(t1);
//        tournamentArray.insertTournament(t2);
//        tournamentArray.insertTournament(t3);
//        tournamentArray.insertTournament(t4);
//        tournamentArray.insertTournament(t5);
//
//        return tournamentArray;
//    }


    }
//}
//
//
//    public static void main(String[]args){
//
//};