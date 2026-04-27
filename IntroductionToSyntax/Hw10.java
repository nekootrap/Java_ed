public class Hw10 {
    public static void main(String[] args) {
        System.out.println("task 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println("task 2");

        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullNameUpper);

        System.out.println("task 3");

        fullName = "Иванов Семён Семёнович";

        String fullName1 = fullName.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName1);
        


        
    }
}