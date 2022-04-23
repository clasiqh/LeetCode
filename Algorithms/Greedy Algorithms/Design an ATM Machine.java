class ATM {
    long[] notes = new long[5];
    int[] val = new int[] { 20, 50, 100, 200, 500 };

    public void deposit(int[] banknotesCount) {
        for (int i = 0; i < 5; i++)
            notes[i] += banknotesCount[i];
    }

    public int[] withdraw(int amount) {
        int[] reduce = new int[5];
        for (int i = 4; i >= 0; i--) {
            reduce[i] = (int) Math.min(notes[i], amount / val[i]);
            amount -= val[i] * reduce[i];
        }
        if (amount != 0)
            return new int[] { -1 };
        for (int i = 0; i < 5; i++)
            notes[i] = notes[i] - reduce[i];
        return reduce;
    }
}