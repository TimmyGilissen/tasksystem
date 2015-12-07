package Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by timmygilissen on 7/12/15.
 */

@Entity
public class TaskDefintion {

    @Id
    @GeneratedValue
    private Long id;

    private String number;

    public TaskDefintion(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public Long getId() {
        return id;
    }
}
