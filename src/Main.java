public class Main {
    public static void main(String[] args) {

        System.out.println(betweenTenAndTwenty (5,6));
        positiveOrNerative (1);
        printStringAndNumber("test", 5);

    }

    public static boolean betweenTenAndTwenty (int a, int b){
        int sumAandB = a+b;
        if (sumAandB>10 && sumAandB<20 ){
            return true;
        }
          return false;
                 }


    public static void positiveOrNerative (int a){
        if (a<0){
            System.out.println("Negative");
                    }
       else{System.out.println("Positive");}
    }

    public static void printStringAndNumber(String string, int number){
        for (int i =0; i<number; i++){
            System.out.println(string);
        }
    }


//   1. Написать метод, принимающий на вход два целых числа и проверяющий,
//   что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
//   в противном случае – false.
//   2. Написать метод, которому в качестве параметра передается
//   целое число, метод должен напечатать в консоль, положительное ли число передали или
//   отрицательное. Замечание: ноль считаем положительным числом.
//   3. Написать метод, которому в качестве параметра передается целое число.
//   Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
//   4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
//   тпечатать в консоль указанную строку, указанное количество раз;
//   5. * Написать метод, который определяет, является ли год високосным,
//   и возвращает boolean (високосный- true, не високосный- false).
//   Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
}