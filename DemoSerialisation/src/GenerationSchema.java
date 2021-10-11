import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

public class GenerationSchema {
	public static void main(String[] args) throws JAXBException, IOException {
		JAXBContext jc = JAXBContext.newInstance(Personne.class);
		jc.generateSchema(new SchemaOutputResolver() {
			
			@Override
			public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
				File f = new File("personne.xsd");
				StreamResult r = new StreamResult(f);
				return r;
			}
		});
	}
}
