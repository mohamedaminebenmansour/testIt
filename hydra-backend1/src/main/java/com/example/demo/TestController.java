package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/test")
@CrossOrigin(origins = "*")
public class TestController {
    @Autowired
    private NameRepository repo;

    @GetMapping
    public List<TestName> getNames() { return repo.findAll(); }

    @PostMapping
    public TestName saveName(@RequestBody TestName testName) { return repo.save(testName); }
}