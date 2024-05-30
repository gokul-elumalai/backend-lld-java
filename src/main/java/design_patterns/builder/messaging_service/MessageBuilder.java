package main.java.design_patterns.builder.messaging_service;


@WithBuilder
public class MessageBuilder {
    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;

    private MessageBuilder() {}

    public static class Builder {
        private MessageType messageType;
        private String content;
        private String sender;
        private String recipient;
        private boolean isDelivered;
        private long timestamp;

        public MessageBuilder build() {
            MessageBuilder messageBuilder = new MessageBuilder();
            messageBuilder.messageType = this.messageType;
            messageBuilder.content = this.content;
            messageBuilder.sender = this.sender;
            messageBuilder.recipient = this.recipient;
            messageBuilder.isDelivered = this.isDelivered;
            messageBuilder.timestamp = this.timestamp;
            return messageBuilder;
        }
    }
}
