package hu.nive.ujratervezes.zarovizsga;

import java.time.LocalDate;

public class Employee {
    private String name;
    private int workedHours;
    private LocalDate workDay;

    public Employee(String name, int workedHours, LocalDate workDay) {
        this.name = name;
        this.workedHours = workedHours;
        this.workDay = workDay;
    }

    public String getName() {
        return name;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public LocalDate getWorkDay() {
        return workDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", workedHours=" + workedHours +
                ", workDay=" + workDay +
                '}';
    }
}
