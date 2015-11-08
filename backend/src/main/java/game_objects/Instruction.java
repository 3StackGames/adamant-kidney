package game_objects;

public final class Instruction {
    private int startCardCount;
    private int minTurnCount;
    private int maxTurnCount;

    public Instruction(int startCardCount, int minTurnCount, int maxTurnCount) {
        this.startCardCount = startCardCount;
        this.minTurnCount = minTurnCount;
        this.maxTurnCount = maxTurnCount;
    }

    public int getStartCardCount() {
        return startCardCount;
    }

    public int getMinTurnCount() {
        return minTurnCount;
    }

    public int getMaxTurnCount() {
        return maxTurnCount;
    }
}
