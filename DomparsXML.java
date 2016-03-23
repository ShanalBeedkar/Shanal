/**
 * 
 */
package parse_xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;
import org.w3c.dom.NodeList;

/**
 * @author SBeedkar
 *
 */
public class DomparsXML {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 try {	
	         //File inputFile = new File("D:/java_ass/users.xml");
	         File inputFile = new File("../users.xml");
	         DocumentBuilderFactory dbFactory 
	            = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         //ref:doc
	         doc.getDocumentElement().normalize();
	         
	         System.out.println("Root element :" 
	            + doc.getDocumentElement().getNodeName());
	         
	         
	         
	         
	         NodeList nList = doc.getElementsByTagName("ROW");
	    
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	           // System.out.println("\nCurrent Element :"+ nNode.getNodeName());
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println(eElement.getFirstChild().getNodeName());
	           
	            }
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		// TODO Auto-generated method stub

	}

}
