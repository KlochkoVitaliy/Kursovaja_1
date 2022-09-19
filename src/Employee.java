public class Employee {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    private String fullName;
    private int department;
    private int salary;
    private static int counter;
    private int id;

    //Getter`s
    public int getId() {
        return id;
    }

    public String getfullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    // Setter's

    public void setId(int id) {
        this.id = id;
    }

    public void SetDepartment(int dept) {
        this.department = dept;
    }

    public void setSalary(int sal) {
        this.salary = sal;
    }

    public void raiseSalary(int byPersent) {
        int raise = salary * byPersent / 100;
        salary += raise;
    }

// Constructor

    public Employee(String fio, int dept, int sal) {
        fullName = fio;
        department = dept;
        salary = sal;
        id = ++counter;
    }

    @Override
    public String toString() {
        return  id + ". " +"Ф.И.О. "+ ANSI_YELLOW+ fullName+ANSI_RESET + " Отдел №: " + department + ANSI_GREEN+" Зарплата: "+ANSI_RESET + ANSI_RED+salary+ANSI_RESET + " руб.";
    }

}
