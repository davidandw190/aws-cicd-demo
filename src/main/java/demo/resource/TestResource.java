package demo.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path = "/test")
public class TestResource {

    @GetMapping
    public ResponseEntity<Map<String, String>> testDemo() {
        return ResponseEntity.ok().body(Map.of("testing", "up and runnning.."));
    }
}
