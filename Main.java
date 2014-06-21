package Transcoding;

/**
 * Created by Nico on 21/06/2014.
 */
public class Main {
    public static void main(String[] args) {
        TranscoderStrategy transcoderStrategies[] = {
                new BrailleTranscoderStrategy(),
                new EncryptTranscoderStrategy(),
                new MorseTranscoderStrategyStrategy()};

        TranscoderStrategy asciiDecimalCodeTranscoderStrategy = new ASCIIDecimalCodeTranscoderStrategy();

        TranscodingTextService transcodingTextService = new TranscodingTextService(asciiDecimalCodeTranscoderStrategy);

        String message = "Meessage to translate";
        System.out.println("TranscodingTextService is using the behavior injected by constructor...\n\t"+ transcodingTextService.execute(message));

        System.out.println("\nTranscodingTextService can change its behavior dinamicaly by setter...");
        for (int i = 0; i < transcoderStrategies.length; i++) {
            transcodingTextService.setTranscoderStrategy(transcoderStrategies[i]);
            String result = transcodingTextService.execute(message);
            System.out.println("\t" + result);
        }
    }
}
