import java.util.Scanner;
class Prob {
    public void lenArray() {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements in the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       
        int S = sc.nextInt();

        int minLength = Integer.MAX_VALUE;
        int wSum = 0;
        int left = 0;

       
        for (int right = 0; right < n; right++) {
            wSum += arr[right];

            
            while (wSum >= S) {
                minLength = Math.min(minLength, right - left + 1);
                wSum -= arr[left];
                left++;
            }
        }

       
        System.out.println(minLength == Integer.MAX_VALUE ? 0 : minLength);

        sc.close();
    }

    public static void main(String[] args) {
        Prob m = new Prob();
        m.lenArray();
    }
}