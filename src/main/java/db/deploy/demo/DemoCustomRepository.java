package db.deploy.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class DemoCustomRepository implements DemoRepository {

    private List<DemoEntity> entities = new ArrayList<>();

    @Override
    public void saveDemo(DemoEntity entity) {
        entities.add(entity);
        System.out.println(entities);
    }

    @Override
    public List<DemoEntity> getDemos() {
        return entities;
    }
}