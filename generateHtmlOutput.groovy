import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import static org.parosproxy.paros.extension.report.ReportGenerator.fileToHtml;


println "xml file to convert ${args[0]}" 
println "xsl file to use in conversion ${args[1]}"
println "html file to write ${args[2]}"

fileToHtml(args[0], args[1], args[2]);
