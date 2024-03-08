package com.donation.management.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@DynamoDBDocument
public class User {
    private String userId;
    private String userName;
    private Date lastLogin;
}
