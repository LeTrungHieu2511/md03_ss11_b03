package com.example.md03.controller;

import com.example.md03.dto.PatientDTO;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @PostMapping
    public ResponseEntity<String> addPatient(@Valid @RequestBody PatientDTO dto) {
        log.info("Tiếp nhận bệnh nhân: {}", dto.getName());

        if (dto.getAge() != null && dto.getAge() > 120) {
            log.warn("Tuổi bệnh nhân bất thường: {} (tên: {})", dto.getAge(), dto.getName());
        }

        return ResponseEntity.status(HttpStatus.CREATED).body("Thêm bệnh nhân thành công");
    }
}