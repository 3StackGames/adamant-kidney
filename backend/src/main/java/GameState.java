import com.three_stack.digital_compass.backend.BasicGameState;
import game_objects.Instruction;

public class GameState extends BasicGameState {

    private int turnCount;

    private int totalTurns;

    private Instruction instruction;

    public GameState () {
        super();
        turnCount = 0;
    }
}
