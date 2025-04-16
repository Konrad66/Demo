package db.deploy.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

@Primary
public interface DemoJPARepository extends JpaRepository<DemoEntity, Integer>, DemoRepository {
    @Override
    default DemoEntity saveDemo(DemoEntity entity) {
        return save(entity);
    }

    @Override
    default Collection<DemoEntity> getDemos() {
        return findAll();
    }
}