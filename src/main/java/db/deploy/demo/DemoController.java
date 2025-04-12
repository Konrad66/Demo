package db.deploy.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class DemoController {

    private DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @PostMapping("/demo")
    public void sendDemo(String text){
        demoService.sendText(text);
    }

    @GetMapping("/demo")
    public Collection<DemoEntity> getDemos(){
        return demoService.getDemos();
    }
}