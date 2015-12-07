package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by timmygilissen on 7/12/15.
 */
@Entity
public class Status {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}
