import java.util.Scanner;



public class Identity {
    private static Scanner scan;
static {
    scan = new Scanner(System.in);
}
    public static String  get_word(String message){
        System.out.println(message + " : ");
        return scan.next();
    }
    public static void starting(){
    String first_number = get_word(" Enter the first number for A ");
    String second_number = get_word("Enter the second number for B ");
        Alliances(first_number,second_number);

    }
    public  static void Alliances(String first_number , String second_number){
        System.out.println("Enter your number which alliances do you want?\n" +
                "1 = (a  +  b)^ 2 \n" +
                "2 = (a  -  b)^ 2 \n" +
                "3 = (a  +  b)^ 3 \n" +
                "4 = (a  -  b)^ 3 \n" +
                "5 =  Exit ");
        String option = scan.next();

        switch (option){
            case "1":
            case "one":
            case "first":
                 one(first_number,second_number);
        break;
            case "2":
            case "two":
            case "second":
                two(first_number,second_number);
                break;
            case "3":
            case "three":
                three(first_number,second_number);

            case "4":
            case "four":
                four(first_number,second_number);
                break;
            case "5":
            case "five":
                System.out.println("goodbye  :))");
                System.exit(0);
            default:
                System.out.println(" Invalid number ");
              Alliances(first_number,second_number);
        }
        System.out.println("  ");
        Alliances(first_number,second_number);



    }
    public static void one(String first_number, String  second_number){
        System.out.printf("%s^2 + %s + %s^2",first_number,result(first_number,second_number),second_number);
    }
    public static  void  two(String first_number, String second_number){
        System.out.printf("%s^2 - %s + %s^2",first_number,result(first_number,second_number),second_number);//2*%s*%s
    }
    public static void three(String first_number, String  second_number){
        System.out.printf("%s^3 + 3*%s^2 *%s + 3*%s*%s^2 + %s^3 ",first_number,first_number,second_number,first_number,second_number,second_number);
    }
    public static void four(String first_number, String  second_number){
        System.out.printf("%s^3 - 3*%s^2 *%s + 3*%s*%s^2 - %s^3 ",first_number,first_number,second_number,first_number,second_number,second_number);
    }
    public static  String result(String first_number, String second_number){
    return  String.format("2*%s*%s",first_number,second_number);
    }


    public static void main(String[] args) {
        starting();
    }
}
