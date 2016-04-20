package news.trinhduy.dev.news;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

import news.trinhduy.dev.adapters.PaperAdapter;
import news.trinhduy.dev.utils.Veriables;

public class PaperActivity extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, Veriables.PAPERS);
        //setListAdapter(adapter);

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.paper, R.id.tvPaper, Veriables.PAPERS);

        PaperAdapter adapter = new PaperAdapter(this, R.id.tvPaper, Veriables.PAPERS);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent intent = new Intent("news.trinhduy.dev.news.CATEGORY");
        intent.putExtra(Veriables.PAPER, position);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_paper, menu);
        return true;
    }



}
