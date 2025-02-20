package Voencomat;

public class Commission {
    private Doctor[] doctors;

    public Commission(Doctor[] doctors) {
        this.doctors = doctors;
    }

    public void test(Recruit recruit) {
        for (Doctor doctor : doctors) {
            if (!recruit.isValid()) {
                return; // Если уже не годен, дальше не проверяем
            }
            doctor.test(recruit);
        }
    }

}
