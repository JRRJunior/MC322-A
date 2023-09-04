package itens;

public class LivroDigital extends Item {
	//Atributos
	private String formato;
	private String formatoArquivo;
	private String requisitoDeLeitura;
	private String dataDisponibilidade;
	
	//Construtor
	public LivroDigital(String formato, String formatoArquivo, String requisitoDeLeitura, String dataDisponibilidade, String titulo, String autor, String editora, int anoPublicacao, String genero, String sinopse, String capa) {
		super (titulo, autor, editora, anoPublicacao, genero, sinopse, capa);
		this.formato = formato;
		this.formatoArquivo = formatoArquivo;
		this.requisitoDeLeitura = requisitoDeLeitura;
	}
	
	//Getters e setters
	public String getformato() {
		return formato;
	}
	public void setformato(String formato) {
		this.formato = formato;
	}
	
	public String getformatoArquivo() {
		return formatoArquivo;
	}
	public void setformatoArquivo(String formatoArquivo) {
		this.formatoArquivo = formatoArquivo;
	}
	
	public String getrequisitoDeLeitura() {
		return requisitoDeLeitura;
	}
	public void setrequisitoDeLeitura(String requisitoDeLeitura) {
		this.requisitoDeLeitura = requisitoDeLeitura;
	}
	
	public String getdataDisponibilidade() {
		return dataDisponibilidade;
	}
	public void setdataDisponibilidade(String dataDisponibilidade) {
		this.dataDisponibilidade = dataDisponibilidade;
	}
	
	//métodos
			public int numeroDeLicencas() {
				return 0;
			}
			
			public String urlOuLocalDeAcesso() {
				return null;
			}
	
}