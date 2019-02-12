public class TodoList {
    public static void main(String[] args) {
        if(args.length > 0){
            System.out.println("Command Line Todo application");
            for (String arg : args){
                System.out.println(arg);
            }
        } else {
            System.out.println("No command line" + "arguments found.");
        }
    }
}
