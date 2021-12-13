package yourGame.project10.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_id")
    private int id;

    @Column(name = "game_type")
    private String type;

    @Column(name = "game_place")
    private String place;

    @Column(name = "game_description")
    private String description;

    public Game() {
    }

    public Game(String type, String place, String description) {
        this.type = type;
        this.place = place;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", place='" + place + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
