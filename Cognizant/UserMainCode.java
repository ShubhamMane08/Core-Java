import java.util.*;

class UserMainCode {
    // Make the method static so it can be called from main
    public static int minimumBoats(int input1, String[] input2, int input3) {
        int boats = 0;
        int currentLoad = 0;

        for (String name : input2) {
            int nameLength = name.length();

            // If the name itself exceeds L, it must go alone
            if (nameLength > input3) {
                boats++;
                continue;
            }

            
            if (currentLoad + nameLength > input3) {
                boats++;
                currentLoad = 0;
            }

      
            currentLoad += nameLength;
        }

      
        if (currentLoad > 0) {
            boats++;
        }

        return boats;
    }

    public static void main(String[] args) {
        int n = 6;
        String[] names = {"Ali", "Bob", "Eva", "Dan", "Cristopher", "Em"};
        int L = 8;

        // Call the static method
        System.out.println(minimumBoats(n, names, L)); 
    }
}