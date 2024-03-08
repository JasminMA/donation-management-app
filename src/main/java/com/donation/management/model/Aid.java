package com.donation.management.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@DynamoDBDocument
public class Aid {
    private double amount; // Amount of money received
    private Date date; // Date of receiving the aid
    private User addedBy;
}
