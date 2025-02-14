import java.util.*;

class UserMainCode {
    public int findSubstring(String input1, int input2) {

        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < input2; i++) {
            s1.append(input1);
        }
        
        String s = s1.toString();
        int countM = 0, countME = 0;

        
        for (char c : s.toCharArray()) {
            if (c == 'M') {
                countM++;
            } else if (c == 'E') {
                countME += countM;
            }
        }
        
        return countME;
    }

    public static void main(String[] args) {
        UserMainCode obj = new UserMainCode();
       System.out.println(obj.findSubstring("ABEMEE", 2)); 
        System.out.println(obj.findSubstring("MONEY", 3));  
}
}