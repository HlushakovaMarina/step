package Voencomat;

import java.util.Random;

interface Doctor {
    boolean test(Recruit recruit);
}

class Dentist implements Doctor {
    @Override
    public boolean test(Recruit recruit) {
        if (recruit.getImplantCount() <= 1) {
            return true;
        } else {
            recruit.setValid(false);
            recruit.setDiagnosis("Много зубных протезов");
            return false;
        }
    }
}

class Oculist implements Doctor {
    @Override
    public boolean test(Recruit recruit) {
        double vision = recruit.getVisionCoeff();
        if (vision >= 0.8 && vision <= 1.2) {
            return true;
        } else {
            recruit.setValid(false);
            recruit.setDiagnosis("Плохое зрение");
            return false;
        }
    }
}

class Surgeon implements Doctor {
    @Override
    public boolean test(Recruit recruit) {
        if (recruit.hasFlatFeet()) {
            recruit.setValid(false);
            recruit.setDiagnosis("Плоскостопие");
            return false;
        } else {
            return true;
        }
    }
}

class Psychiatrist implements Doctor {
    private Random random = new Random();

    @Override
    public boolean test(Recruit recruit) {
        boolean valid = random.nextBoolean();
        if (!valid) {
            recruit.setValid(false);
            recruit.setDiagnosis("Психическое расстройство (определено случайно)");
        }
        return valid;
    }
}

class Therapist implements Doctor {
    @Override
    public boolean test(Recruit recruit) {
        int cardiogram = recruit.getCardiogram();
        if (cardiogram < 60 || cardiogram > 100) {
            recruit.setValid(false);
            recruit.setDiagnosis("Проблемы с сердцем");
            return false;
        } else {
            return true;
        }
    }
}
