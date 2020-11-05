
public class Program {

	public static void main(String[] args) {

		String title = "Uso de biosurfactantes na recuperação de óleo de milho pós-fermentação.";

		Long idFake = 10L;

		String reducedTitle = "";
		StringBuilder builder = new StringBuilder();

		try {
			// if the sentence is less than 20 characters throws exception
			reducedTitle = title.substring(0, 20);

			builder.append(idFake).append(" - ").append(reducedTitle).append(" ...");

			reducedTitle = builder.toString();

		} catch (Exception e) {
			builder.append(idFake).append(" - ").append(title);

			reducedTitle = builder.toString();
		}		
	}
}
