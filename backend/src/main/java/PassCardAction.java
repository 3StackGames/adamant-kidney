import com.three_stack.digital_compass.backend.BasicAction;

public class PassCardAction extends BasicAction {
    private String cardId;
    private String fromPlayer;
    private String toPlayer;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getFromPlayer() {
        return fromPlayer;
    }

    public void setFromPlayer(String fromPlayer) {
        this.fromPlayer = fromPlayer;
    }

    public String getToPlayer() {
        return toPlayer;
    }

    public void setToPlayer(String toPlayer) {
        this.toPlayer = toPlayer;
    }
}
