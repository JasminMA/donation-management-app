package com.donation.management.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@DynamoDBDocument
public class Member {
    private String name; // Name of the family member
    private Date birthDate; // Birth date of the family member
    private String education; // Education level of the family member
    private String employmentDetails; // Details about employment
}
