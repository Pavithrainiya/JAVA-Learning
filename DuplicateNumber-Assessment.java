public class DuplicateCharacters {

    public static void findDuplicateCharacters(String s) {
        boolean foundDuplicate = false;
        char[] chars = s.toCharArray();
        
        // Iterate over each character in the string
        for (int i = 0; i < chars.length; i++) {
            // Check if this character is already counted as a duplicate
            boolean isDuplicate = false;
            // Check if this character has appeared before in the array
            for (int k = 0; k < i; k++) {
                if (chars[i] == chars[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If it's not counted as a duplicate and is a duplicate in the rest of the string
            if (!isDuplicate) {
                // Check if this character has duplicates in the rest of the string
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        System.out.println("Duplicate character found: " + chars[i]);
                        foundDuplicate = true;
                        break; // Stop checking after finding the first duplicate of this character
                    }
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate characters found.");
        }
    }

    public static void main(String[] args) {
        String testString = "alphabet";
        findDuplicateCharacters(testString);
    }
}