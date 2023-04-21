package gg.fourstack.api.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Game {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn (name = "match_id", referencedColumnName = "id")
    private Match match;

    @ManyToOne (optional = false)
    @JoinColumn (name = "map_type_id", referencedColumnName = "id", nullable = false)
    private GameType gameType;

    @ManyToOne (optional = false)
    @JoinColumn (name = "map_id", referencedColumnName = "id", nullable = false)
    private Map map;

    @ElementCollection
    @CollectionTable(name = "game_scores", joinColumns = @JoinColumn(name = "game_id"))
    @Column(name = "score")
    private List<Integer> score;

    @OneToMany (mappedBy = "game")
    @JsonManagedReference
    private List<StatLine> statLines;

    public Game() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List<Integer> getScore() {
        return score;
    }

    public void setScore(List<Integer> score) {
        this.score = score;
    }

    public List<StatLine> getStatLines() {
        return statLines;
    }

    public void setStatLines(List<StatLine> statLines) {
        this.statLines = statLines;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
}
