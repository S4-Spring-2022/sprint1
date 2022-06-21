package com.keyin.member.Tournament;
import java.util.List;
import java.util.Optional;

public class TournamentService {
    private final TournamentDal tournamentDal;
    public TournamentService(TournamentDal tournamentDal) {this.tournamentDal = tournamentDal;}
    public int addTournament(Tournament tournament ){return tournamentDal.insertTournament(tournament);}

    public List<Tournament> getAllTournaments() {
        return tournamentDal.selectAllTournaments();
    }
    public Optional<Tournament> getTournamentByStartDate(String startDate) {
        return tournamentDal.selectTournamentByStartDate(startDate);
    }
    public Optional<Tournament> getTournamentByLocation(String location) {
        return tournamentDal.selectTournamentByLocation(location);
    }
    public Optional<Tournament> getTournamentByEndDate(String endDate) {
        return tournamentDal.selectTournamentByEndDate(endDate);
    }
}