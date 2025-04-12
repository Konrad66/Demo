package db.deploy.demo;

import java.util.Collection;

public interface DemoRepository {

    void saveDemo(DemoEntity entity);

    Collection<DemoEntity> getDemos();
}