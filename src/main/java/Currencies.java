import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currencies {

    public static void main(String[] args) throws IOException {
Document doc = Jsoup.connect("https://www.google.com/search?q=%D0%BA%D1%83%D0%BF%D0%B8%D1%82%D1%8C+%D0%B2%D0%B5%D0%BB%D0%BE%D1%81%D0%B8%D0%BF%D0%B5%D0%B4+%D0%B3%D0%BE%D1%80%D0%BD%D1%8B%D0%B9+%D0%BC%D0%BE%D1%81%D0%BA%D0%B2%D0%B5+%D0%B8+%D0%BC%D0%BE%D1%81%D0%BA%D0%BE%D0%B2%D1%81%D0%BA%D0%BE%D0%B9+%D0%BE%D0%B1%D0%BB%D0%B0%D1%81%D1%82%D0%B8+%D0%BC%D0%B0%D0%B3%D0%B0%D0%B7%D0%B8%D0%BD%D1%8B+%D0%B2%D1%81%D0%B5+%D0%BC%D0%B0%D0%B3%D0%B0%D0%B7%D0%B8%D0%BD%D1%8B&sca_esv=a19c4e940f5aec6f&sxsrf=ACQVn08oOJ-mrPwEAk0DnEmtsjFlE_rC5Q%3A1708868814034&ei=zkTbZZTcAdi0wPAPhqm1wAI&udm=&ved=0ahUKEwiU-4K10MaEAxVYGhAIHYZUDSgQ4dUDCBA&oq=%D0%BA%D1%83%D0%BF%D0%B8%D1%82%D1%8C+%D0%B2%D0%B5%D0%BB%D0%BE%D1%81%D0%B8%D0%BF%D0%B5%D0%B4+%D0%B3%D0%BE%D1%80%D0%BD%D1%8B%D0%B9+%D0%BC%D0%BE%D1%81%D0%BA%D0%B2%D0%B5+%D0%B8+%D0%BC%D0%BE%D1%81%D0%BA%D0%BE%D0%B2%D1%81%D0%BA%D0%BE%D0%B9+%D0%BE%D0%B1%D0%BB%D0%B0%D1%81%D1%82%D0%B8+%D0%BC%D0%B0%D0%B3%D0%B0%D0%B7%D0%B8%D0%BD%D1%8B+%D0%B2%D1%81%D0%B5+%D0%BC%D0%B0%D0%B3%D0%B0%D0%B7%D0%B8%D0%BD%D1%8B&gs_lp=Egxnd3Mtd2l6LXNlcnAiiQHQutGD0L_QuNGC0Ywg0LLQtdC70L7RgdC40L_QtdC0INCz0L7RgNC90YvQuSDQvNC-0YHQutCy0LUg0Lgg0LzQvtGB0LrQvtCy0YHQutC-0Lkg0L7QsdC70LDRgdGC0Lgg0LzQsNCz0LDQt9C40L3RiyDQstGB0LUg0LzQsNCz0LDQt9C40L3Ri0gAUABYAHAAeAGQAQCYAQCgAQCqAQC4AQzIAQD4AQGYAgCgAgCYAwCSBwA&sclient=gws-wiz-serp").get();
        Elements namesShop = doc.getElementsByAttributeValue("class", "byrV5b");
        //System.out.println(namesShop.toString());
//namesShop.forEach(nameShop -> System.out.println(nameShop.attr("class", "qLRx3b tjvcx GvPZzd cHaqb").text()));
        for (int i = 0; i<namesShop.size(); i++) {
            System.out.println(namesShop.get(0).text());
        }
    }
    //class="qLRx3b tjvcx GvPZzd cHaqb"
}









