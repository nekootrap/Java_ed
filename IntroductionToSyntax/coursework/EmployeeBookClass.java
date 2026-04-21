package coursework;

class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public Employee[] getEmployees() {
        return employees;
    }

    public void returnEmployees() {
        for (Employee element : employees) {
            if (element != null) {
                System.out.println(element.toString());
            }
        }
    }

    public void returnMediumSalary() {
        double sumSalary = 0;
        double count = 0;
        for (Employee element : employees) {
            if (element != null) {
                sumSalary += element.getSalary();
                count++;
            } else {
                break;
            }
        }
        if (count > 0) {
            System.out.println("Средняя зарплата: " + (sumSalary / count));
        }
    }

    public void returnTaxes(String type) {
        double taxes = 0;
        for (Employee element : employees) {
            if (element != null) {
                switch (type) {
                    case "PROPORTIONAL":
                        taxes += (element.getSalary() * 13.0) / 100;
                        break;
                    case "PROGRESSIVE":
                        if (element.getSalary() <= 150) {
                            taxes += (element.getSalary() * 13.0) / 100;
                        } else if (element.getSalary() <= 350) {
                            taxes += (element.getSalary() * 17.0) / 100;
                        } else {
                            taxes += (element.getSalary() * 21.0) / 100;
                        }
                        break;
                    default:
                        System.out.println("Неизвестная команда");
                        break;
                }
            }
        }
        System.out.println("Общий налог: " + taxes);
    }

    public void changeSalary(int department, int percent) {
        for (Employee element : employees) {
            if (element != null) {
                if (element.getDepartment() == department) {
                    element.setSalary(element.getSalary() * (100 + percent) / 100);
                } else {
                    continue;
                }
            }
        }
    }

    public void firstEmployeeInDepartment(int department, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == department && employees[i].getSalary() > salary) {
                    System.out.println("Порядковый номер в списке: " + i);
                    employees[i].printShortInfo();
                    break;
                }
            }
        }
    }

    public void findEmployeesWithSalary(int wage, int employeeNumber) {
        int count = 0;
        int i = 0;
        while (i < employees.length) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < wage) {
                    employees[i].printShortInfo();
                    count++;
                    if (count >= employeeNumber) {
                        break;
                    }
                }
            }
            i++;
        }
    }

    public boolean employeeExists(Employee employee) {
        for (Employee element : employees) {
            if (element != null) {
                if (element.equals(employee)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public Employee getEmployeeById(int id) {
        for (Employee element : employees) {
            if (element != null && element.getId() == id) {
                return element;
            }
        }
        return null;
    }
}