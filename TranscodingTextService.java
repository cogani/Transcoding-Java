package Transcoding;

/**
 * Created by Nico on 21/06/2014.
 */
public class TranscodingTextService {
    private TranscoderStrategy transcoderStrategy;

    public TranscodingTextService(TranscoderStrategy transcoderStrategy) {
        this.transcoderStrategy = transcoderStrategy;
    }

    public String execute(String message) {
        return transcoderStrategy.transcode(message);
    }

    public void setTranscoderStrategy(TranscoderStrategy transcoderStrategy) {
        this.transcoderStrategy = transcoderStrategy;
    }
}
