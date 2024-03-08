package com.donation.management.controller;

import com.donation.management.model.Family;
import com.donation.management.service.FamilyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/families")
public class FamilyController {

    private final FamilyService familyService;

    @PostMapping
    public ResponseEntity<Family> createFamily(@RequestBody Family family) {
        Family createdFamily = familyService.createFamily(family);
        return new ResponseEntity<>(createdFamily, HttpStatus.CREATED);
    }

    @GetMapping("/{familyId}")
    public ResponseEntity<Family> getFamilyById(@PathVariable String familyId) {
        Family family = familyService.getFamilyById(familyId);
        if (family != null) {
            return new ResponseEntity<>(family, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<Family>> getAllFamilies() {
        List<Family> families = familyService.getAllFamilies();
        return new ResponseEntity<>(families, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Family> updateFamily(@RequestBody Family familyDetails) {
        Family updatedFamily = familyService.updateFamily(familyDetails);
        if (updatedFamily != null) {
            return new ResponseEntity<>(updatedFamily, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}