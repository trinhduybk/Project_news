package news.trinhduy.dev.news;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.List;

import news.trinhduy.dev.adapters.NewsAdapter;
import news.trinhduy.dev.models.RssItem;
import news.trinhduy.dev.utils.Veriables;

/**
 * Created by Duy on 8/20/2015.
 */
public class NewsListActivity extends ListActivity {

    private List<RssItem> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        int category = bundle.getInt(Veriables.CATEGORY);
        int paper = bundle.getInt(Veriables.PAPER);
        setTitle("Test News" + paper + " " + category);
        int key = paper * 1000 + category;
        items = Veriables.newsMap.get(key);
        NewsAdapter adapter = new NewsAdapter(this, Veriables.ICONS[paper], items);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent intent = new Intent(this, NewsActivity.class);
        intent.putExtra(Veriables.LINK, items.get(position).getLink());
        startActivity(intent);
    }
}
