

import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args)  {

        Album album1 = new Album(1, "Taylor Swift","1989", "2014", "10", "Pop");
//        System.out.println(album1.getArtist());
        Author author = new Author(1,"Najee", "Aleem");
        Quote quote1 = new Quote(1,"RUN AS FAR AS POSSIBLE", author);
        System.out.println(quote1.getAuthor().getFirstName() + author.getLastName() + " " + "said" + " " + quote1.getContent());
        ArrayList<Album> albums = new ArrayList<>();

    }
}