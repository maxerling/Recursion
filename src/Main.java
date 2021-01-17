import java.util.ArrayList;
import java.util.List;


public class Main {

    Main() {
        List<String> list = new ArrayList<>();
        System.out.println(getUnderlings("Räven", getNodeStructure(), list));
    }

    public static void main(String[] args) {
        new Main();
    }

    public static List<String> getUnderlings(String name, Node rootNode, List<String> list) {
        for (Node node : rootNode.next()) {
            if (rootNode.getData().equals(name)) {
                list.add(node.getData());
                getUnderlings(node.getData(), node, list);

            } else {
                getUnderlings(name, node, list);
            }
        }

        return list;
    }


    public static Node getNodeStructure() {

        Node tomten = new Node("Tomten");
        Node glader = new Node("Glader");
        Node butter = new Node("Butter");
        tomten.add(glader);
        tomten.add(butter);

        Node tröger = new Node("Tröger");
        Node trötter = new Node("Trötter");
        Node blyger = new Node("Blyger");
        glader.add(tröger);
        glader.add(trötter);
        glader.add(blyger);

        Node rådjuret = new Node("Rådjuret");
        Node nyckelpigan = new Node("Nyckelpígan");
        Node haren = new Node("Haren");
        Node räven = new Node("Räven");
        butter.add(rådjuret);
        butter.add(nyckelpigan);
        butter.add(haren);
        butter.add(räven);

        Node skumtomten = new Node("Skumtomten");
        trötter.add(skumtomten);

        Node dammråttan = new Node("Dammråttan");
        skumtomten.add(dammråttan);

        Node gråsuggan = new Node("Gråsuggan");
        Node myran = new Node("Myran");
        räven.add(gråsuggan);
        räven.add(myran);

        Node bladlusen = new Node("Bladlusen");
        myran.add(bladlusen);

        return tomten;
    }
}

