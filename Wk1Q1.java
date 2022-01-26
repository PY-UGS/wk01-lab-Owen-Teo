public class Wk1Q1 {
    public static void main(String[] args)
    {
        System.out.println("Hello, I am Owen");

        String module = "CSC1009";
        switch(module)
        {
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;


            default:
                System.out.println("Unknown Module");
                break;

        }

        for(int i = 102 ; i>65; i--) {
            if (i % 2 != 0) {
                System.out.println("value of i:" + i);
            }
        }
    }
}
