package gg.fourstack.api.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne (optional = false)
    @JoinColumn (name = "team_one_id", referencedColumnName = "id", nullable = false)
    private Team teamOne;

    @ManyToOne (optional = false)
    @JoinColumn (name = "team_two_id", referencedColumnName = "id", nullable = false)
    private Team teamTwo;

    @Column (name = "date", nullable = false)
    private LocalDate date;

    @Column (name = "event", nullable = false)
    private String event;


    public Match() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Team getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(Team teamOne) {
        this.teamOne = teamOne;
    }

    public Team getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(Team teamTwo) {
        this.teamTwo = teamTwo;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
