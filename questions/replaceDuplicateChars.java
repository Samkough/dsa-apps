/*
array of characters
write a function where all the duplicate characters have
been replaced with x
--------
input = [a, b, b, a, c, a]
output = [a, b, x, x, c, x]

public Char[] replaceDuplicateCharacters(Char[] arr) {
    List<Character> newArray = new List<Character>();
    Set<Character> newSet = new HashSet<Character>();

    for(int i = 0; i < arr; i++) {
        // check arr[i] in hashmap
        // if not, we would add to the newArray
        // if it is,  we would add it to x
        // add arr[i]
    }
}
*/