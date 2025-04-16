package db.deploy.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

@Primary
public interface DemoJPARepository extends JpaRepository<DemoEntity, Integer>, DemoRepository {
    @Override
    default void saveDemo(DemoEntity entity) {
        save(entity);
    }

    @Override
    default Collection<DemoEntity> getDemos() {
        return findAll();
    }
}