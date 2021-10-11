import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Sérialisation {
	
	public static void main(String[] args)throws JAXBException{
		JAXBContext jc = JAXBContext.newInstance(Personne.class);
		Personne p_1 = new Personne("Bernardelli", "Stéphane", new Date(17,12,1999));
		Marshaller m = jc.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(p_1, new File("resultat.xml"));	
		
		System.out.println("******* Liste de personnes *******");
		JAXBContext jc_1 = JAXBContext.newInstance(Personnes.class);
		Personnes ps = new Personnes();
		ps.getPersonnes().add(new Personne("A","B",new Date(1,1,1990)));
		ps.getPersonnes().add(new Personne("C","D",new Date(1,1,1990)));
		ps.getPersonnes().add(new Personne("E","F",new Date(1,1,1990)));
		ps.getPersonnes().add(new Personne("G","H",new Date(1,1,1990)));
		ps.getPersonnes().add(new Personne("I","J",new Date(1,1,1990)));
		ps.getPersonnes().add(new Personne("K","L",new Date(1,1,1990)));
		
		Marshaller ms = jc_1.createMarshaller();
		ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		ms.marshal(ps, new File("personnes.xml"));
	}
}