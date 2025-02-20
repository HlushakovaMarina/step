package Voencomat;

public class Commission {
    private Doctor[] doctors;

    public Commission(Doctor[] doctors) {
        this.doctors = doctors;
    }

    public void test(Recruit recruit) {
        for (Doctor doctor : doctors) {
            if (!recruit.isValid()) {
                return;
            }
            doctor.test(recruit);
        }
    }

}
