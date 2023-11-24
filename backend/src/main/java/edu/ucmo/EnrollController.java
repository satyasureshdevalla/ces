package edu.ucmo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EnrollController {
    @Autowired
    private EnrollRepository enrollRepository;

    @GetMapping("/enrolls")
    public List<Enroll> getAllEnrolls(){
        return enrollRepository.findAll();
    }
}
