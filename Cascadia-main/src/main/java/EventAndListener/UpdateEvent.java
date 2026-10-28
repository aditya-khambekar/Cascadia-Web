package EventAndListener;

import Entities.Player;
import java.awt.event.*;
import java.util.*;

public class UpdateEvent extends EventObject {
    private MouseEvent mEvent;
    private ActionEvent aEvent;
    private ArrayList<Player> players;

    public UpdateEvent(Object source) {
        super(source);
    }

    public UpdateEvent(Object source, MouseEvent e) {
        super(source);
        mEvent = e;
    }

    public UpdateEvent(Object source, ActionEvent e) {
        super(source);
    }

    public UpdateEvent(Object source, ArrayList<Player> play) {
        super(source);
        players = play;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public MouseEvent getMouseEvent() {
        return mEvent;
    }
}
