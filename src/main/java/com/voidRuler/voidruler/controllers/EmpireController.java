package com.voidRuler.voidruler.controllers;

import com.voidRuler.voidruler.entities.Empire;
import com.voidRuler.voidruler.repositories.EmpireRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empires")
public class EmpireController {
    private final EmpireRepository empireRepository;

    public EmpireController(EmpireRepository empireRepository) {
        this.empireRepository = empireRepository;
    }

    @GetMapping
    public List<Empire> getEmpires() {
        return empireRepository.findAll();
    }

    @PostMapping
    public Empire addEmpire(@RequestBody Empire empire) {
        return empireRepository.save(empire);
    }
}
