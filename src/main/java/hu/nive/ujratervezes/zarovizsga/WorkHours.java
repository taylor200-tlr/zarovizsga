package hu.nive.ujratervezes.zarovizsga;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WorkHours {
    private List<Employee> employees = new ArrayList<>();

    public String minWork(String file) {
        Path path = Path.of(file);
        readLine(path);
        String result = getMinWorkedEmployee().getName() + ": " + getMinWorkedEmployee().getWorkDay();
        return result;
    }

    private Employee getMinWorkedEmployee() {
        int minValue = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getWorkedHours() < minValue) {
                result = employee;
                minValue = employee.getWorkedHours();
            }
        }
        return result;
    }

    private void getPathFromFile(String file) {
        // Itt kellene megcsinálnom a Path.of paraméterezését a file eléréséhez
        // pl file splittelése "/" regex mentén
        // ha szükséges ilyen
        // de akkor nem void lenne, hanem path-t adna vissza
        // és azzal lenne meghívva a readline
    }

    private void readLine(Path path) {
        String line;
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            while ((line = reader.readLine()) != null) {
                createEmployeesFromLine(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }

    private void createEmployeesFromLine(String line) {
        String[] data = line.split(",");
        String[] date = data[2].split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        employees.add(new Employee(data[0], Integer.parseInt(data[1]), LocalDate.of(year, month, day)));
    }

    public static void main(String[] args) {
        WorkHours workHours = new WorkHours();
        workHours.minWork("src/test/resources/hu/nive/ujratervezes/zarovizsga/workhours/workhours.txt");
    }
}
