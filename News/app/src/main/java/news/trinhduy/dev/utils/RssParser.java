package news.trinhduy.dev.utils;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import java.net.URL;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import news.trinhduy.dev.models.RssItem;

/**
 * Created by Duy on 8/20/2015.
 */
public class RssParser {

    public List<RssItem> getNewsList(String link){
        try {
            URL url = new URL(link);
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            XMLReader xmlreader = parser.getXMLReader();
            RssHendler rssHendler = new RssHendler();
            xmlreader.setContentHandler(rssHendler);
            InputSource is = new InputSource(url.openStream());

            xmlreader.parse(is);
            return rssHendler.getItemList();
        }
        catch (Exception e){
            System.out.println("Check e" + e.toString());
            e.printStackTrace();
            return null;
        }
    }
}
