import com.three_stack.digital_compass.backend.BasicAction;

public class EndAction extends BasicAction {
    private boolean restart;

    public boolean isRestart() {
        return restart;
    }

    public void setRestart(boolean restart) {
        this.restart = restart;
    }
}
