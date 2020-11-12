package com.company;

import java.util.Date;

public class Person {
    String title;
    String givenName;
    String middleName;
    String familyName;
    enum gender{
        boy,
        girl
    }
    Date birthDate = new Date();
    String FullName = givenName + middleName + familyName;
    String Address;
    String phone;

}
