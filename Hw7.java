public class Hw7 {
    public static void main(String[] args) {
        System.out.println("task 1");

        int[] numbers = new int[] {1, 2, 3};

        double[] num_doub = {1.57, 7.654, 9.986};

        int[] even_numbers = {0, 2, 4, 6, 8};

        System.out.println("task 2");

        for (int index = 0; index < numbers.length; index++) {
        if (index == numbers.length - 1) {
            System.out.println(numbers[index]);
            break;
        }
            System.out.print(numbers[index] + ", ");
        }  
        
        for (int index = 0; index < num_doub.length; index++) {
        if (index == num_doub.length - 1) {
            System.out.println(num_doub[index]);
            break;
        }
            System.out.print(num_doub[index] + ", ");
        }    

        for (int index = 0; index < even_numbers.length; index++) {
        if (index == even_numbers.length - 1) {
            System.out.println(even_numbers[index]);
            break;
        }
            System.out.print(even_numbers[index] + ", ");
        }   
        
        System.out.println("task 3");

        for (int index = numbers.length - 1; index >= 0; index--) {
        if (index == 0) {
            System.out.println(numbers[index]);
            break;
        }
            System.out.print(numbers[index] + ", ");
        }  
        
        for (int index = num_doub.length - 1; index >= 0 ; index--) {
        if (index == 0) {
            System.out.println(num_doub[index]);
            break;
        }
            System.out.print(num_doub[index] + ", ");
        }    

        for (int index = even_numbers.length - 1; index >= 0; index--) {
        if (index == 0) {
            System.out.println(even_numbers[index]);
            break;
        }
            System.out.print(even_numbers[index] + ", ");
        }    

        System.out.println("task 4");

        for (int index = 0; index < numbers.length; index++) {
        if (numbers[index] % 2 != 0){
            numbers[index] += 1;
        }
        if (index == numbers.length - 1) {
            System.out.println(numbers[index]);
            break;
        }
            System.out.print(numbers[index] + ", ");
        }  
    }
    
}
