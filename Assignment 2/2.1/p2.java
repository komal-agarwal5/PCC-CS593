public long fact(int n) { // may return large numbers
    if (n < 0) { // For negative numbers
        System.out.println("ERROR");
        return -1; // No factorial for negative number
    } else if (n == 0) // For 0 value
        return 1;
    else {
        long f = 1; // Otherwise
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}