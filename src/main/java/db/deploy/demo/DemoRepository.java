package db.deploy.demo;

import java.util.Collection;
import java.util.List;

public interface DemoRepository {

    DemoEntity saveDemo(DemoEntity entity);

    List<DemoEntity> getDemos();
}