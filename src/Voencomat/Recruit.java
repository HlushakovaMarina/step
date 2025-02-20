package Voencomat;

public class Recruit {
    private static int nextId = 1;
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private boolean valid;
    private String diagnosis;
    private double visionCoeff;
    private boolean flatFeet;
    private int implantCount;
    private int cardiogram;

    public Recruit(String firstName, String middleName, String lastName, double visionCoeff, boolean flatFeet, int implantCount, int cardiogram) {
        this.id = nextId++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.visionCoeff = visionCoeff;
        this.flatFeet = flatFeet;
        this.implantCount = implantCount;
        this.cardiogram = cardiogram;
        this.valid = true;
        this.diagnosis = null;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public double getVisionCoeff() {
        return visionCoeff;
    }

    public boolean hasFlatFeet() {
        return flatFeet;
    }

    public int getImplantCount() {
        return implantCount;
    }

    public int getCardiogram() {
        return cardiogram;
    }

    @Override
    public String toString() {
        if (valid) {
            return lastName + " " + firstName + " " + middleName + " — годен";
        } else {
            return lastName + " " + firstName + " " + middleName + " — не годен (" + diagnosis + ")";
        }
    }
}

