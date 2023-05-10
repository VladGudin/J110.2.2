package package110_2_2;

import java.time.LocalTime;

public class Video extends Media{
    private int width;// ширина
    private int height;// высота
    private int year;

    public Video(String name, int size, String content, int duration, int width, int height, int year) {
        super(name, size, content, duration);
        setWidth(width);
        setHeight(height);
        setYear(year);
        this.format = " video";
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height<=0) throw new IllegalArgumentException("Высота должна быть больше 0");
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width<=0) throw new IllegalArgumentException("Ширина должна быть больше 0");
        this.width = width;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year<=1888 || year>2023) throw new NullPointerException("Год указан некорректно");
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println( "File name " + getName());
        System.out.println("Size "+getSize());
        System.out.println("Details "+ getFormat()+"  "+getYear());
        System.out.println("Content "+getContent());
        System.out.println("Duration "+LocalTime.ofSecondOfDay(duration));
        System.out.println(getWidth()+"x"+getHeight());

    }
}
