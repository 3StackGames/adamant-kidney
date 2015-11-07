package game_objects;

import com.three_stack.digital_compass.backend.BasicPlayer;
import game_objects.Card;

import java.util.List;

public class Player extends BasicPlayer {
    //always
    private List<Card> cards;

    //select card phase
    private int cardToPassId;
    private String playerToPass;

    //hookup phase
    private List<String> partners;
    private String ruinPlayer;

}
