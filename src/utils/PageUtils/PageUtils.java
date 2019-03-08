package utils;

import com.github.pagehelper.PageInfo;

import java.util.List;

public class PageUtils<T> {

    private static final long serialVersionUID = 1L;

    private int pageNum;

    private int pageSize;

    private long total;

    private int pages;

    private List<T> list;

    public PageUtils() {
    }

    public PageUtils(List<T> list) {
        PageInfo<T> pageInfo = new PageInfo<>(list);
        this.list = list;
        this.pageNum = pageInfo.getPageNum();
        this.pages = pageInfo.getPages();
        this.pageSize = pageInfo.getPageSize();
        this.total = pageInfo.getTotal();
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
