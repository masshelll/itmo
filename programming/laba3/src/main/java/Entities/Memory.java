package Entities;

public record Memory(boolean isForgot, String topic) {

    public String getDescription() {
        String flashback;
        if (isForgot) flashback = "Полузабытое";
        else flashback = "Яркое";
        return flashback + " вспоминание о " + topic;
    }
}
