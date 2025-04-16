package db.deploy.demo;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DemoService {

    private DemoRepository demoRepository;

    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    public void sendText(String text) {
        DemoEntity entity = new DemoEntity(text);
        DemoEntity created = demoRepository.saveDemo(entity);
        System.out.println(created);
    }

    public Collection<DemoEntity> getDemos() {
        return demoRepository.getDemos();
    }
}