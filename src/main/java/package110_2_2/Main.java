package package110_2_2;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        File[] files = new File[4];
        files[0] = new Docx("j110-lab2-hiers.docx", 23212, 2);
        files[1] = new Image("spb-map.png", 1703527, 1024, 3072);
        files[2] = new Media("06-PrettyGirl.mp3", 7893454, "Eric Clapton, Pretty Girl", 328);
        files[3] = new Video("BackToTheFuture1.avi", 1470984192, "Back to the future I", 6488, 640, 352, 1985);
        File.printAll(files);
        Docx[] Docxs = new Docx[2];
        Docxs[0] = new Docx("name1",1111,5);
        Docxs[1] = new Docx("name2",2222,9);
        Docx.printAll(Docxs);// Метод наследуется




    }
}