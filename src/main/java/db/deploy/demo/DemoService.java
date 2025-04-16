package db.deploy.demo;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class DemoService {

    private DemoRepository demoRepository;

    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    public void sendText(String text) {
        DemoEntity entity = new DemoEntity(text);
        demoRepository.saveDemo(entity);
    }

    public List<DemoEntity> getDemos() {
        return demoRepository.getDemos();
    }
}