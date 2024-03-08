package com.donation.management.service;


import com.donation.management.model.Family;
import com.donation.management.repo.FamilyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FamilyService{

    private final FamilyRepository familyRepository;

    public Family createFamily(Family family) {
        return familyRepository.save(family);
    }

    public Family getFamilyById(String familyId) {
        return familyRepository.findById(familyId).orElse(null);
    }

    public Family updateFamily(Family family) {
        return familyRepository.save(family);
    }

    public List<Family> getAllFamilies() {
        return familyRepository.getAllFamilies();
    }
}