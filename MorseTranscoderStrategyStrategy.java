package Transcoding;

public class MorseTranscoderStrategyStrategy implements TranscoderStrategy {
    @Override
    public String transcode(String message) {
        return (message + ": to Morse Code ");
    }
}
