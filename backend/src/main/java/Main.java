import com.three_stack.digital_compass.backend.PhaseManager;
import game_objects.Instruction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Adamant Kidney");

        PhaseManager phaseManager = new PhaseManager();
        Instruction instruction = new Instruction(5, 4, 7);
        phaseManager.initialize("http://localhost:3333", new GameStateFactory(instruction));
    }
}
