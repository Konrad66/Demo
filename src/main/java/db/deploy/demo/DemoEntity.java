package db.deploy.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class DemoEntity {

    @Id
    @GeneratedValue
    private int id;
    private String text;

    public DemoEntity(String text) {
        this.text = text;
    }

    public DemoEntity() {
    }

    public String getText() {
        return text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "DemoEntity{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}