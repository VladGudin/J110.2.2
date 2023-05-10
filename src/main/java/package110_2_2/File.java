package package110_2_2;

public class File {
    private String name;// Имя файла
    private int size; // Размер в байтах
    protected String format; // Формат файла
    public File (String name, int size){
        setName(name);
        setSize(size);

    }
    public void print(){
        System.out.println("File name: "+name );
        System.out.println("Size: "+size);
        System.out.println("Details: "+format);
    }
    public static void printAll(File[] files){
        for (File a : files){
            a.print();
            System.out.println();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) throw new NullPointerException("Имя файла не может быть пустым");
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size<=0) throw new IllegalArgumentException("Размер файла должен быть больше нуля");
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if (format.isEmpty()) throw new NullPointerException("Формат файла не может быть пустым");
        this.format = format;
    }
}
