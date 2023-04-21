package gg.fourstack.api.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class StatLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne (cascade = CascadeType.REMOVE)
    @JoinColumn(name = "player_id", referencedColumnName = "id")
    private Player player;

    @ManyToOne
    @JoinColumn(name = "game_id", referencedColumnName = "id")
    @JsonBackReference
    private Game game;

    @Column(nullable = false)
    private Integer kills;

    @Column(nullable = false)
    private Integer deaths;

    @Column(nullable = false)
    private int assists;

    @Column(name = "non_traded_kills", nullable = true)
    private int nonTradedKills;

    @Column(name = "highest_streak", nullable = true)
    private int highestStreak;

    @Column(name = "hill_time", nullable = true)
    private Integer hillTime;

    @Column(name = "contested_hill_time", nullable = true)
    private Integer contestedHillTime;

    @Column(name = "first_bloods", nullable = true)
    private Integer firstBloods;

    @Column(name = "zone_captures", nullable = true)
    private Integer zoneCaptures;

    @Column(name = "zone_tier_captures", nullable = true)
    private Integer zoneTierCaptures;

    @Column(nullable = true)
    private Integer defends;

    @Column(nullable = true)
    private Integer damage;

    @Column(nullable = true)
    private Integer plants;

    @Column(nullable = true)
    private Integer defuses;

    public StatLine() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getHillTime() {
        return hillTime;
    }

    public void setHillTime(Integer hillTime) {
        this.hillTime = hillTime;
    }

    public Integer getFirstBloods() {
        return firstBloods;
    }

    public void setFirstBloods(Integer firstBloods) {
        this.firstBloods = firstBloods;
    }

    public Integer getDefends() {
        return defends;
    }

    public void setDefends(Integer defends) {
        this.defends = defends;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getPlants() {
        return plants;
    }

    public void setPlants(Integer plants) {
        this.plants = plants;
    }

    public Integer getDefuses() {
        return defuses;
    }

    public void setDefuses(Integer defuses) {
        this.defuses = defuses;
    }
}

