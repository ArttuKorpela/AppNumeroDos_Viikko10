package com.example.appnumerodos;

import java.io.Serializable;

public class User implements Serializable {
    private String firsName = "Arttu";
    private String lastName = "Korpela";
    private String email = "testi@email.com";
    private String degreeProgram = "TITE";
    private int image;

    private String alempiTutkinto;

    private String ylempiTutkinto;

    private String ylinTutkinto;

    private String erikoisMaininnat;



    public User(String firsName, String lastName, String email, String degreeProgram, int image) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.image = image;
    }

    public String getAlempiTutkinto() {
        return alempiTutkinto;
    }

    public String getYlempiTutkinto() {
        return ylempiTutkinto;
    }

    public String getYlinTutkinto() {
        return ylinTutkinto;
    }

    public String getErikoisMaininnat() {
        return erikoisMaininnat;
    }

    public void setAlempiTutkinto(String alempiTutkinto) {
        this.alempiTutkinto = alempiTutkinto;
    }

    public void setYlempiTutkinto(String ylempiTutkinto) {
        this.ylempiTutkinto = ylempiTutkinto;
    }

    public void setYlinTutkinto(String ylinTutkinto) {
        this.ylinTutkinto = ylinTutkinto;
    }

    public void setErikoisMaininnat(String erikoisMaininnat) {
        this.erikoisMaininnat = erikoisMaininnat;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public int getImage() {
        return image;
    }


}
