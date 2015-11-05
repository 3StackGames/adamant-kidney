import com.three_stack.digital_compass.backend.BasicAction;

public class CollectCardAction extends BasicAction {
    private boolean moveOn;

    public boolean isMoveOn() {
        return moveOn;
    }

    public void setMoveOn(boolean moveOn) {
        this.moveOn = moveOn;
    }
}
