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
        System.out.println(entity);
        demoRepository.saveDemo(entity);
        System.out.println("created");
    }

    public List<DemoEntity> getDemos() {
        return demoRepository.getDemos();
    }
}