package Entities;

import Abstract.IEntity;

import java.rmi.Naming;
import java.text.DateFormat;

public class Customer implements IEntity {

    public Customer (int id, String firstName, String lastName, int dateOfBirth, int nationalityId)
    {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        DateOfBirth = dateOfBirth;
        NationalityId = nationalityId;

    }
    public int Id;
    public String FirstName;
    public String LastName;
    public int DateOfBirth;

    public int NationalityId;
}
