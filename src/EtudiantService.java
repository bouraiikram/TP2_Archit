import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService {
	
	private IEtudRepo StudRep;
	private IUnivRepo UnivRep;
	private IJournal journal;

	public EtudiantService(IEtudRepo StudRep, IUnivRepo UnivRep, IJournal comp) {{
		this.StudRep = StudRep;
		this.UnivRep = UnivRep;
		this.journal  = comp;   
	}
	
	boolean inscription (Etudiant Stud) throws SQLException	
	{
		Universite univ=UnivRep.GetById(Stud.getId_universite());
	   
		AfficheDateClass.setSender("EtudiantService");
		
		journal.outPut_Msg("Log: début de l'opération d'ajout de l'étudiant avec matricule "+Stud.getMatricule());                   
	     
		if (StudRep.VerifEmailMat(Stud.getMatricule(), Stud.getEmail()))
	    {	return false;	}
		Stud.setNbLivreMensuel_Autorise(UnivRep.GetNbrLivre(univ));

		
		 journal.outPut_Msg("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+Stud.getMatricule());
		
		 StudRep.add(stud);
		 journal.outPut_Msg("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+matricule);
		 return true;
	    
		
	}
	
	
	

public ArrayList<Etudiant> GetEtudiantParUniversitye()
{
    //...
	return new ArrayList<>(4);
}

public ArrayList<Etudiant> GetEtudiatparLivreEmprunte()
{
    //...
	return new ArrayList<>(4);
	
}


	
}
