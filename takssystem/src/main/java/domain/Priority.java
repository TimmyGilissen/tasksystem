package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by timmygilissen on 7/12/15.
 */

@Entity
public class Priority {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int orderValue;

    public Priority(String name, int orderValue) {
        this.name = name;
        this.orderValue = orderValue;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getOrderValue() {
        return orderValue;
    }
}
