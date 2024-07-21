// import java.util.*;

// public class BinomialCofficient {

//     public static float bionomial(int n, int r) {
//         int nfact = 1;
//         int rfact = 1;
//         int diff = n - r;
//         int diffFact = 1;
//         for (int i = n; i >= 1; i--) {
//             nfact = nfact * i;
//         }
//         for (int i = r; i >= 1; i--) {
//             rfact = rfact * i;
//         }

//         for (int i = diff; i >= 1; i--) {
//             diffFact = diffFact * i;
//         }

//         float bionomialValue = nfact / (rfact * diffFact);
//         return bionomialValue;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of n and r");
//         int n = sc.nextInt();
//         int r = sc.nextInt();
//         System.out.println("The value of NcR is " + bionomial(n, r));
//         sc.close();
//     }
// }

import java.util.*;

public class BinomialCofficient {

    public static int getFactorial(int num) {
        int fact = 1;

        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static float getBionomial(int n, int r) {
        int diff = getFactorial(n - r);
        n = getFactorial(n);
        r = getFactorial(r);
       
      
        float bionomial = n / (r * diff);
        return bionomial;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and r");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("The value of NcR is " + getBionomial(n, r));

        sc.close();
    }
}