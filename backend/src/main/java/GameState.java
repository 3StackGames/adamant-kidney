import com.three_stack.digital_compass.backend.BasicGameState;
import game_objects.Instruction;

public class GameState extends BasicGameState {

    private int turnCount;

    private int totalTurns;

    private final Instruction instruction;

    public GameState(Instruction instruction) {
        super();
        this.instruction = instruction;
    }

    public void incrementTurnCount() {
        turnCount++;
    }

    public int getTurnCount() {
        return turnCount;
    }

    public void setTurnCount(int turnCount) {
        this.turnCount = turnCount;
    }

    public int getTotalTurns() {
        return totalTurns;
    }

    public void setTotalTurns(int totalTurns) {
        this.totalTurns = totalTurns;
    }

    public Instruction getInstruction() {
        return instruction;
    }
}
