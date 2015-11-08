import com.three_stack.digital_compass.backend.BasicGameState;
import game_objects.Instruction;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class GameStateFactoryTest {
    private static Instruction instruction;

    @Before
    public void setup() {
        instruction = new Instruction(5, 4, 7);
    }

    @Test
    public void test_gameStateFactory_shouldCreateGameState() {
        GameStateFactory factory = new GameStateFactory(instruction);
        BasicGameState testGameState = factory.createState();

        assertEquals(GameState.class, testGameState.getClass());
        GameState gameState = (GameState) testGameState;
        boolean totalTurnsInBounds = gameState.getTotalTurns() >= instruction.getMinTurnCount() && gameState.getTotalTurns() < instruction.getMaxTurnCount();
        assertTrue(totalTurnsInBounds);
    }
}
