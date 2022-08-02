import com.gmail.igorfetov1997.*;

public class main {
    public static void main(String[] args) {
        Creator creator = new TextDocumentCreator();
        Document myDocument = creator.create();
        creator = new PictureDocumentCreator();
        Document myDocument2 = creator.create();
        myDocument.show();
        myDocument2.show();
    }
}
