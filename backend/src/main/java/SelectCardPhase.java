import com.three_stack.digital_compass.backend.BasicAction;
import com.three_stack.digital_compass.backend.BasicGameState;
import com.three_stack.digital_compass.backend.BasicPhase;

public class SelectCardPhase extends BasicPhase {

    @Override
    public BasicGameState processAction(BasicAction basicAction, BasicGameState basicGameState) {
        return null;
    }

    @Override
    public Class getAction() {
        return SelectCardAction.class;
    }
}
