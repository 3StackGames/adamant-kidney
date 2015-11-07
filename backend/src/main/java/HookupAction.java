import com.three_stack.digital_compass.backend.BasicAction;

import java.util.List;

public class HookupAction extends BasicAction {
    private String cardId;
    private List<String> partners;
    private String ruinPlayer;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public List<String> getPartners() {
        return partners;
    }

    public void setPartners(List<String> partners) {
        this.partners = partners;
    }

    public String getRuinPlayer() {
        return ruinPlayer;
    }

    public void setRuinPlayer(String ruinPlayer) {
        this.ruinPlayer = ruinPlayer;
    }
}
