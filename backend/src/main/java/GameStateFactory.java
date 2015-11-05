import com.three_stack.digital_compass.backend.BasicGameState;
import com.three_stack.digital_compass.backend.BasicGameStateFactory;

public class GameStateFactory extends BasicGameStateFactory {

    @Override
    public BasicGameState createState() {
        GameState gameState =  new GameState();
        gameState.transitionPhase(new PassCardPhase());
        return gameState;
    }
}
