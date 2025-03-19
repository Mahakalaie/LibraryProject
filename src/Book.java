public class Book {

    private String title;
    private int pageCount;

    public Book(String title, int pageCount)
    {
        if(pageCount <= 0)
            throw new IllegalArgumentException("Page count must be positive");

        if(title == null || "".equals(title))
            throw new IllegalArgumentException("Title cannot be empty");

        this.title = title;
        this.pageCount = pageCount;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        if(title == null || "".equals(title))
            throw new IllegalArgumentException("Title cannot be empty");

        this.title = title;
    }

    public int getPageCount()
    {
        return pageCount;
    }

    public void setPageCount(int pageCount)
    {
        if(pageCount <= 0)
            throw new IllegalArgumentException("Page count must be positive");

        this.pageCount = pageCount;
    }

    @Override
    public String toString()
    {
        return this.title + " (" + this.pageCount +" pages)" ;
    }


}
