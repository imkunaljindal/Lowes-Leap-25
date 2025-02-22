public class Main {
    public static void main(String[] args) {
//        System.out.println("A");
//        int[] arr = {1,2,3,4};
//
//        try {
//            System.out.println(arr[8]);
//            System.out.println("B");
//            try {
//                int a = 5 / 0;
//            } catch (Exception e) {
//                System.out.println("I");
//            }
//            System.out.println(arr[3]);
//            System.out.println("E");
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//           int x = 9/0;
//        }
//        catch (Exception e) {
//            System.out.println("C");
//        }

//        try{
//            int b = 2/0;
//            System.out.println("G");
//        }
//        catch (Exception e) {
//            System.out.println("H");
//        }
//        System.out.println("D");

//        try{
//            System.out.println("A");
//            int a = 5/0;
//            System.out.println("B");
//        }
//        catch (Exception e) {
//            System.out.println("C");
//        }
//        finally {
//            System.out.println("D");
//        }
//
//        try{
//            int x = 6/0;
//            System.out.println("E");
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("F");
//        }
//        finally {
//            System.out.println("G");
//        }

        int age = 17;

    }

    private static void checkAge(int age) throws UnderAgeException {
        if(age<18) {
            throw new UnderAgeException("A");
        }
    }
}