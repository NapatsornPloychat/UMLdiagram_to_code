package monopoly.model;

import monopoly.model.Square;

public class Piece {
    private Square location;

    public void setLocation(Square location) {
        this.location = location;
    }

    public Square getLocation() {
        return location;
    }
}