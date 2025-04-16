package db.deploy.demo;

import java.util.Collection;

public interface DemoRepository {

    DemoEntity saveDemo(DemoEntity entity);

    Collection<DemoEntity> getDemos();
}