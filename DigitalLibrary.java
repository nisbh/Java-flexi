abstract class LibraryItem{
    private String itemId;
    private String title;
    protected boolean isReserved=false;
    LibraryItem(String itemId,String title){
        this.itemId=itemId;
        this.title=title;
    }
    void showDetails(){
        System.out.println("ID: "+itemId+", Title: "+title+", Reserved: "+isReserved);
    }
    public String getItemId() { return itemId; }
    protected String getTitle() { return title; }
    
    public abstract void processLoan();
}

class Textbook extends LibraryItem{
    public Textbook(String itemId,String title){
        super(itemId,title);
    }
    @Override
    public void processLoan(){
        if(isReserved){
            System.out.println("Textbook  is reserved and cannot be loaned.");
        } else {
            System.out.println("Processing loan for textbook: "+getTitle());
            isReserved=true;
        }
}
}
class ResearchPaper extends LibraryItem{
    public ResearchPaper(String itemId,String title){
        super(itemId,title);
    }
    @Override
    public void processLoan(){
        System.out.println("Research paper cannot be loaned.");        
    }
}
public class DigitalLibrary{
    public static void main(String[] args){
        LibraryItem tc1=new Textbook("B101","Java core");
        LibraryItem tc2=new ResearchPaper("R99","AI Ethics");
        tc1.showDetails();
        tc1.processLoan();
        tc1.showDetails();
        tc1.processLoan();

        tc2.showDetails();
        tc2.processLoan();
        tc2.showDetails();
    }
}