import com.three_stack.digital_compass.backend.BasicGameState;
import com.three_stack.digital_compass.backend.BasicGameStateFactory;
import game_objects.Instruction;

import java.util.Random;

public class GameStateFactory extends BasicGameStateFactory {

    private final Instruction instruction;

    public GameStateFactory(Instruction instruction) {
        super();
        this.instruction = instruction;
    }

    @Override
    public BasicGameState createState() {
        GameState gameState =  new GameState(instruction);

        //random number of total turns
        Random random = new Random();
        int min = instruction.getMinTurnCount();
        int max = instruction.getMaxTurnCount();
        int difference = max - min;
        int totalTurns = random.nextInt(difference) + min;
        gameState.setTotalTurns(totalTurns);

        gameState.transitionPhase(new SelectCardPhase());
        return gameState;
    }
}
