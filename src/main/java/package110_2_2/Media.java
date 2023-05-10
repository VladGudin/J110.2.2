package package110_2_2;

import java.time.LocalTime;

public class Media extends File{
    protected String content;// Содержание файла
    protected int duration;// Длительность, возможно не int

    public Media(String name, int size, String content, int duration) {
        super(name, size);
        setContent(content);
        setDuration(duration);
        this.format = "audio";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if (content.isEmpty()) throw new NullPointerException("Содержащийся в файле контент должен быть описан");
        this.content = content;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration<=0) throw new NullPointerException("Данные о длительности не могут отсуствовать");
        this.duration = duration;
    }

    @Override
    public void print() {
        super.print();
        System.out.println( "Duration: "+ LocalTime.ofSecondOfDay(duration));
        System.out.println("Content "+getContent());
    }
}
