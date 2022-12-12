import java.util.Scanner;
public class Task3 {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int num_1 = getNumber();
        char action = getAction();
        int num_2 = getNumber();
        int res = calc(num_1,num_2,action);
        System.out.println("Результат равен "+ res);
    }

    public static int getNumber(){
        System.out.print("Введите число: ");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка! Попробуйте еще раз.");
            scanner.next();
            num = getNumber();
        }
        return num;
    }

    public static char getAction(){
        System.out.print("Введите операцию: ");
        char action;
        if(scanner.hasNext()){
            action = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка! Попробуйте еще раз.");
            scanner.next();
            action = getAction();
        }
        return action;
    }
    public static int calc(int num_1, int num_2, char action){
        int result;
        if (action == '+'){
            result = num_1 + num_2;
            return result;
        }
        else if(action == '-'){
            result = num_1 - num_2;
            return result;
        }
        else if(action == '*'){
            result = num_1 * num_2;
            return result;
        }
        else if(action == '/'){
            result = num_1 / num_2;
            return result;
        }
        else{
            System.out.println("Ошибка! Повторите ввод.");
            result = calc(num_1, num_2, getAction());
        }
        return result;
    }
    
}
