package exercicioCollections;
import java.util.Random;
import java.util.ArrayList;

public class PrincipalCol {
	
	public String gerandoNome()
	{
		Random r = new Random();
		String nome="";
		int n=r.nextInt(26)+65;
		char c=(char)n;
		String aux=Character.toString(c);
		nome+=aux;
		for(int i=0;i<19;i++)
		{
			n=r.nextInt(26)+97;
			c=(char)n;
			aux=Character.toString(c);
			nome+=aux;
		}
		return nome;
	}
	
	public double gerandoSalario()
	{
		Random r = new Random();
		String salario = "";
		double sal;
		for(int i=0;i<9;i++)
		{
			int s = r.nextInt(10);
			if(i==0 || i==8)
			{
				while(s==0)
				{
					s = r.nextInt(10);
				}
			}
			salario+=Integer.toString(s);
			if(i==6)
			{
				salario+=".";
			}
		}
		sal= Double.parseDouble(salario);
		return sal;
	}
	
	public String gerandoTel()
	{
		Random r = new Random();
		String numero="";
		int qtde=0;
		
		qtde=r.nextInt(6);
		
		for(int i=0;i<qtde;i++)
		{
			for(int v=0;v<8;v++)
			{
				int n=r.nextInt(10);
				numero+=Integer.toString(n);
			}
			if(i!=qtde-1)
			numero=numero+" - ";
		}
		return numero;
	}

	public static void main(String[] args) 
	{
		ArrayList<FuncionarioCol> lista = new ArrayList<>();
		PrincipalCol aux = new PrincipalCol();
		for(int i=0;i<30;i++)
		{
			FuncionarioCol func = new FuncionarioCol();
			TelefoneCol tel = new TelefoneCol();
			func.setNome(aux.gerandoNome());
			func.setSalario(aux.gerandoSalario());
			tel.setNumero(aux.gerandoTel());
			func.setListatel(tel);
			lista.add(func);
		}		
		
		System.out.println("Lista de funcionários: \n");
		System.out.println("Nome: \t\t\t\tSalário: \n");
		
		for(int i=0;i<lista.size();i++)
        {
			FuncionarioCol auxiliar = new FuncionarioCol();
			TelefoneCol tel = new TelefoneCol();
			auxiliar = lista.get(i);
			tel=auxiliar.getListatel();
        	System.out.println(auxiliar.getNome()+"\t\t"+auxiliar.getSalario()+ "\n" + "Fone:" + tel.getNumero());
        	System.out.println("=====================================================");
        }
	}

}
