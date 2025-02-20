package Voencomat;

import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            // Создаем комиссию, заполняем её врачами.
            Doctor[] doctors = {new Dentist(), new Oculist(), new Surgeon(), new Psychiatrist(), new Therapist()};
            Commission commission = new Commission(doctors);

            // Генерируем 1000 новобранцев с случайными параметрами.
            RecruitGenerator generator = new RecruitGenerator();
            ArrayRecruits allRecruits = new ArrayRecruits(1000);
            for (int i = 0; i < 1000; i++) {
                allRecruits.add(generator.generate());
            }

            // Проверяем каждого новобранца на годность и распределяем их по соответствующим массивам.
            List<Recruit> validRecruits = new ArrayList<>();
            List<Recruit> invalidRecruits = new ArrayList<>();
            for (int i = 0; i < allRecruits.getSize(); i++) {
                Recruit recruit = allRecruits.get(i);
                commission.test(recruit);
                if (recruit.isValid()) {
                    validRecruits.add(recruit);
                } else {
                    invalidRecruits.add(recruit);
                }
            }

            // Выводим на экран количество годных новобранцев и их ФИО, а также не годных с диагнозами.
            System.out.println("Количество годных новобранцев: " + validRecruits.size());
            validRecruits.forEach(System.out::println);

            System.out.println("\\nКоличество не годных новобранцев: " + invalidRecruits.size());
            invalidRecruits.forEach(System.out::println);
        }

    }
