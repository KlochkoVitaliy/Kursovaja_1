public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static String resultFioFIO(Employee[] employee) {
        double tmpId = 0;
        String tmp = employee[0].getfullName();
        for (int i = 1; i < employee.length; i++) {
            tmpId = employee[i].getId();
            System.out.println(employee[i].getfullName());
        }
        return tmp;
    }

    public static int resultFio(Employee[] employee) {
        for (int i = 0; i < employee.length; i++)
            System.out.println(employee[i].toString());
        return 0;
    }

    public static String resultFioToString(Employee[] employee, int id) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getId() == id) {
                return employee[i].toString();
            }
        }
        return "none";
    }

    public static int salarySum(Employee[] employee) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        return sum;
    }

    public static int salaryMin(Employee[] employee) {
        int tmpId = 0;
        double tmp = employee[0].getSalary();
        for (int i = 1; i < employee.length; i++) {
            if (tmp > employee[i].getSalary()) {
                tmpId = employee[i].getId();
                tmp = employee[i].getSalary();
            }
        }
        return tmpId;
    }

    public static int salaryMax(Employee[] employee) {
        int tmpId = 0;
        int tmp = employee[0].getSalary();
        for (int i = 1; i < employee.length; i++) {
            if (tmp < employee[i].getSalary()) {
                tmpId = employee[i].getId();
                tmp = employee[i].getSalary();
            }
        }
        return tmpId;
    }

    public static int salaryAverage(Employee[] employee) {
        return salarySum(employee) / employee.length;
    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];

        employee[0] = new Employee("Иван Иванович",EmployeeUtil.getRandomNo(1,5),EmployeeUtil.getRandomNo(100,50000));
        employee[1] = new Employee("Иван Васильевич", EmployeeUtil.getRandomNo(1,5),EmployeeUtil.getRandomNo(100,50000));
        employee[2] = new Employee("Василий Васильевич", EmployeeUtil.getRandomNo(1,5),EmployeeUtil.getRandomNo(100,50000));
        employee[3] = new Employee("Вазген Васильевич", EmployeeUtil.getRandomNo(1,5),EmployeeUtil.getRandomNo(100,50000));
        employee[4] = new Employee("Виктор Владленович", EmployeeUtil.getRandomNo(1,5),EmployeeUtil.getRandomNo(100,50000));
        employee[5] = new Employee("Дарья Ивановна", EmployeeUtil.getRandomNo(1,5),EmployeeUtil.getRandomNo(100,50000));
        employee[6] = new Employee("Сирафима Ильинишна", EmployeeUtil.getRandomNo(1,5),EmployeeUtil.getRandomNo(100,50000));
        employee[7] = new Employee("Олеся Олеговна", EmployeeUtil.getRandomNo(1,5),EmployeeUtil.getRandomNo(100,50000));
        employee[8] = new Employee("Давид Тания", EmployeeUtil.getRandomNo(1,5),EmployeeUtil.getRandomNo(100,50000));
        employee[9] = new Employee("Конор Макгрегор", EmployeeUtil.getRandomNo(1,5),EmployeeUtil.getRandomNo(100,50000));

        System.out.println();
        //Task a
        System.out.println(ANSI_GREEN + "Cписок всех сотрудников со всеми имеющимися по ним данными" + ANSI_RESET);
        System.out.println();
        System.out.println(resultFio(employee));
        System.out.println();
        //Task b
        System.out.println(ANSI_GREEN + "Сумма затрат на зарплаты в месяц =" + ANSI_RESET + ANSI_RED + salarySum(employee) + ANSI_RESET+" руб.");
        System.out.println();
        //Task c
        System.out.println(ANSI_GREEN + "Сотрудник с MIN зарплатой -  " + ANSI_RESET + resultFioToString(employee, salaryMin(employee)));
        System.out.println();
        //Task d
        System.out.println(ANSI_GREEN + " Сотрудник с MAX зарплатой -   " + ANSI_RESET + resultFioToString(employee, salaryMax(employee)));
        System.out.println();
        //Task e
        System.out.println(ANSI_GREEN + "Средняя зарплата в месяц = " + ANSI_RESET + ANSI_RED + salaryAverage(employee) + ANSI_RESET+" руб.");
        System.out.println();
        //Task f
        System.out.println(ANSI_GREEN + "Ф.И.О. сотрудника:   " + ANSI_RESET);
        System.out.println(resultFioFIO(employee));
    }
}



