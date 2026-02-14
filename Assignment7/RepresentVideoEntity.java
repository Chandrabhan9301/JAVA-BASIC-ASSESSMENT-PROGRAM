package Assignment7;


class Video{
    private int videoId;
    private String title;
    private int views,like;
    private static int totalVideo;

    void setVideoId(int id){
        videoId = id;
    }
    void setTitle(String title){
        this.title = title;
    }
    void setViews(int views){
        this.views = views;
    }
    void setLike(int like){
        this.like = like;
    }
    public static void setTotalVideo(int totalVideo){
        Video.totalVideo = totalVideo;
    }

    void getVideoId(){
        System.out.println("Video Id = "+videoId);
    }
    void getTitle(){
        System.out.println("Title = "+title);
    }
    void getViews(){
        System.out.println("Views = "+views);
    }
    void getLike(){
        System.out.println("Likes = "+like);
    }
    public static void getTotalVideo(){
        System.out.println("Total Video = "+totalVideo);
    }
}


public class RepresentVideoEntity {
    public static void main(String[] args) {
        Video v1 = new Video();

        v1.setVideoId(101);
        v1.setTitle("Java Programming");
        v1.setViews(1000);
        v1.setLike(50);
        Video.setTotalVideo(1);

        v1.getVideoId();
        v1.getTitle();
        v1.getViews();
        v1.getLike();
        Video.getTotalVideo();
    }
}
