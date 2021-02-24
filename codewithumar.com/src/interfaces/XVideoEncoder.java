package interfaces;

public class XVideoEncoder implements VedeoEncoder{

	@Override
	public void encode(Video video) {
        System.out.println("Encoding video...");
        System.out.println("Done!\n");
    }
}
