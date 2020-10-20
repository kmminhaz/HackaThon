package com.example.xhospitalofbangladesh;

public class Doctor_info_Holder {
    String DrName,DrSpeciality,DrNumber,DrDetails;

    public Doctor_info_Holder(String drName, String drSpeciality, String drNumber, String drDetails) {
        DrName = drName;
        DrSpeciality = drSpeciality;
        DrNumber = drNumber;
        DrDetails = drDetails;
    }

    public String getDrName() {
        return DrName;
    }

    public void setDrName(String drName) {
        DrName = drName;
    }

    public String getDrSpeciality() {
        return DrSpeciality;
    }

    public void setDrSpeciality(String drSpeciality) {
        DrSpeciality = drSpeciality;
    }

    public String getDrNumber() {
        return DrNumber;
    }

    public void setDrNumber(String drNumber) {
        DrNumber = drNumber;
    }

    public String getDrDetails() {
        return DrDetails;
    }

    public void setDrDetails(String drDetails) {
        DrDetails = drDetails;
    }
}
