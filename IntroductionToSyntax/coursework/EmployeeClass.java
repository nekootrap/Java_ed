package coursework;

class Employee {
    private String fullName;
    private int department;
    private int salary;
    private int id;
    
    private static int nextId = 1;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = nextId;
        nextId++; 
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return this.salary == employee.salary; 
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName + ", Отдел: " + department +
               ", Зарплата: " + salary + ", id: " + id;
    }

    public void printShortInfo() {
        System.out.println("ФИО: " + fullName + ", Зарплата: " + salary);
    }
}