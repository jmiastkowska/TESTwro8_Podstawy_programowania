public class SecondProgram {
    public static void main(String... args){
       assert args.length == 2:
               "wymagana ilość argumentów 2";
        String arg1 = args[1];
        String arg2 = args[0];
        String join = arg1.concat(" ");
        System.out.println(arg1.concat(" ").concat(arg2));
    }
}
