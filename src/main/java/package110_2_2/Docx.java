package package110_2_2;

public class Docx extends File{
    private int pageCount;// Количество страниц

    public Docx(String name, int size, int pageCount) {
        super(name, size);
        setPageCount(pageCount);
        this.format = "docx";
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        if (pageCount<=0) throw new NullPointerException("Количество страниц должно быть больше 0");
            this.pageCount = pageCount;
        }

    @Override
    public void print() {
        super.print();
        System.out.println(getPageCount() + (getPageCount()>1? " pages" : " page"));
    }
}

