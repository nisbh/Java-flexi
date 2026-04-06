abstract class Media{
    private String title;
    private int duration;
    protected boolean isPremium;
    abstract void playContent();
    void getDetails(){
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Premium Content: " + (isPremium ? "Yes" : "No"));
    }
    Media(String title, int duration, boolean isPremium){
        this.title = title;
        this.duration = duration;
        this.isPremium = isPremium;
    }
    String getTitle(){
        return title;
    }
    int getDuration(){
        return duration;
    } 
}
class Movie extends Media{
    private String director;
    Movie(String title, int duration, boolean isPremium, String director){
        super(title, duration, isPremium);
        this.director = director;
    }
    @Override
    void playContent(){
        System.out.println("Playing movie: " + getTitle());
    }
    @Override
    void getDetails(){
        super.getDetails();
        System.out.println("Director: " + director);
    }
}