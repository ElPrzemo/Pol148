package self_made.exer7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws Exception {

        List<Employeer> employees = new ArrayList<>();

        Employeer employee = new Employeer("Robert", 3004);
        Employeer employee2 = new Employeer("Kazik", 2400);
        Employeer employee3 = new Employeer("Wiesiek", 5000);
        Employeer employee4 = new Employeer("Marek", 4500);

        employees.add(employee);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        Optional<Employeer> moreThan3KSalary = employees.stream()
                .filter(e -> e.getSalary() > 3000)
                .findFirst();

        Employeer theRichest = moreThan3KSalary.orElseThrow(() -> new RuntimeException("No employees with that salary"));
        System.out.println("The first employer with salary aboce 3000 thousand: " + theRichest.toString());

        List<Employeer> sortedNames = employees.stream()
                .sorted(Comparator.comparing(Employeer::getName))
                .collect(Collectors.toList());

        for (Employeer e: sortedNames) {
            System.out.println(e);
        }

        int totalSalary = employees.stream()
                .map(employeer -> employeer.getSalary())
                .reduce((a,b)->a+b)
                .get();

        System.out.println("Total salary of all employers is:" + totalSalary);



        int highestSalary = employees.stream()
                .max(Comparator.comparing(Employeer::getSalary))
                .get().getSalary();

        System.out.println("The highest salary of all employer is: " + highestSalary);

    }

}

