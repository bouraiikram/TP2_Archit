import java.sql.SQLException;
package Interface;
import Class.Universite;

public interface IUnivRepo {
	abstract Universite GetById(int universityId) throws SQLException;

	abstract public int GetNbrLivre(int IdUniv) throws SQLException;
	abstract public int NbrBonus(int IdUniv) throws SQLException;
	
}