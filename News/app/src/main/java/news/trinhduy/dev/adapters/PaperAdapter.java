package news.trinhduy.dev.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import news.trinhduy.dev.news.R;
import news.trinhduy.dev.utils.Veriables;

/**
 * Created by Duy on 8/19/2015.
 */
public class PaperAdapter extends ArrayAdapter <String>{

    private Context context;
    private String[] papers;

    public PaperAdapter(Context context, int textViewResourceId, String[] papers) {
        super(context, textViewResourceId, papers);
        this.context = context;
        this.papers = papers;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.paper, parent, false);
        ImageView iv = (ImageView) rowView.findViewById(R.id.ivIcon);
        TextView tv = (TextView) rowView.findViewById(R.id.tvPaper);
        iv.setImageResource(Veriables.ICONS[position]);
        tv.setText(papers[position]);

        return rowView;
    }
}

