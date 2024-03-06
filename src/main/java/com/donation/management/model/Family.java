package com.donation.management.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.Date;
import java.util.List;

@DynamoDBTable(tableName = "FamilyTable")
public class Family {
    @DynamoDBHashKey(attributeName = "familyId")

    private String familyId; // Unique identifier for the family
    private String name; // Name of the family or individual
    private int numberOfMembers; // Number of family members
    private String location; // Location of the family
    private List<Member> familyMembers; // Details about family members
    private List<Aid> receivedAid; // List of received aid
    private Date creationDate; // Date of creation
    private Date lastUpdateDate; // Date of last update
    private User createdBy; // User who created the entry
    private User lastUpdatedBy; // User who last updated the entry
    private List<String> fileLocations; // List of file locations (URLs) for uploaded files
    private String notes; // Notes about the family

}
