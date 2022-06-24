package Tournament;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class TournamentArray {
        private static List<Tournament> DB = new ArrayList();


        public int insertTournament(Tournament tournament) {
            DB.add(new Tournament( tournament.getTourneyName(), tournament.getStartDate(), tournament.getEndDate(), tournament.getLocation(), tournament.getEntryFee(), tournament.getCashPrizeAmount(), tournament.getParticipatingMembers(), tournament.getFinalStandings()));
            return 1;
        }

        public List<Tournament> selectAllTournaments() {
            return DB;
        }

        public Optional<Tournament> selectTournamentByName(String tourneyName) {
            return DB.stream().filter((tournament) -> tournament.getTourneyName().equals(tourneyName)).findFirst();
        }

        public Optional<Tournament> selectTournamentByStartDate(String startDate) {
            return DB.stream().filter((tournament) -> tournament.getStartDate().equals(startDate)).findFirst();
        }

        public Optional<Tournament> selectTournamentByLocation(String location) {
            return DB.stream().filter((tournament) -> tournament.getLocation().equals(location)).findFirst();
        }

        public Optional<Tournament> selectTournamentByEndDate(String endDate) {
            return DB.stream().filter((tournament) -> tournament.getEndDate().equals(endDate)).findFirst();
        }
    }

