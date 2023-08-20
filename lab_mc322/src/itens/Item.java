package itens;

public class Item {
	//atributos
	public String itemSolicitado;
	public String disponibilidade;
	
	public Item(String itemSolicitado, String disponibilidade) {
		this.itemSolicitado = itemSolicitado;
		this.disponibilidade = disponibilidade;
	}
	
	//getters e setters
	public String getitemSolicitado() {
		return itemSolicitado;
	}
	public void setitemSolicitado(String itemSolicitado) {
		this.itemSolicitado = itemSolicitado;
	}
	
	public String getdisponibilidade() {
		return disponibilidade;
	}
	public void setdisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

}
