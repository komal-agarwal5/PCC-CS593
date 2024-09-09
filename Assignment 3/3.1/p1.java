/* Need static method declaration as it is called from static main() method */
public static boolean find(int key, int nums[]) {
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == key)
            return true;
    }
    return false;
}