import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Désérialisation {
	public static void main(String[] args)throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(Personne.class);
		Unmarshaller um = jc.createUnmarshaller();
		Personne p = (Personne)um.unmarshal(new File("resultat.xml"));
		System.out.println(p.getNom());
		
		System.out.println("******* Liste de personnes *******");
		JAXBContext jc_1 = JAXBContext.newInstance(Personnes.class);
		Unmarshaller ums = jc_1.createUnmarshaller();
		Personnes ps = (Personnes)ums.unmarshal(new File("personnes.xml"));
		System.out.println(ps.getPersonnes());
	}
}
