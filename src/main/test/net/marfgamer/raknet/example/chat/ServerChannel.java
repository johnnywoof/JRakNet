package net.marfgamer.raknet.example.chat;

public class ServerChannel {

	private final int channel;
	private final String name;
	private final StringBuilder channelText;

	public ServerChannel(int channel, String name) {
		this.channel = channel;
		this.name = name;
		this.channelText = new StringBuilder();
	}

	public int getChannel() {
		return this.channel;
	}

	public String getName() {
		return this.name;
	}

	public String appendText(String text) {
		channelText.append(text + "\n");
		return channelText.toString();
	}

	public String getChannelText() {
		return channelText.toString();
	}

}