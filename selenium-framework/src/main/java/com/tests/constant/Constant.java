package com.tests.constant;

public enum Constant {
    USERNAME("username"), PASSWORD("password"),
    FULLNAME("fullname"),
    FORMAT_HYPEN_YYYY_MM_DD("yyyy-MM-dd"),
    DATAFILE_BASE_PATH("dataseeding/csv"), SCHEMA_BASE_PATH("dataseeding/schema"), UPGRADE_ALL("UPGRADE_ALL"),CLASS_NAME("CLASS_NAME"),
    FORWARD_SLASH("/"), EMPTY(""),
     CSV(".csv"),
     NAME("name"), EVENT_NAME("eventName"), PERSON_NUM("person_number"),ID("id"), PROPVALUE("propertyValue"),
/////////////////////
    
    KEY("Key"), 
    FIRSTNAME("customerfirstname"), LASTNAME("customerlastname"), EMAIL("email"), 
    COMPANY("companyDetails"), ADDRESS1("addresspoint1"), ADDRESS2("addresspoint2"),CITY("citydetails"),
    STATE("statedetails"),ADDITIONAL_INFO("additionalinfo"),PHONE("phone"),MOBILE("mobile"),ALIAS("alias"),
    POSTCODE("postcode"),LOGINHEADER("headerverification"),DRESS_NAME("dress"),COLOR("color"),SIZE("size"),
    DAY("day"), MONTH("month"), YEAR("year"),;
        
//////////////////    

    

    private final String value;

    private Constant(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }
}