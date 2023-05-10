package package110_2_2;

public class Image extends File{
    private int width;// ширина
    private int height;// высота

    public Image(String name, int size, int width, int height ) {
        super(name, size);
        setWidth(width);
        setHeight(height);
        this.format = " image";
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width<=0) throw new IllegalArgumentException("Ширина должна быть больше 0");
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height<=0) throw new IllegalArgumentException("Высота должна быть больше 0");
        this.height = height;
    }

    @Override
    public void print() {
        super.print();
        System.out.println( getWidth()+"x"+getHeight());
    }
}
