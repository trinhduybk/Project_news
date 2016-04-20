package news.trinhduy.dev.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import news.trinhduy.dev.news.R;


public class CategoryAdapter extends ArrayAdapter <String> {

    private Context context;
    private String[] Categories;
    private int ivIcon;

    public CategoryAdapter(Context context, int ivIcon, String[] Categories) {
        super(context, ivIcon, Categories);
        this.context = context;
        this.ivIcon = ivIcon;
        this.Categories = Categories;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.category,parent, false);
        ImageView iv = (ImageView)rowView.findViewById(R.id.ivIcon);
        TextView tv = (TextView) rowView.findViewById(R.id.tvCategory);
        iv.setImageResource(ivIcon);
        tv.setText(Categories[position]);

        return rowView;
    }

}
