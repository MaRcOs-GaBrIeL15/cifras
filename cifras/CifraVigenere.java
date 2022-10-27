package cifras;

public class CifraVigenere {
	private String frase;
	private String q;

	public CifraVigenere() {

	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public void decifrar(String frase, String q) {
		String ordem = "abcdefghijklmnopqrstuvwxyz";
		String x = "", tf = "", tq = "";
		int r = 0, v = 0;

		char tabela[][] = new char[ordem.length()][ordem.length()];
		for (int l = 0; l < ordem.length(); l++) {

			for (int c = 0; c < ordem.length(); c++) {
				if (c + l < ordem.length()) {
					tabela[c][l] = ordem.charAt(c + l);
				} else {
					tabela[c][l] = ordem.charAt(c + l - ordem.length());
				}
			}
		}

		String f[] = new String[q.length()];
		for (int l = 0; l < q.length(); l++) {
			f[l] = "";

			for (int c = 0; c < ordem.length(); c++) {
				f[l] = f[l] + tabela[ordem.indexOf(q.charAt(l))][c];
			}

		}
		do {
			if (ordem.contains(tf.valueOf(frase.charAt(r))) && ordem.contains(tq.valueOf(q.charAt(v)))) {

				x = x + ordem.charAt(f[v].indexOf(frase.charAt(r)));
				v++;
				if (v == q.length()) {
					v = 0;
				}
				r++;
			} else {
				x = x + frase.charAt(r);
				r++;
			}
		} while (r < frase.length());

		System.out.println(x);

	}

	public void cifrar(String frase, String q) {
		String ordem = "abcdefghijklmnopqrstuvwxyz";
		String x = "", tf = "", tq = "";
		int r = 0, v = 0;

		char tabela[][] = new char[ordem.length()][ordem.length()];
		for (int l = 0; l < ordem.length(); l++) {

			for (int c = 0; c < ordem.length(); c++) {
				if (c + l < ordem.length()) {
					tabela[c][l] = ordem.charAt(c + l);
				} else {
					tabela[c][l] = ordem.charAt(c + l - ordem.length());
				}
			}
		}

		String f[] = new String[q.length()];
		for (int l = 0; l < q.length(); l++) {
			f[l] = "";

			for (int c = 0; c < ordem.length(); c++) {
				f[l] = f[l] + tabela[ordem.indexOf(q.charAt(l))][c];
			}

		}

		do {
			if (ordem.contains(tf.valueOf(frase.charAt(r))) && ordem.contains(tq.valueOf(q.charAt(v)))) {

				x = x + tabela[ordem.indexOf(frase.charAt(r))][ordem.indexOf(q.charAt(v))];
				v++;
				if (v == q.length()) {
					v = 0;
				}
				r++;
			} else {
				x = x + frase.charAt(r);
				r++;
			}
		} while (r < frase.length());

		System.out.println(x);
	}
}
