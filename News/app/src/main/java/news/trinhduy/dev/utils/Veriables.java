package news.trinhduy.dev.utils;

import java.util.HashMap;
import java.util.List;

import news.trinhduy.dev.models.RssItem;
import news.trinhduy.dev.news.R;


public class Veriables {
    //public static final String [] H24_CATEGORIES = {};
    // Biến
    public static final String PAPER = "paper";
    public static final String CATEGORY = "category";
    public static final String LINK = "link";

    public static final String[] PAPERS = {"Vnexpress", "Dân Trí"};

    public static final int[] ICONS = {R.drawable.vn, R.drawable.dantri};
    // Vnexpress
    public static final String[] VNEXPRESS_CATEGORIES = {"Trang Chủ", "Xã Hội", "Thế Giới", "Kinh Doanh", "Văn Hóa", "Pháp Luật", "Đời Sống", "Khoa Học", "Vi Tính", "ô Tô - Xe Máy", "Bạn Đọc Việt", "Bạn Đoc Việt Tâm Sự", "Cười"};

    public static final String[] VNEXPRESS_LINKS = {"http://vnexpress.net/rss/gl/trang-chu.rss", "http://vnexpress.net/rss/gl/xa-hoi.rss", "http://vnexpress.net/rss/gl/the-gioi.rss", "http://vnexpress.net/rss/gl/kinh-doanh.rss", "http://vnexpress.net/rss/gl/van-hoa.rss", "http://vnexpress.net/rss/gl/phap-luat.rss", "http://vnexpress.net/rss/gl/doi-song.rss", "http://vnexpress.net/rss/gl/khoa-hoc.rss", "http://vnexpress.net/rss/gl/vi-tinh.rss", "http://vnexpress.net/rss/gl/oto-xe-may.rss", "http://vnexpress.net/rss/gl/ban-doc-viet.rss", "http://vnexpress.net/rss/gl/ban-doc-viet-tam-su.rss", "http://vnexpress.net/rss/gl/cuoi.rss"};

    // Dantri

    //public static final String [] H24_LINKS = {};

    // mảng chứa RSS và tiêu đề Dân Trí
    public static final String [] DANTRI_CATEGORIES = {"Trang chủ", "Sức khỏe", "Làm đẹp", "Tư vấn", "Kiến thức giới tính", "Xã hội"};

    public static final String [] DANTRI_LINKS = {"http://dantri.com.vn/trangchu.rss", "http://dantri.com.vn/suc-khoe.rs", "http://dantri.com.vn/suc-khoe/lam-dep.rss", "http://dantri.com.vn/suc-khoe/tu-van.rss", "http://dantri.com.vn/suc-khoe/kien-thuc-gioi-tinh.rss", "http://dantri.com.vn/xa-hoi.rss"};
    // mảng 2 chiều chứa link và categories
    public static final String[][] CATEGORIES = {VNEXPRESS_CATEGORIES, DANTRI_CATEGORIES};

    public static final String[][] LINKS = {VNEXPRESS_LINKS, DANTRI_LINKS};


    public static HashMap<Integer, List<RssItem>> newsMap = new HashMap<Integer, List<RssItem>>();

}
