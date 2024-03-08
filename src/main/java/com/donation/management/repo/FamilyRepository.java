package com.donation.management.repo;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.donation.management.model.Family;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class FamilyRepository {

    private final DynamoDBMapper dynamoDBMapper;

    public Family save(Family family) {
        dynamoDBMapper.save(family);
        return family;
    }

    public Optional<Family> findById(String familyId) {
        Family family = dynamoDBMapper.load(Family.class, familyId);
        return Optional.ofNullable(family);
    }

    public List<Family> getAllFamilies(){
        DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();
        return dynamoDBMapper.scan(Family.class, scanExpression);
    }
}
