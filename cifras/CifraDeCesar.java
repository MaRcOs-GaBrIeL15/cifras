package cifras;

public class CifraDeCesar {
	
 
	public CifraDeCesar() {
	 
 }

	public void cifrar(String frase, int chave) {
		String ordem="abcdefghijklmnopqrstuvwxyz", x="", tf="";
		int r=0;
		chave=chave%ordem.length();
		do {
			if(ordem.indexOf(frase.charAt(r))+chave<ordem.length()) {
			
				if(ordem.contains(tf.valueOf(frase.charAt(r)))) {	
			
				x=x+ordem.charAt(ordem.indexOf(frase.charAt(r))+chave);
			
			}else {
				x=x+frase.charAt(r);
			}
			
			}else {
				if(ordem.contains(tf.valueOf(frase.charAt(r)))) {
				x=x+ordem.charAt(ordem.indexOf(frase.charAt(r))+chave-ordem.length());
				}else {
					x=x+frase.charAt(r);
				}
			}

			r++;
			
			}while(r<frase.length());

			System.out.println(x);
		

	}
	
	public void decifrar(String frase, int chave) {
		String ordem="abcdefghijklmnopqrstuvwxyz", x="", tf="";
		int r=0;
		chave=ordem.length()-(chave%ordem.length());
		do {
			if(ordem.indexOf(frase.charAt(r))+chave<ordem.length()) {
			
				if(ordem.contains(tf.valueOf(frase.charAt(r)))) {	
			
				x=x+ordem.charAt(ordem.indexOf(frase.charAt(r))+chave);
			
			}else {
				x=x+frase.charAt(r);
			}
			
			}else {
				if(ordem.contains(tf.valueOf(frase.charAt(r)))) {
				x=x+ordem.charAt(ordem.indexOf(frase.charAt(r))+chave-ordem.length());
				}else {
					x=x+frase.charAt(r);
				}
			}

			r++;
			
			}while(r<frase.length());

			System.out.println(x);
	
	}
		

		
}
