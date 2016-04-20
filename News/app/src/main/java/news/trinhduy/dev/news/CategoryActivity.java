package news.trinhduy.dev.news;

import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.List;

import news.trinhduy.dev.adapters.CategoryAdapter;
import news.trinhduy.dev.models.RssItem;
import news.trinhduy.dev.utils.RssParser;
import news.trinhduy.dev.utils.Veriables;

/**
 * Created by Duy on 8/20/2015.
 */
public class CategoryActivity extends ListActivity {

    private int paper;
    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        paper = bundle.getInt(Veriables.PAPER);
        setTitle(Veriables.PAPERS[paper]);
        CategoryAdapter adapter = new CategoryAdapter(this, Veriables.ICONS[paper], Veriables.CATEGORIES[paper]);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent intent = new Intent(this, NewsListActivity.class);
        intent.putExtra(Veriables.PAPER, paper);
        intent.putExtra(Veriables.CATEGORY, position);
        startActivity(intent);
        int key = paper * 1000 + position;
        dialog = ProgressDialog.show(this, "", "Loading..." + Veriables.CATEGORIES[paper][position]);
        RssParser parser = new RssParser();
        List<RssItem> items = parser.getNewsList(Veriables.LINKS[paper][position]);
        System.out.println("Rss size : " + items.size()); // điểm đang lỗi
        Veriables.newsMap.put(key, items);
    }
}
