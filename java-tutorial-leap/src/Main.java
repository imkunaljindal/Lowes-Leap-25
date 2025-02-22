import java.util.*;

public class Main {

//    public static void changeName(BankAccount bankAccount) {
//        bankAccount.setName("Random");
//    }

    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        System.out.println("Hello LEAP 25");
//
//        int a = 5;
//        double b = 5.6;
//        float c = 4.5f;
//
//        long d = 51565852;
//
//        char x = 'x';
//
//        boolean g = true;
//
//        int age = 19;
//        if(age >= 18) {
//            System.out.println("A");
//        }
//        if(age > 18 && age < 20) {
//            System.out.println("B");
//        }
//        else {
//            System.out.println("C");
//        }
//
//        int salary = 2000;
//        switch(salary) {
//            case 1000:
//                System.out.println("Your salary is low. Ask for a raise");
//                break;
//            case 2000:
//                System.out.println("Your salary is in medium range");
//                break;
//            case 3000:
//                System.out.println("Your salary is the highest");
//                break;
//        }

//        for(int i = 0;i<0;i++) {
//            System.out.println("Hello Leap");
//        }

//        int i = 0;
//        while(i<100) {
//            System.out.println("Hello Leap");
//            i++;
//        }

//        int i = 0;
//
//        do {
//            System.out.println("Hello");
//            i++;
//        }while(i<0);

//        Customer vinay = new Customer("vinay");
//        vinay.name = "Vinay";
//        System.out.println(vinay.name);
//        System.out.println(vinay.age);
//        System.out.println(vinay.email);
//        Customer ayushi = new Customer("ayushi");
//        ayushi.name = "Ayushi";
//        ayushi.age = 20;
//        ayushi.email = "random@gmail.com";
//        System.out.println(ayushi.name);
//        System.out.println(ayushi.age);

//        System.out.println(vinay);
//        vinay.sayHello();
//        System.out.println(ayushi);
//        ayushi.sayHello();
//
//        Customer kohli = new Customer();

//        BankAccount bumrah = new BankAccount();
//        bumrah.setName("Bumrah");
//        System.out.println(bumrah.getName());
//        changeName(bumrah);
//        System.out.println(bumrah.getName());

//        bumrah.setBalance(8452);

//        Integer a = new Integer(10);

//        int a = 10;
//        System.out.println(a);
//        Integer x = new Integer(10);
//        System.out.println(x);

//        int[] arr = new int[10];
//        double[] arr1 = new double[2];
//
//        ArrayList<Integer> a = new ArrayList<Integer>();
//        a.add(10);
//        a.add(20);
//        a.add(1,30);
//
//        System.out.println(a.get(0));

//        Set<Integer> st = new HashSet<>();
//        st.add(10);
//        st.add(20);
//        st.add(30);
//        st.add(10);
//
//        System.out.println(st);


//        int[] arr2 = {1,2,3,4};
//        int n = arr2.length;
//
//        for(int i=0;i<n;i++) {
//            System.out.println(arr2[i]);
//        }

//        int arr[] = {1,2,4,5,6,7};
////        for(int i=0;i<arr.length;i++) {
////            System.out.println(arr[i]);
////        }
//        for(int x: arr) {
//            System.out.println(x);
//        }
//
//        Set<Character> s = new HashSet<>();
//        s.add('a');
//        s.add('b');
//        s.add('c');
//
//        for(Character c: s) {
//            System.out.println(c);
//        }

//        Scanner sc = new Scanner(System.in);
//
//        int x = sc.nextInt();
//        double a = sc.nextDouble();
//        System.out.println(x);

//        String text = sc.next();  // only one word as input ' '
//        System.out.println(text.charAt(0));
//
//        int[][] matrix = new int[3][2];
//
//        for(int i=0;i<matrix.length;i++) {
//            for(int j=0;j<matrix[0].length;j++) {
//                System.out.println(matrix[i][j]);
//            }
//        }

//        int arr[] = {3,1,5,4};
//        Arrays.sort(arr);
//
//        for(int x: arr)
//        System.out.println(x);
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(3);
//        arrayList.add(1);
//        arrayList.add(2);
//
//        Collections.sort(arrayList);
//        System.out.println(arrayList);

        Set<Integer> st = new HashSet<>();
        Set<Integer> st2 = new TreeSet<>();

        st.add(3);
        st2.add(2);

        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(3);
        l.add(5);

        Collections.sort(l);
        System.out.println(l);

        List<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
    }
}

