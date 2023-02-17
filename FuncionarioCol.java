package exercicioCollections;

public class FuncionarioCol 
{
	private String nome;
	private double salario;
	protected TelefoneCol Listatel;
	
	public String getNome() {
		return nome;
	}
	public double getSalario() {
		return salario;
	}
	public TelefoneCol getListatel() {
		return Listatel;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setListatel(TelefoneCol listatel) {
		Listatel = listatel;
	}

	public FuncionarioCol(String numero)
	{
		TelefoneCol T = null;
		T.setNumero(numero);
		FuncionarioCol F = null;
		F.setListatel(T);
	}
	
	public FuncionarioCol()
	{
		
	}
}
