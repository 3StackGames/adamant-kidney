import com.three_stack.digital_compass.backend.BasicAction;

public class SelectCardAction extends BasicAction {
    private String cardId;
    private String recipient;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
}
