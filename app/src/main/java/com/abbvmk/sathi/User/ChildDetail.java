
package com.abbvmk.sathi.User;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ChildDetail implements Serializable {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("dob")
    @Expose
    private String dob;
    @SerializedName("marital_status")
    @Expose
    private String maritalStatus;
    @SerializedName("occupation")
    @Expose
    private String occupation;
    @SerializedName("qualification")
    @Expose
    private String qualification;
    @SerializedName("_id")
    @Expose
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void validate() throws UserValidationException {
        if (name == null || name.length() == 0) {
            throw new UserValidationException("Name cannot be empty");
        } else if (dob == null || dob.length() == 0) {
            throw new UserValidationException("Date of Birth cannot be empty");
        } else if (maritalStatus == null || maritalStatus.length() == 0) {
            throw new UserValidationException("Marital Status cannot be empty");
        } else if (qualification == null || qualification.length() == 0) {
            throw new UserValidationException("Qualification cannot be empty");
        } else if (occupation == null || occupation.length() == 0) {
            throw new UserValidationException("Occupation cannot be empty");
        }
    }

}
