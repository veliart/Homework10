public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middlename = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middlename;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("Задание 2");
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUpperCase);

        System.out.println("Задание 3");
        fullName = "Иванов Семён Семёнович";
        String fullNameReplaced = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullNameReplaced);
    }
}