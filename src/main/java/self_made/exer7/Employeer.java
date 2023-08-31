package self_made.exer7;

public class Employeer {
    private static int id = 0;
    private String name;
    private int salary;

    public Employeer(String name, int salary) {
        this.name = name;
        this.salary = salary;
        id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employeer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
