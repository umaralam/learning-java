package interfaces;

public class VideoProcessor {

	
	private VedeoEncoder encoder;
	private VedeoDatabase database;
	private EmailService notificationService;
	

	public VideoProcessor(XVideoEncoder encoder,SqlVideoDatabase database,NotificationService notificationService){
		this.encoder = encoder;
		this.database = database;
		this.notificationService = notificationService;
	}
	
	public void process(Video video) {
		
        encoder.encode(video);
        database.store(video);
        notificationService.notify(video.getUser());
    }
}
