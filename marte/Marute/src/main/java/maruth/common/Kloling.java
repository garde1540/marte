package maruth.common;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Kloling {

	public static void main(String[] args) throws Exception {
		String url = "https://wafuri.com";
		Document doc = Jsoup.connect(url).get();
		System.out.println(doc);
		Elements ele = doc.select("tr.text-left");
		
		System.out.println(ele);
		
	}

}
