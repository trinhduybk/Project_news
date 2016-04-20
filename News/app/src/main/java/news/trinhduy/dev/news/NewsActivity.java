package news.trinhduy.dev.news;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import news.trinhduy.dev.utils.Veriables;

/**
 * Created by Duy on 9/14/2015.
 */
public class NewsActivity extends Activity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article);
        Bundle bundle = getIntent().getExtras();
        setTitle(R.string.app_name);
        String link = bundle.getString(Veriables.LINK);
        webView = (WebView) findViewById(R.id.wvNews);
    }
}
