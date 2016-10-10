package Bridge.sample01;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtilPen {
    public static Object getBean(String args) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("./src/Bridge/Proxy.sample01/configPen.xml"));

            NodeList nodeList = doc.getElementsByTagName("className");
            Node classNode = null;
            if(args.equals("color"))
            {
                classNode = nodeList.item(0).getFirstChild();
            } else if(args.equals("pen"))
            {
                classNode = nodeList.item(1).getFirstChild();
            }
            String className = classNode.getNodeValue();
            String packageName = XMLUtilPen.class.getPackage().getName();

            Class c = Class.forName(packageName + "." + className);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
