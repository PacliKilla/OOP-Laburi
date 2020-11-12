package com.company;
import java.util.*;

public class Patient extends Person{
    String id;
    Date accepted = new Date();
    String[] presciptions;
    String[] alergies;
    String[] specialReqs;
    String FullName = givenName + middleName + familyName;
    enum gender{
        boy,
        girl
    }
    Date birthDate = new Date();
    String sickness;

}
