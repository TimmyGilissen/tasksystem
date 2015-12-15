package tasksystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by timmygilissen on 15/12/15.
 */

@Entity
public class Skill {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    public Skill(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
