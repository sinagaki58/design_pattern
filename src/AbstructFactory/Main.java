package AbstructFactory;

import AbstructFactory.factory.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com");
        Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp");
        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");

        Tray trayNews = factory.createTray("新聞");
        trayNews.add(asahi);
        trayNews.add(yomiuri);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);

        Page page = factory.createPage("LinkPage", "結城");
        page.add(trayNews);
        page.add(trayyahoo);
        page.outout();
    }
}
