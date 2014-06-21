package Transcoding;

/**
 * Created by Nico on 21/06/2014.
 */
public class ASCIIDecimalCodeTranscoderStrategy implements TranscoderStrategy {

    @Override
    public String transcode(String message) {
        return (message + ": to ASCII Code ");
    }
}
