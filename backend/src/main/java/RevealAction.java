import com.three_stack.digital_compass.backend.BasicAction;

import java.util.List;

public class RevealAction extends BasicAction {
    private String cardId;
    private List<String> fuckPlayers;
    private String ruinPlayer;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public List<String> getFuckPlayers() {
        return fuckPlayers;
    }

    public void setFuckPlayers(List<String> fuckPlayers) {
        this.fuckPlayers = fuckPlayers;
    }

    public String getRuinPlayer() {
        return ruinPlayer;
    }

    public void setRuinPlayer(String ruinPlayer) {
        this.ruinPlayer = ruinPlayer;
    }
}
