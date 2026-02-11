public class duplicatestr {
   
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
       
        if(idx == str.length()) {
            System.out.println("Final String: " + newStr);
            return; 
        }

 
        char currChar = str.charAt(idx);
        int mapIdx = currChar - 'a'; 

        if(map[mapIdx]) { 
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            
            map[mapIdx] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnacollege";

        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}