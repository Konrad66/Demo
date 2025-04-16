package db.deploy.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

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
    public List<DemoEntity> getDemos(){
        return demoService.getDemos();
    }

    @GetMapping("/demo2")
    public DemoEntity getDemo(){
        return new DemoEntity("hej");
    }
}