package db.deploy.demo;

public class DemoEntity {

    private String text;

    public DemoEntity(String text) {
        this.text = text;
    }

    public DemoEntity() {
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "DemoEntity{" +
                "text='" + text + '\'' +
                '}';
    }
}