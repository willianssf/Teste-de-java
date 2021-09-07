package entities.view;

public class View {
	
	public void layout() {
		System.out.println("===============================");
		System.out.println("Digite para pesquisar seu livro");
		System.out.println("====== Nome do livro ==========");
		System.out.println("====== Preço ==================");
		System.out.println("====== Autor ==================");
		System.out.println("====== s - Sair ============");
		System.out.println("===============================");
	}
	
	public void ordemCreDec() {
		System.out.println("======== Ordem de preço =======");
		System.out.println("======1 - Crescente ===========");
		System.out.println("======2 - Descrecente =========");
		System.out.println("===============================");
	}
	
	public void escolha() {
		System.out.println("========== Escolha =========");
		System.out.println("===1 - Comprar livro =======");
		System.out.println("===2 - Buscar outro livro ==");
		System.out.println("============================");
	}
	
	public void adicionarLivro() {
		System.out.println("=== Quer comprar mais livros ==");
		System.out.println("============1 - Sim ===========");
		System.out.println("============2 - Nao ===========");
		System.out.println("===============================");
	}
	
	

}
