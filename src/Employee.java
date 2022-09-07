public class Employee {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    private String FIO;
    private int Department;
    private int Salary;
    private static int Counter;
    private int Id;

    //Getter`s
    public int getId() {
        return Id;
    }

    public String getFIO() {
        return this.FIO;
    }

    public int getDepartment() {
        return this.Department;
    }

    public int getSalary() {
        return this.Salary;
    }

    // Setter's

    public void setId(int id) {
        this.Id = id;
    }

    public void SetDepartment(int dept) {
        this.Department = dept;
    }

    public void SetSalary(int sal) {
        this.Salary = sal;
    }

    public void raiseSalary(int byPersent) {
        int raise = Salary * byPersent / 100;
        Salary += raise;
    }

// Constructor

    public Employee(String fio, int dept, int salary) {
        FIO = fio;
        Department = dept;
        Salary = salary;
        Id = ++Counter;
    }

    @Override
    public String toString() {
        return  Id + ". " +"Ф.И.О. "+ ANSI_YELLOW+ FIO+ANSI_RESET + " Отдел №: " + Department + ANSI_GREEN+" Зарплата: "+ANSI_RESET + ANSI_RED+Salary+ANSI_RESET + " руб.";
    }

}
