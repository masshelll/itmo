public class Memory {
    private boolean isForgot;
    private String topic;

    public Memory(boolean isForgot, String topic) {
        this.isForgot = false;
        this.topic = topic;
    }

    public String getDescription() {
        String flashback;
        if (isForgot) flashback = "Полузабытое";
        else flashback = "Яркое";
        return flashback + " вспоминание о " + topic;
    }
}
