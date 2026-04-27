package coursework;

public class courswork1 {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();
        String[] fullNameEmployee = {"Иванов Иван Иванович", "Петрова Мария Сергеевна",
           "Сидоров Алексей Владимирович", "Козлова Екатерина Дмитриевна", "Смирнов Михаил Александрович",
           "Попова Анна Николаевна", "Васильев Дмитрий Евгеньевич", "Лебедева Ольга Игоревна",
           "Морозов Андрей Павлович", "Новикова Юлия Андреевна", ""};

        for (int i = 1; i <= 11; i++) {
            Employee emp = new Employee(fullNameEmployee[i-1], (i % 5) + 1, 100 + ((i % 5) * 55));
            boolean result = book.addEmployee(emp);
            System.out.println("Добавление сотрудника " + i + ": " + result);
        }
        book.returnEmployees();

        book.returnMediumSalary();

        book.returnTaxes("PROPORTIONAL");
        book.returnTaxes("PROGRESSIVE");

        book.changeSalary(1, 10);
        book.returnEmployees();

        book.firstEmployeeInDepartment(1, 150);

        book.findEmployeesWithSalary(200, 3);

        Employee testEmp = new Employee("Тест", 1, 110);
        System.out.println("Сотрудник с зарплатой 110 существует: " + book.employeeExists(testEmp));

        Employee found = book.getEmployeeById(3);
        if (found != null) {
            System.out.println("Найден сотрудник с ID=3: " + found);
        } else {
            System.out.println("Сотрудник с ID=3 не найден");
        }
    }
}
