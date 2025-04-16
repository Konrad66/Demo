package db.deploy.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class DemoCustomRepository implements DemoRepository {

    private List<DemoEntity> entities = new ArrayList<>();

    @Override
    public DemoEntity saveDemo(DemoEntity entity) {
        entities.add(entity);
        System.out.println(entities);
        return entity;
    }

    @Override
    public Collection<DemoEntity> getDemos() {
        return entities;
    }
}