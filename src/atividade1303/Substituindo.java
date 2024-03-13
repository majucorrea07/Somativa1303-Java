package atividade1303;

public class Substituindo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String espacos = "ispaços";
		String corrigir = espacos.replace("i", "e");
		
		String todosEspacos="e s p a ç o";
		String tiraespacos = todosEspacos.replaceAll(" ", "");
		
		System.out.println("Antes: "+ espacos +" Depois: " + corrigir);
		System.out.println("Antes: "+ todosEspacos +" Depois: " + tiraespacos);
		
		

	}

}
